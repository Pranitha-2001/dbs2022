package com.dbs.payments.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.payments.app.model.Message;

@Repository
public interface MessageRepo extends JpaRepository<Message, Integer> {

}
