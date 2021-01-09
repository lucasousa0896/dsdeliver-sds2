package com.devlucas.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlucas.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
