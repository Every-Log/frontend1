package com.egg.everylogg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tteokbokki.everylog.domain.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
