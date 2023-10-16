package com.seulgi.wantedpreonboardingbackend.recruitmentApply;

import lombok.Getter;
import lombok.Setter;

@Getter
public class RecruitmentApplyResponseDto {
  private Long recruitmentPostId;
  private Long userId;

  public RecruitmentApplyResponseDto(RecruitmentApply recruitmentApply) {
    this.recruitmentPostId = recruitmentApply.getRecruitmentPost().getId();
    this.userId = recruitmentApply.getUser().getId();
  }
}
