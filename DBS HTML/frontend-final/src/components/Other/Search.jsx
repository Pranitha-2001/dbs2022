import React, { useState , useEffect } from "react";

const Search = () => {
  const [name, setName] = useState("");
  const listEmployees = [
    "A KRISHNA MOHAN",
    "Naveen",
    "A M MAYANNA",
    "HDFC BANK -(CHENNAI)",
    "A RAJESH KUMAR",
    "A S VIJAY KUMAR",
    "ABHISHEK BIYANI",
    "ABHITHA",
    "ABRAHAM VARGHESE",
    "ABY GEORGE",
    "HDFC BANK -(MUMBAI)",
    "AJAY SHAMU KUMAR",
    "AKSHAYA WEALTH MANAGEMENT (P) LTD",
    "HDFC BANK -(DELHI)",
    "ANAND L S",
    "ANANTHAKUMAR",
    "ANANTHAMURTHY SHAMASUNDARA",
    "ANIL GUPTA",
    "ANIL KUMAR",
    "ANIL KUMAR NAGARAJ",
    "HDFC BANK -(GOA)",
    "ANIL V GORUR",
    "ANITA B MEHTA",
    "ANITHA B ASHWATH",
    "ANJAN KUMAR G",
    "ANKITA BANERJEE",
    "ANNUKA NIRVAN",
    "ANU",
    "ANUPAMA N",
    "AREEFIKBAL T F",
    "ARJUN PARAMESWARA",
    "ARPITHA M S",
    "ASADI LINGAREDDY",
    "ASHAJYOTHI M",
    "ASHISH MISHRA",
    "ASHOK H R",
    "ASHOKA AR",
    "AVISHEK MUKHERJEE",
    "AYISHA KAUSAR",
    "B A SANTOSH",
    "B JAYARAM",
    "B PRAKASH BABU",
  ];
  
  const [filteredEmployee , setFilteredEmployee] = useState(listEmployees);
  useEffect(() => {
        setFilteredEmployee(listEmployees.filter(employee=>
        {
           return employee.toUpperCase().startsWith(name.substring(0,name.length).toUpperCase())
        })
        );
  }, [name])
  return (
    <div>
         <center><h4>Select Your Receiver</h4></center> 
            <input
            className  = "w-50"
            type="text"
            list="emplist"
            onChange={(e) => {
            setName(e.target.value);
            }}
            value={name}
        />
         <datalist id="emplist">
        {
        filteredEmployee.map(employee=>{
          return <option value={employee}/>
        })}
        </datalist> 
    </div>
  );
};

export default Search;

