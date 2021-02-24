package com.radha;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User , Integer> {

    User save(User o);

    @Override
    Optional<User> findById(Integer integer);

    @Override
    List<User> findAll();
}
