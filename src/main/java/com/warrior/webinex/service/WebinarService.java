package com.warrior.webinex.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warrior.webinex.model.Webinar;
import com.warrior.webinex.repository.WebinarRepository;

@Service
public class WebinarService {

    @Autowired
    private WebinarRepository webinarRepository;

    // Create new webinar
    public Webinar createWebinar(Webinar webinar) {
        return webinarRepository.save(webinar);
    }

    // Get All Webinar
    public List<Webinar> getAllWebinars() {
        return webinarRepository.findAll();
    }

    // Get Specific webinar by id
    public Optional<Webinar> getWebinarById(Long id) {
        return webinarRepository.findById(id);
    }

    // Update webinar info
    public Webinar updateWebinar(Long id, Webinar webinar) {
        webinar.setId(id);
        return webinarRepository.save(webinar);
    }

    // Delete Webinar by id
    public void deleteWebinar(Long id) {
        webinarRepository.deleteById(id);
    }

    // Find Webinar by Host ID
    public List<Webinar> getWebinarsByHost(Long hostId) {
        return webinarRepository.findByHostId(hostId);
    }

    // Get Upcoming Webinar List
    public List<Webinar> getUpcomingWebinars() {
        return webinarRepository.findByStartTimeAfterAndStatus(LocalDateTime.now(), "scheduled");
    }

    // Search webinar by using title or description
    public List<Webinar> searchWebinars(String keyword) {
        return webinarRepository.findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(keyword, keyword);
    }
}
