package com.seulgi.wantedpreonboardingbackend.recruitmentApply;

import com.seulgi.wantedpreonboardingbackend.User.User;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.RecruitmentPost;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruitmentApplyRepository extends JpaRepository<RecruitmentApply, Long> {
  Optional<RecruitmentApply> findByUserAndRecruitmentPost(User user, RecruitmentPost recruitmentPost);
}
