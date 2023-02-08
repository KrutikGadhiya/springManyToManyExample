package com.test.springtest.repository;

import com.test.springtest.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag, Long> {
    List<Tag> findTagsByTutorialsId(Long tutorialId);
}
