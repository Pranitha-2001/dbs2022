package com.dbs.payments.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbs.payments.app.model.CustomerAccountDetails;
import com.dbs.payments.app.model.Logger;

@Repository
public interface CustomerAccountDetailsRepo extends CrudRepository<CustomerAccountDetails, String>{
//	@Query("FROM Logger WHERE customerid_customerid = ?1")
//	Optional<List<Logger>> getLoggerByCustomerId(String custid);
}
