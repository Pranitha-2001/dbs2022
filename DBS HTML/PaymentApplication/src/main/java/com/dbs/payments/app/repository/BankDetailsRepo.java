package com.dbs.payments.app.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbs.payments.app.model.BankDetails;

@Repository
public interface BankDetailsRepo extends CrudRepository<BankDetails, Integer>{


}
