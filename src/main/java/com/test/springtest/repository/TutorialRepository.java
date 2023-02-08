package com.test.springtest.repository;

import com.test.springtest.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findTutorialsByTagsId(Long tagId);

    List<Tutorial> findByTitleContaining(String title);

    List<Tutorial> findByPublished(boolean b);
}
