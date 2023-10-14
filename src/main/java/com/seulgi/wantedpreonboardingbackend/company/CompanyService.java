package com.seulgi.wantedpreonboardingbackend.company;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    public Company getCompany(Long id) {
      return companyRepository.findById(id)
          .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 회사입니다."));
    }
}
