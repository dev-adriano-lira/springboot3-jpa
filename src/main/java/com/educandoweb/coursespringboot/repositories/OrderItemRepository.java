package com.educandoweb.coursespringboot.repositories;

import com.educandoweb.coursespringboot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
