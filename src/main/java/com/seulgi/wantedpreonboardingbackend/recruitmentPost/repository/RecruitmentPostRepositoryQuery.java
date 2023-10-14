package com.seulgi.wantedpreonboardingbackend.recruitmentPost.repository;

import com.seulgi.wantedpreonboardingbackend.recruitmentPost.RecruitmentPost;
import java.util.List;

public interface RecruitmentPostRepositoryQuery {
  List<RecruitmentPost> searchRecruitmentPost(String keyword);

}
