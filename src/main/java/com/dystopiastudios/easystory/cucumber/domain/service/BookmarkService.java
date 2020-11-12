package com.dystopiastudios.easystory.cucumber.domain.service;

import com.dystopiastudios.easystory.cucumber.domain.model.Bookmark;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface BookmarkService {
    Bookmark getBookmarkByUserIdAndPostId(Long userId, Long postId);
    Bookmark createBookmark(Long userId, Long postId, Bookmark bookmark);
    Page<Bookmark>getAllBookmarksByUserId(Long userId, Pageable pageable);
    ResponseEntity<?>deleteBookmark(Long userId, Long postId);
    Page<Bookmark>getAllBookmarks(Pageable pageable);
}
