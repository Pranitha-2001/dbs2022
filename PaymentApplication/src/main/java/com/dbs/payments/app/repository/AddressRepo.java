package com.dbs.payments.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbs.payments.app.model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{

}
