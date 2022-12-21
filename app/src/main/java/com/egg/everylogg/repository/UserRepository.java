package com.egg.everylogg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tteokbokki.everylog.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(Long id);

    Optional<User> findByUserId(String userId);
}
