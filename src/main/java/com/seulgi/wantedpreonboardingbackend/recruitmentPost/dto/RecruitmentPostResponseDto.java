package com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto;

import com.seulgi.wantedpreonboardingbackend.recruitmentPost.RecruitmentPost;
import lombok.Getter;

@Getter
public class RecruitmentPostResponseDto {

  private Long id;
  private String  companyName;
  private String position;
  private Long reward;
  private String content;
  private String skills;

  public RecruitmentPostResponseDto(RecruitmentPost recruitmentPost) {
    this.id = recruitmentPost.getId();
    this.companyName = recruitmentPost.getCompany().getCompanyName();
    this.position = recruitmentPost.getPosition();
    this.reward = recruitmentPost.getReward();
    this.content = recruitmentPost.getContent();
    this.skills = recruitmentPost.getSkill();
  }
}
