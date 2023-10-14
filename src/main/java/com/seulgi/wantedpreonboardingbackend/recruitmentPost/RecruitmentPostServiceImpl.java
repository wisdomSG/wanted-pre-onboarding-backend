package com.seulgi.wantedpreonboardingbackend.recruitmentPost;

import com.seulgi.wantedpreonboardingbackend.company.Company;
import com.seulgi.wantedpreonboardingbackend.company.CompanyService;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostDetailResponseDto;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostListResponseDto;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostRequestDto;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostResponseDto;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.repository.RecruitmentPostRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RecruitmentPostServiceImpl implements RecruitmentPostService{

  private final RecruitmentPostRepository recruitmentPostRepository;
  private final CompanyService companyService;
  @Override
  public RecruitmentPostResponseDto createRecruitmentPost(RecruitmentPostRequestDto requestDto) {
    Company company = companyService.getCompany(requestDto.getCompanyId());
    RecruitmentPost recruitmentPost = new RecruitmentPost(requestDto, company);

    recruitmentPostRepository.save(recruitmentPost);

    return new RecruitmentPostResponseDto(recruitmentPost);
  }

  @Override
  @Transactional
  public RecruitmentPostResponseDto updateRecruitmentPost(RecruitmentPostRequestDto requestDto,
      Long recruitmentPostId) {
    RecruitmentPost recruitmentPost = findRecruitmentPost(recruitmentPostId);

    if(!recruitmentPost.getCompany().getId().equals(requestDto.getCompanyId())) {
      throw  new IllegalArgumentException("회사가 일치하지 않습니다.");
    }

    recruitmentPost.setContent(requestDto.getContent());
    recruitmentPost.setSkill(requestDto.getSkills());
    recruitmentPost.setPosition(requestDto.getPosition());
    recruitmentPost.setReward(requestDto.getReward());

    return new RecruitmentPostResponseDto(recruitmentPost);
  }

  @Override
  @Transactional
  public void deleteRecruitmentPost(Long recruitmentPostId) {
    RecruitmentPost recruitmentPost = findRecruitmentPost(recruitmentPostId);
    recruitmentPostRepository.delete(recruitmentPost);
  }

  @Override
  public List<RecruitmentPostListResponseDto> getAllRecruitmentPost() {
    return recruitmentPostRepository.findAll()
        .stream()
        .map(RecruitmentPostListResponseDto::new)
        .collect(Collectors.toList());
  }

  @Override
  public List<RecruitmentPostResponseDto> getSearchRecruitmentPost(String keyword) {
    return recruitmentPostRepository.searchRecruitmentPost(keyword)
        .stream()
        .map(RecruitmentPostResponseDto::new)
        .collect(Collectors.toList());
  }

  @Override
  public RecruitmentPostDetailResponseDto getRecruitmentPost(Long recruitmentPostId) {
    RecruitmentPost recruitmentPost = findRecruitmentPost(recruitmentPostId);
    Company company = companyService.getCompany(recruitmentPost.getCompany().getId());
    List<Long> otherRecuritList= recruitmentPostRepository
        .findAllByCompany(company)
        .stream()
        .map(RecruitmentPost::getId)
        .toList();
    return new RecruitmentPostDetailResponseDto(recruitmentPost, otherRecuritList);
  }

  @Override
  public RecruitmentPost findRecruitmentPost(Long id) {
    return recruitmentPostRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("채용공고를 찾을 수 없습니다."));
  }
}
