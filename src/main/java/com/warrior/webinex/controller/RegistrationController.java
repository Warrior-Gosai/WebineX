package com.warrior.webinex.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.warrior.webinex.model.Registration;
import com.warrior.webinex.service.RegistrationService;

@RestController
@RequestMapping("/api/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping
    public ResponseEntity<Registration> registerForWebinar(@RequestBody Registration registration) {
        return ResponseEntity.ok(registrationService.registerForWebinar(registration));
    }

    @GetMapping("/webinar/{webinarId}")
    public ResponseEntity<List<Registration>> getRegistrationByWebinar(@PathVariable Long webinarId) {
        return ResponseEntity.ok(registrationService.getRegistrationByWebinarId(webinarId));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Registration>> getRegistrationByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(registrationService.getRegistrationsByUserId(userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Registration>> getRegistrationById(@PathVariable Long id) {
        return ResponseEntity.ok(registrationService.getRegistrationsById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRegistrationById(@PathVariable Long id) {
        registrationService.cancelRegistration(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/check")
    public ResponseEntity<Boolean> isUserRegistered(@RequestParam Long webinarId, @RequestParam Long userId) {
        return ResponseEntity.ok(registrationService.isUserRegistered(webinarId, userId));
    }

}
