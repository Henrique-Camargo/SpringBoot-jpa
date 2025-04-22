package dev.rick.course.repository;

import dev.rick.course.entities.Order;
import dev.rick.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {


}
