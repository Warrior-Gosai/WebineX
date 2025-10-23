package com.warrior.webinex.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.warrior.webinex.model.Invitation;
import com.warrior.webinex.service.InvitationService;

@RestController
@RequestMapping("/api/invitations")
public class InvitationController {

    @Autowired
    private InvitationService invitationService;

    @PostMapping
    public ResponseEntity<Invitation> sendInvitation(@RequestBody Invitation invitation) {
        return ResponseEntity.ok(invitationService.sendInvitation(invitation));
    }

    @GetMapping("/webinar/{webinarId}")
    public ResponseEntity<List<Invitation>> getInvitationByWebinarId(@PathVariable Long webinarId) {
        return ResponseEntity.ok(invitationService.getInvitationByWebinarId(webinarId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Invitation>> getInvitationById(@PathVariable Long id) {
        return ResponseEntity.ok(invitationService.getInvitationById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Invitation> updateInvitation(@PathVariable Long id, @RequestParam String status) {
        return ResponseEntity.ok(invitationService.updateInvitation(id, status));
    }
}
