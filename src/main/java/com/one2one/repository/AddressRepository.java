package com.one2one.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.one2one.entities.Address;

@Repository
public interface AddressRepository  extends JpaRepository<Address, Integer>{

}
