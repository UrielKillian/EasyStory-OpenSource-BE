package com.dystopiastudios.easystory.cucumber.domain.repository;

import com.dystopiastudios.easystory.cucumber.domain.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    Page<Comment> findByPostId(Long postId, Pageable pageable);

    Page<Comment> findByUserId(Long postId, Pageable pageable);

    //Optional<Comment> findByIdAndPostId(Long id, Long postId);

}
