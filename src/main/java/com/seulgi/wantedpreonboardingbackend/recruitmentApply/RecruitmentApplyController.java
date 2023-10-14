package com.seulgi.wantedpreonboardingbackend.recruitmentApply;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/recruitment-apply")
public class RecruitmentApplyController {

  private final RecruitmentApplyService recruitmentApplyService;

  @PostMapping
  public RecruitmentApplyResponseDto createRecruitmentApply(@RequestBody RecruitmentApplyRequestDto requestDto) {
    return recruitmentApplyService.createRecruitmentApply(requestDto);
  }
}
