package com.dbs.payments.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.payments.app.model.Address;
import com.dbs.payments.app.repository.AddressRepo;

@Service
public class AddressService {
	@Autowired
	private AddressRepo addressrepo;
	
	public void addAddress(Address address)
	{
		addressrepo.save(address);
	}
	public List<Address> getAddress()
	{
		return  addressrepo.findAll();
	}

}
