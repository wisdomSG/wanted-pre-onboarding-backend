package com.seulgi.wantedpreonboardingbackend.recruitmentPost;

import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostDetailResponseDto;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostListResponseDto;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostRequestDto;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostResponseDto;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface RecruitmentPostService {

  RecruitmentPostResponseDto createRecruitmentPost(RecruitmentPostRequestDto requestDto);

  RecruitmentPostResponseDto updateRecruitmentPost(RecruitmentPostRequestDto requestDto, Long recruitmentPostId);

  void deleteRecruitmentPost(Long recruitmentPostId);

  List<RecruitmentPostListResponseDto> getAllRecruitmentPost();

  List<RecruitmentPostResponseDto> getSearchRecruitmentPost(String keyword);
  RecruitmentPostDetailResponseDto getRecruitmentPost(Long recruitmentPostId);

  RecruitmentPost findRecruitmentPost(Long id);
}
