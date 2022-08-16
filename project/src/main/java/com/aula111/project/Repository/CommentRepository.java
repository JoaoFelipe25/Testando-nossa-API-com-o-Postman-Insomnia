package com.aula111.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula111.project.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{
    
    List <Comment> findByTutorialId(long tutorialId);

    void deleteByTutorialId(long tutorialId);
}
