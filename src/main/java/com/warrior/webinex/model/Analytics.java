package com.warrior.webinex.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "analytics")
public class Analytics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "webinar_id")
    private Webinar webinar;

    private Integer attendeesCount;

    private Double feedbackRating;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Webinar getWebinar() {
        return webinar;
    }

    public void setWebinar(Webinar webinar) {
        this.webinar = webinar;
    }

    public Integer getAttendeesCount() {
        return attendeesCount;
    }

    public void setAttendeesCount(Integer attendeesCount) {
        this.attendeesCount = attendeesCount;
    }

    public Double getFeedbackRating() {
        return feedbackRating;
    }

    public void setFeedbackRating(Double feedbackRating) {
        this.feedbackRating = feedbackRating;
    }
}
