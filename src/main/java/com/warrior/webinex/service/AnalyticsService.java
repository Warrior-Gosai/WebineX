package com.warrior.webinex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warrior.webinex.model.Analytics;
import com.warrior.webinex.repository.AnalyticsRepository;

@Service
public class AnalyticsService {

    @Autowired
    private AnalyticsRepository analyticsRepository;

    // Create Analytics for webinar
    public Analytics createAnalytics(Analytics analytics) {
        return analyticsRepository.save(analytics);
    }

    // Get Analytics by Webinar ID
    public List<Analytics> getAnalyticsByWebinarId(Long webinarId) {
        return analyticsRepository.findByWebinarId(webinarId);
    }
}
