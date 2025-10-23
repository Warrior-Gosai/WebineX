package com.warrior.webinex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.warrior.webinex.model.Registration;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

    List<Registration> findByWebinarId(Long webinarId);

    List<Registration> findByUserId(Long userId);

    boolean existsByWebinarIdAndUserId(Long webinarId, Long userId);

}
