package org.example.job.repo;

import org.example.job.entites.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends JpaRepository <Job, Integer> {
}
