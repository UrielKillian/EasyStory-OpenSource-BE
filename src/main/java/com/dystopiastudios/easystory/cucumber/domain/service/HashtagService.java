package com.dystopiastudios.easystory.cucumber.domain.service;

import com.dystopiastudios.easystory.cucumber.domain.model.Hashtag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface HashtagService {
    Page<Hashtag> getAllHashtags(Pageable pageable);

    Page<Hashtag> getAllHashtagsByPostId(Long postId, Pageable pageable);

    Hashtag getHashtagById(Long HashtagId);

    Hashtag createHashtag(Hashtag Hashtag);

    Hashtag updateHashtag(Long HashtagId, Hashtag tagDetails);

    ResponseEntity<?> deleteHashtag(Long HashtagId);
}
