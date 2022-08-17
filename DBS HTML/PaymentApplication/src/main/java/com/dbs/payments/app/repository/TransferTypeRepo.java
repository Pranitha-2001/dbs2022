package com.dbs.payments.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.payments.app.model.TransferType;

@Repository
public interface TransferTypeRepo extends JpaRepository<TransferType, Integer>{

}
