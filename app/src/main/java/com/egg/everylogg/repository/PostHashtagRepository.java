package com.egg.everylogg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tteokbokki.everylog.domain.PostHashtag;

public interface PostHashtagRepository extends JpaRepository<PostHashtag, Long> {
}
