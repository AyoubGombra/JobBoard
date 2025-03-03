package org.example.job.controller;

import org.example.job.entites.Job;
import org.example.job.repo.JobRepo;
import org.example.job.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Job")
public class JobController {
    @Autowired
    JobService jobService;

    @PostMapping("/addApplication")
    public Job addJob(@RequestBody Job job) {
        return jobService.addJob(job);
    }


    @GetMapping("/findAll")
    public List<Job> getAllJob() {
        return jobService.getAllJob();
    }

    @PutMapping("/updateJob/{id}")
    public Job updateJob(@PathVariable Integer id, @RequestBody Job job) {

        job.setId(id);
        return jobService.updateJob(job);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteJob(@PathVariable Integer id) {
        jobService.deleteJob(id);
    }
}
