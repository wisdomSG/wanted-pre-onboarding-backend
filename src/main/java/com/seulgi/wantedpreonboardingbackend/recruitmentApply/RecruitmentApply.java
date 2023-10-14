package com.seulgi.wantedpreonboardingbackend.recruitmentApply;

import com.seulgi.wantedpreonboardingbackend.User.User;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.RecruitmentPost;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class RecruitmentApply {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "recruitment_post_id")
  private RecruitmentPost recruitmentPost;

  public RecruitmentApply(User user, RecruitmentPost recruitmentPost) {
    this.user = user;
    this.recruitmentPost = recruitmentPost;
  }
}
