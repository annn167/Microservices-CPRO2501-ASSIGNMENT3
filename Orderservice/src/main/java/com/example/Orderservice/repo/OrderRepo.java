package com.example.Orderservice.repo;

import com.example.Orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface OrderRepo extends JpaRepository<Order, Long>
{

}