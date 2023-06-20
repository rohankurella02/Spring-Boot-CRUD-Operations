package com.demo.artifactdemo.repositories;

import com.demo.artifactdemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
