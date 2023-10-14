package com.seulgi.wantedpreonboardingbackend.User;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public User findUser(Long id) {
    return userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("존재하지 않는 사용자입니다."));
  }
}
