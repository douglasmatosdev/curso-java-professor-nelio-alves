package com.douglasmatosdev.course.repositories;

import com.douglasmatosdev.course.entities.OrderItem;
import com.douglasmatosdev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
