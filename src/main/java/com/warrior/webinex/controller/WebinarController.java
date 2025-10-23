package com.warrior.webinex.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.warrior.webinex.model.Webinar;
import com.warrior.webinex.service.WebinarService;

@RestController
@RequestMapping("/api/webinars")
public class WebinarController {

    @Autowired
    private WebinarService webinarService;

    @PostMapping
    public ResponseEntity<Webinar> createWebinar(@RequestBody Webinar webinar) {
        return ResponseEntity.ok(webinarService.createWebinar(webinar));
    }

    @GetMapping
    public ResponseEntity<List<Webinar>> getAllWebinars() {
        return ResponseEntity.ok(webinarService.getAllWebinars());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Webinar>> getWebinarById(@PathVariable Long id) {
        return ResponseEntity.ok(webinarService.getWebinarById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Webinar> updateWebinarById(@PathVariable Long id, @RequestBody Webinar webinar) {
        return ResponseEntity.ok(webinarService.updateWebinar(id, webinar));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWebinar(@PathVariable Long id) {
        webinarService.deleteWebinar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/upcoming")
    public ResponseEntity<List<Webinar>> getAllUpcomingWebinar() {
        return ResponseEntity.ok(webinarService.getUpcomingWebinars());
    }

    @GetMapping("/search")
    public ResponseEntity<List<Webinar>> searchWebinar(@RequestParam String keyword) {
        return ResponseEntity.ok(webinarService.searchWebinars(keyword));
    }

    @GetMapping("/host/{hostId}")
    public ResponseEntity<List<Webinar>> getWebinarsByHost(@PathVariable Long hostId) {
        return ResponseEntity.ok(webinarService.getWebinarsByHost(hostId));
    }

}
