package com.example.demo;

import org.hibernate.criterion.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;


public interface OrderHistoryRepository extends CrudRepository<OrderHistory, Long> {
    Long countByStatusEquals(int status);
    ArrayList<OrderHistory> findAllByStatus(int status);
    Long countByOrduserEqualsAndStatusEquals(User tmpuser, int status);

    OrderHistory findByOrderId(String orderid);
    ArrayList<OrderHistory> findAllByOrduserEqualsAndStatusEquals(User user, int status);
    ArrayList<OrderHistory> findByOrduserEqualsAndStatusEquals(User user, int status);
    ArrayList<OrderHistory> findAllByOrduserEqualsAndOrderIdGreaterThan(User user, int number);


    ArrayList<OrderHistory> findAllByOrduserEqualsAndStatusEqualsAndQtyGreaterThan(User user, int status, int gt);

    int countByOrduserEqualsAndOrderIdNotContaining(User user, String string);

    int findByOrduserEqualsAndOrderIdIsNotContaining(User user, String string);



    ArrayList<OrderHistory> findAllByOrduser(User user);
    ArrayList<OrderHistory> findAllByOrduserAndStatusEquals(User user, int status);
}
