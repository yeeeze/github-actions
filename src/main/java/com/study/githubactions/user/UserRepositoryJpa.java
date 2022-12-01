package com.study.githubactions.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepositoryJpa extends JpaRepository<Users, Long> {

    @Override
    List<Users> findAll();
}
