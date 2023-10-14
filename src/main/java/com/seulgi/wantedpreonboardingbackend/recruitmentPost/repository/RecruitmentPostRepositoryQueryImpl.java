package com.seulgi.wantedpreonboardingbackend.recruitmentPost.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.QRecruitmentPost;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.RecruitmentPost;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class RecruitmentPostRepositoryQueryImpl implements RecruitmentPostRepositoryQuery{

  private final JPAQueryFactory jpaQueryFactory;
  private QRecruitmentPost recruitmentPost = QRecruitmentPost.recruitmentPost;

  @Override
  public List<RecruitmentPost> searchRecruitmentPost(String keyword) {
    return jpaQueryFactory.selectFrom(recruitmentPost)
        .where(recruitmentPost.position.contains(keyword)
            .or(recruitmentPost.content.contains(keyword))
            .or(recruitmentPost.skill.contains(keyword))
            .or(recruitmentPost.company.companyName.contains(keyword)))
        .fetch();
  }
}
