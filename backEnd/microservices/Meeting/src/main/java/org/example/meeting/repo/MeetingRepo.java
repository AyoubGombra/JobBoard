package org.example.meeting.repo;

import org.example.meeting.entities.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingRepo extends JpaRepository<Meeting, Integer> {
}
