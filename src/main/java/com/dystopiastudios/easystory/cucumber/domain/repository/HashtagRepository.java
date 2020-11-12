package com.dystopiastudios.easystory.cucumber.domain.repository;

import com.dystopiastudios.easystory.cucumber.domain.model.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HashtagRepository extends JpaRepository<Hashtag,Long> {
}
