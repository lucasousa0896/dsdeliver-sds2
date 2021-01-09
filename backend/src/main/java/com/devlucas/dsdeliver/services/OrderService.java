package com.devlucas.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devlucas.dsdeliver.dto.OrderDTO;
import com.devlucas.dsdeliver.entities.Order;
import com.devlucas.dsdeliver.repositories.OrderRepository;



@Service
public class OrderService {
	
	@Autowired
	public OrderRepository repository;

	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		List<Order> list = repository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
}
