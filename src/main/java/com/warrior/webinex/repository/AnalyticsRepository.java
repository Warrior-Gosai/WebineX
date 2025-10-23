package com.warrior.webinex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warrior.webinex.model.Analytics;

public interface AnalyticsRepository extends JpaRepository<Analytics, Long> {

    List<Analytics> findByWebinarId(Long webinarId);

}
