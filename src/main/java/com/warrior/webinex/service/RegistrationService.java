package com.warrior.webinex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warrior.webinex.model.Registration;
import com.warrior.webinex.repository.RegistrationRepository;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    // Register user for webinar
    public Registration registerForWebinar(Registration registration) {
        return registrationRepository.save(registration);
    }

    // list all attendees for a webinar
    public List<Registration> getRegistrationByWebinarId(Long webinarId) {
        return registrationRepository.findByWebinarId(webinarId);
    }

    // get list all webinars attended by user
    public List<Registration> getRegistrationsByUserId(Long userId) {
        return registrationRepository.findByUserId(userId);
    }

    // get list of info by registration id
    public Optional<Registration> getRegistrationsById(Long id) {
        return registrationRepository.findById(id);
    }

    // for cancel registration webinar
    public void cancelRegistration(Long id) {
        registrationRepository.deleteById(id);
    }

    // Check for User is registered or not
    public boolean isUserRegistered(Long webinarId, Long userId) {
        return registrationRepository.existsByWebinarIdAndUserId(webinarId, userId);
    }
}
