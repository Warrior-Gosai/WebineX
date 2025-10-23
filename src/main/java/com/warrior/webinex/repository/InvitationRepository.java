package com.warrior.webinex.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.warrior.webinex.model.Invitation;

public interface InvitationRepository extends JpaRepository<Invitation, Long> {

    List<Invitation> findByWebinarId(Long webinarId);

}