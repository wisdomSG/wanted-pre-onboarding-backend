package com.seulgi.wantedpreonboardingbackend.recruitmentPost;

import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostDetailResponseDto;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostListResponseDto;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostRequestDto;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostResponseDto;

import java.util.List;

public interface RecruitmentPostService {
  /**
   * 채용공고 생성
   * @param requestDto
   * @return
   */
  RecruitmentPostResponseDto createRecruitmentPost(RecruitmentPostRequestDto requestDto);

  /**
   * 채용공고 수정
   * @param requestDto
   * @param recruitmentPostId
   * @return
   */
  RecruitmentPostResponseDto updateRecruitmentPost(RecruitmentPostRequestDto requestDto, Long recruitmentPostId);

  /**
   * 채용공고 삭제
   * @param recruitmentPostId
   */
  void deleteRecruitmentPost(Long recruitmentPostId);

  /**
   * 채용공고 전체조회
   * @return
   */
  List<RecruitmentPostListResponseDto> getAllRecruitmentPost();

  /**
   * 채용공고 조건 검색
   * @param keyword
   * @return
   */
  List<RecruitmentPostResponseDto> getSearchRecruitmentPost(String keyword);

  /**
   * 채용공고 단 건 조회
   * @param recruitmentPostId
   * @return
   */
  RecruitmentPostDetailResponseDto getRecruitmentPost(Long recruitmentPostId);

  /**
   * 채용공고 찾기
   * @param id
   * @return
   */
  RecruitmentPost findRecruitmentPost(Long id);
}
