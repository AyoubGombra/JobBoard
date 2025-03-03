package org.example.job.service;

import org.example.job.entites.Job;
import org.example.job.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepo jobRepo;

    public Job addJob(Job job) {
        return jobRepo.save(job);
    }

    public void deleteJob(Integer idJob) {
        jobRepo.deleteById(idJob);
    }

    public List<Job> getAllJob() {
        return jobRepo.findAll();
    }

    public Job updateJob(Job job) {
        return jobRepo.findById(job.getId())
                .map(existingEvent -> {
                    existingEvent.setId(job.getId());
                    existingEvent.setName(job.getName());
                    existingEvent.setDescription(job.getDescription());
                    existingEvent.setAvailable(job.getAvailable());
                    existingEvent.setDate(job.getDate());
                    return jobRepo.save(existingEvent);
                })
                .orElseThrow(() -> new RuntimeException("feedback not found with id: " + job.getId()));
    }
}
