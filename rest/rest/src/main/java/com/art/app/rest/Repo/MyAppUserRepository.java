package com.art.app.rest.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.art.app.rest.Models.MyAppUser;
import org.springframework.stereotype.Repository;


@Repository
public interface MyAppUserRepository extends JpaRepository<MyAppUser, Long>{

    Optional<MyAppUser> findByUsername(String username);
}
