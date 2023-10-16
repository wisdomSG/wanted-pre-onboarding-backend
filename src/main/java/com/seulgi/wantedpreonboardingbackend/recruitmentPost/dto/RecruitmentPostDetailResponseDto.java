package com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto;

import com.seulgi.wantedpreonboardingbackend.recruitmentPost.RecruitmentPost;
import java.util.List;

public class RecruitmentPostDetailResponseDto {
  private Long id;
  private String  companyName;
  private String country;
  private String region;
  private String position;
  private Long reward;
  private String content;
  private String skills;
  private List<Long> otherRecuritList;

  public RecruitmentPostDetailResponseDto(RecruitmentPost recruitmentPost, List<Long> otherRecuritList) {
    this.id = recruitmentPost.getId();
    this.companyName = recruitmentPost.getCompany().getCompanyName();
    this.country = recruitmentPost.getCompany().getCountry();
    this.region = recruitmentPost.getCompany().getRegion();
    this.position = recruitmentPost.getPosition();
    this.reward = recruitmentPost.getReward();
    this.content = recruitmentPost.getContent();
    this.skills = recruitmentPost.getSkill();
    this.otherRecuritList = otherRecuritList;
  }
}
