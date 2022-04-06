package com.gabrielmendes.course.repositories;

import com.gabrielmendes.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
