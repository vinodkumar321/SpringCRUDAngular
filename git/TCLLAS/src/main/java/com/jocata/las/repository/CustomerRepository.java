package com.jocata.las.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jocata.las.entity.CustomerDetails;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetails,Long>{

}