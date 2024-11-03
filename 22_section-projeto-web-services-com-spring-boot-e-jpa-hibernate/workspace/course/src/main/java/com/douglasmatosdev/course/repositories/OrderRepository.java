package com.douglasmatosdev.course.repositories;

import com.douglasmatosdev.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
