package com.warrior.webinex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.warrior.webinex.model.Analytics;
import com.warrior.webinex.service.AnalyticsService;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    @PostMapping
    public ResponseEntity<Analytics> createAnalytics(@RequestBody Analytics analytics) {
        return ResponseEntity.status(201).body(analyticsService.createAnalytics(analytics));
    }

    @GetMapping("/webinar/{webinarId}")
    public ResponseEntity<List<Analytics>> getAnalyticsByWebinarId(@PathVariable Long webinarId) {
        return ResponseEntity.ok(analyticsService.getAnalyticsByWebinarId(webinarId));
    }
}
