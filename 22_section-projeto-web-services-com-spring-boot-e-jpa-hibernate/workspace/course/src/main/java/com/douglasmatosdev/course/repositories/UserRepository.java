package com.douglasmatosdev.course.repositories;

import com.douglasmatosdev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
