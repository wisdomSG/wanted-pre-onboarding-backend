package com.seulgi.wantedpreonboardingbackend.recruitmentApply;

import com.seulgi.wantedpreonboardingbackend.User.User;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.RecruitmentPost;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "recruitment_applies")
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
