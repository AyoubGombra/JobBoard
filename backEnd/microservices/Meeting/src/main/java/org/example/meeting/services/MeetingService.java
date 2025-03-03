package org.example.meeting.services;

import org.example.meeting.entities.Meeting;
import org.example.meeting.repo.MeetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingService {
    @Autowired
    MeetingRepo meetingRepo;

    public Meeting addMeeting(Meeting meeting) {
        return meetingRepo.save(meeting);
    }

    public void deleteMeeting(Integer idMeeting) {
        meetingRepo.deleteById(idMeeting);
    }

    public List<Meeting> getAllMeeting() {
        return meetingRepo.findAll();
    }

    public Meeting updateMeeting(Meeting meeting) {
        return meetingRepo.findById(meeting.getId())
                .map(existingEvent -> {
                    existingEvent.setId(meeting.getId());
                    existingEvent.setRefernce(meeting.getRefernce());
                    existingEvent.setLink(meeting.getLink());
                    existingEvent.setStatus(meeting.getStatus());
                    return meetingRepo.save(existingEvent);
                })
                .orElseThrow(() -> new RuntimeException("feedback not found with id: " + meeting.getId()));
    }
}
