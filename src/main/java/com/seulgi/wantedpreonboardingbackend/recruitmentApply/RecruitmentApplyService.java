package com.seulgi.wantedpreonboardingbackend.recruitmentApply;

import com.seulgi.wantedpreonboardingbackend.User.User;
import com.seulgi.wantedpreonboardingbackend.User.UserService;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.RecruitmentPost;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.RecruitmentPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecruitmentApplyService {

  private final RecruitmentApplyRepository recruitmentApplyRepository;
  private final RecruitmentPostService recruitmentPostService;
  private final UserService userService;

  public RecruitmentApplyResponseDto createRecruitmentApply(RecruitmentApplyRequestDto requestDto) {
    RecruitmentPost recruitmentPost = recruitmentPostService.findRecruitmentPost(
        requestDto.getRecruitmentPostId());

    User user = userService.findUser(requestDto.getUserId());

    if(recruitmentApplyRepository.findByUserAndRecruitmentPost(user, recruitmentPost).isPresent()) {
      throw new IllegalArgumentException("1개의 채용공고에 한번만 지원하실 수 있습니다.");
    }

    RecruitmentApply recruitmentApply = new RecruitmentApply(user, recruitmentPost);
    recruitmentApplyRepository.save(recruitmentApply);

    return new RecruitmentApplyResponseDto(recruitmentApply);
  }
}
