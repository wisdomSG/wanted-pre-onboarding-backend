package com.seulgi.wantedpreonboardingbackend.recruitmentApply;

public class RecruitmentApplyResponseDto {
  private Long recruitmentPostId;
  private Long userId;

  public RecruitmentApplyResponseDto(RecruitmentApply recruitmentApply) {
    this.recruitmentPostId = recruitmentApply.getRecruitmentPost().getId();
    this.userId = recruitmentApply.getUser().getId();
  }
}
