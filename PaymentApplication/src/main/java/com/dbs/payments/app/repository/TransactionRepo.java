package com.dbs.payments.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dbs.payments.app.model.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Integer> {

	@Query("FROM Transaction WHERE customer_id_customerid= ?1")
	Optional<List<Transaction>> getTransactionByCustid(String custid);
//	Optional<List<Logger>> getLoggerByCustomerId(String custid);
}
