package com.seulgi.wantedpreonboardingbackend.recruitmentPost.repository;

import com.seulgi.wantedpreonboardingbackend.company.Company;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.RecruitmentPost;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruitmentPostRepository extends JpaRepository<RecruitmentPost, Long>, RecruitmentPostRepositoryQuery {
  List<RecruitmentPost> findAllByCompany(Company company);
}
