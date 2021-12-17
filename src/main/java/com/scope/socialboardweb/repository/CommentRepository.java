package com.scope.socialboardweb.repository;

import com.scope.socialboardweb.domain.Comment;
import com.scope.socialboardweb.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Long> {
    List<Comment> findAllByPost(Post post);
}