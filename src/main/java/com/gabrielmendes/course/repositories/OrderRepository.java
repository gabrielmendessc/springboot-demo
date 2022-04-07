package com.gabrielmendes.course.repositories;

import com.gabrielmendes.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
