package com.warrior.webinex.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.warrior.webinex.model.Webinar;

@Repository
public interface WebinarRepository extends JpaRepository<Webinar, Long> {

    List<Webinar> findByHostId(Long hostId);

    List<Webinar> findByStartTimeAfterAndStatus(LocalDateTime starTime, String string);

    List<Webinar> findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String keyword, String keyword2);

}
