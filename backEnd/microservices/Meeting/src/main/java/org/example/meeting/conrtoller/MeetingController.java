package org.example.meeting.conrtoller;

import org.example.meeting.entities.Meeting;
import org.example.meeting.services.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Meeting")
public class MeetingController {
    @Autowired
    MeetingService meetingService;

    @PostMapping("/addMeeting")
    public Meeting addMeeting(@RequestBody Meeting meeting) {
        return meetingService.addMeeting(meeting);
    }


    @GetMapping("/findAll")
    public List<Meeting> getAllMeeting() {
        return meetingService.getAllMeeting();
    }

    @PutMapping("/updateMeeting/{id}")
    public Meeting updateMeeting(@PathVariable Integer id, @RequestBody Meeting meeting) {

        meeting.setId(id);
        return meetingService.updateMeeting(meeting);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteMeeting(@PathVariable Integer id) {
        meetingService.deleteMeeting(id);
    }
}
