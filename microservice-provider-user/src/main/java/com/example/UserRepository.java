package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by maomao on 18/1/8.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
