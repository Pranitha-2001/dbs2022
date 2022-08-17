package com.dbs.payments.app.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dbs.payments.app.model.CustomerAccountDetails;
import com.dbs.payments.app.model.Logger;
import com.dbs.payments.app.repository.CustomerAccountDetailsRepo;
import com.dbs.payments.app.repository.LoggerRepo;

@Service
public class CustomerAccountDetailsService {
	@Autowired
	private CustomerAccountDetailsRepo customeraccountdetailsrepo;

	public String addCustomerDetails(CustomerAccountDetails customer) {
		customeraccountdetailsrepo.save(customer);
		return "Details added";
	}

	public List<CustomerAccountDetails> getCustomerData() {
		return (List<CustomerAccountDetails>) customeraccountdetailsrepo.findAll();
	}

//	public List<Logger> getLoggerByCustomerId(String custid)
//	{
//		return customeraccountdetailsrepo.getLoggerByCustomerId(custid).orElse(null);
//		
//	}
	public Optional<CustomerAccountDetails> getcustdetailsbyid(String custid) {
		return customeraccountdetailsrepo.findById(custid);
	}

	public boolean checkreceiver(String name) throws IOException {
		File sdnFile = new File(
				"C:\\Users\\Administrator\\Desktop\\DBS Training\\SpringWorkspace\\PaymentApplication\\src\\main\\java\\com\\dbs\\payments\\app\\service\\sdnlist.txt");

		BufferedReader br = new BufferedReader(new FileReader(sdnFile));
		String st;
		while ((st = br.readLine()) != null) {

			if (st.contains(name.toUpperCase())) {
				return true;
			}
		}

		return false;
	}
}
