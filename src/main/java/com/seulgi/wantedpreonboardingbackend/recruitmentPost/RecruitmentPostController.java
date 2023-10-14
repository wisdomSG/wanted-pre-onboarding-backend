package com.seulgi.wantedpreonboardingbackend.recruitmentPost;


import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostDetailResponseDto;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostListResponseDto;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostRequestDto;
import com.seulgi.wantedpreonboardingbackend.recruitmentPost.dto.RecruitmentPostResponseDto;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/recruitment-posts")
public class RecruitmentPostController {

  private final RecruitmentPostService postService;

  @PostMapping
  public RecruitmentPostResponseDto createRecruitmentPost(@RequestBody RecruitmentPostRequestDto requestDto) {
    return postService.createRecruitmentPost(requestDto);
  }

  @PutMapping("/{recruitmentPostId}")
  public RecruitmentPostResponseDto updateRecruitmentPost(@RequestBody RecruitmentPostRequestDto requestDto, @PathVariable Long recruitmentPostId) {
    return postService.updateRecruitmentPost(requestDto, recruitmentPostId);
  }

  @DeleteMapping("/{recruitmentPostId}")
  public ResponseEntity<String> deleteRecruitmentPost(@PathVariable Long recruitmentPostId) {
    postService.deleteRecruitmentPost(recruitmentPostId);
    return ResponseEntity.status(HttpStatus.OK).body("채용공고가 삭제되었습니다.");
  }

  @GetMapping
  public List<RecruitmentPostListResponseDto> getAllRecruitmentPost() {
    return postService.getAllRecruitmentPost();
  }

  @GetMapping("/{recruitmentPostId}")
  public RecruitmentPostDetailResponseDto getRecruitmentPost(@PathVariable Long recruitmentPostId) {
    return postService.getRecruitmentPost(recruitmentPostId);
  }
}
