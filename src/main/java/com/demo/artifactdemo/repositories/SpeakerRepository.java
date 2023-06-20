package com.demo.artifactdemo.repositories;

import com.demo.artifactdemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
