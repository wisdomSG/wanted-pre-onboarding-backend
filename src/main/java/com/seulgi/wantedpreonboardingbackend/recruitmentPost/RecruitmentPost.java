package com.seulgi.wantedpreonboardingbackend.recruitmentPost;

import com.seulgi.wantedpreonboardingbackend.company.Company;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostRequestDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "recruitment_posts")
public class RecruitmentPost {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String position;

  private Long reward;

  private String content;

  private String skill;

  @ManyToOne
  @JoinColumn(name = "company_id")
  private Company company;

  public RecruitmentPost(RecruitmentPostRequestDto requestDto,
      Company company) {
    this.position = requestDto.getPosition();
    this.reward = requestDto.getReward();
    this.content = requestDto.getContent();
    this.skill = requestDto.getSkills();
    this.company = company;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public void setReward(Long reward) {
    this.reward = reward;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }
}
