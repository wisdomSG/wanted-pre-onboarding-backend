package com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto;

import com.seulgi.wantedpreonboardingbackend.recruitmentPost.RecruitmentPost;
import java.util.List;

public class RecruitmentPostListResponseDto {
  private Long id;
  private String  companyName;

  private String country;

  private String region;
  private String position;
  private Long reward;
  private String skills;

  public RecruitmentPostListResponseDto(RecruitmentPost recruitmentPost) {
    this.id = recruitmentPost.getId();
    this.companyName = recruitmentPost.getCompany().getCompanyName();
    this.country = recruitmentPost.getCompany().getCountry();
    this.region = recruitmentPost.getCompany().getRegion();
    this.position = recruitmentPost.getPosition();
    this.reward = recruitmentPost.getReward();
    this.skills = recruitmentPost.getSkill();
  }
}
