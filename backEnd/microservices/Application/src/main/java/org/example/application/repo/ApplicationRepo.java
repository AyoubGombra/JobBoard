package org.example.application.repo;

import org.example.application.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepo extends JpaRepository<Application, Integer> {
}
