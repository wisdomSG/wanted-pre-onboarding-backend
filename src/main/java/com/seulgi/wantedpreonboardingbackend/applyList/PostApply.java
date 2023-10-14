package com.seulgi.wantedpreonboardingbackend.applyList;

import com.seulgi.wantedpreonboardingbackend.common.User;
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
public class PostApply {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "recruitment_post_id")
  private RecruitmentPost recruitmentPost;

}
