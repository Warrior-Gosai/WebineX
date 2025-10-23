package com.warrior.webinex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warrior.webinex.model.Invitation;
import com.warrior.webinex.repository.InvitationRepository;

@Service
public class InvitationService {

    @Autowired
    private InvitationRepository invitationRepository;

    // Send / Save Invitation
    public Invitation sendInvitation(Invitation invitation) {
        return invitationRepository.save(invitation);
    }

    // Get Invitation By ID
    public Optional<Invitation> getInvitationById(Long id) {
        return invitationRepository.findById(id);
    }

    // Get Invitation By Webinar Id
    public List<Invitation> getInvitationByWebinarId(Long webinarId) {
        return invitationRepository.findByWebinarId(webinarId);
    }

    // Update Invitation Status
    public Invitation updateInvitation(Long id, String status) {
        Invitation existingInvitation = invitationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Invitation ID is not found :( " + id));

        return invitationRepository.save(existingInvitation);
    }
}