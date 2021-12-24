package com.scope.socialboardweb.repository;

import com.scope.socialboardweb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByAccountId(String accountId);
    Optional<User> findByPhoneNumber(String phoneNumber);
    Optional<User> findByNickname(String nickname);
//    boolean existsByAccountId(String accountId);
}

