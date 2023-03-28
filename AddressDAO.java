package com.jdbc.studentmgt.dao;

import com.jdbc.studentmgt.entity.Address;

public interface AddressDAO {

	
		public void insertAddress(int hno, String city, String state, String pin);

		public void updateAddress( int hno, String city, String state, String pin);

		public void deletetAddress(int aid);

		public Address viewAddress(int aid);

	}


