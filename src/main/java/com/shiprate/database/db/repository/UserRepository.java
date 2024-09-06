package com.shiprate.database.db.repository;

import com.shiprate.database.db.entity.Account;
import com.shiprate.database.db.entity.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends ListCrudRepository<User, Integer> {
    Optional<User> findByName(String name);

    Optional<User> findByEmail(String email);
}