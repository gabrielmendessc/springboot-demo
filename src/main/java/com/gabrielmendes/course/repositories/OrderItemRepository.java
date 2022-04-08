package com.gabrielmendes.course.repositories;

import com.gabrielmendes.course.entities.OrderItem;
import com.gabrielmendes.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {



}
