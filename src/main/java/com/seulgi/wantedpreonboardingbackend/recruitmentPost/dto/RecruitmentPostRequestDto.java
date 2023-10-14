package com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto;

import lombok.Getter;

@Getter
public class RecruitmentPostRequestDto {
  private Long companyId;
  private String position;
  private Long reward;
  private String content;
  private String skills;

}
