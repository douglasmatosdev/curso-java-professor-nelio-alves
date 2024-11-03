package com.douglasmatosdev.course.repositories;

import com.douglasmatosdev.course.entities.Category;
import com.douglasmatosdev.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
