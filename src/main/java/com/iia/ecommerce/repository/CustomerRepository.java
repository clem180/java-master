package com.iia.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.iia.ecommerce.entity.Customer;
/**
 * @author clement
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>{

}
