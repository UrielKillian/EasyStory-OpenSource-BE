package com.dystopiastudios.easystory.cucumber.domain.repository;

import com.dystopiastudios.easystory.cucumber.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {
    Optional<User> findByUsername(String username);
}
