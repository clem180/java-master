/**
 * 
 */
package com.iia.ecommerce;

// Imports
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.iia.ecommerce.entity.Caddy;
import com.iia.ecommerce.entity.Customer;
import com.iia.ecommerce.entity.Product;
import com.iia.ecommerce.repository.CaddyRepository;
import com.iia.ecommerce.repository.CustomerRepository;
import com.iia.ecommerce.repository.ProductRepository;


/**
 * @author clement
 *Main Application
 */

@SpringBootApplication
public class Application {
	
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);
		
	}
	
	@Bean
	public CommandLineRunner Customer(CustomerRepository repository,ProductRepository ProductRepository, CaddyRepository caddyRepository1) {
		return (args) ->{
			/*
			 * empty the database
			 */
			repository.deleteAll();
			/*
			 * create a Customer
			 */
			Customer customer = new Customer("test", "test", "1111111111", "test",49000,"test");
			/*
			 * save in the database
			 */
			repository.save(customer);			
			repository.save(new Customer("test2", "test2", "11111111112", "test2",49000,"test2"));
			repository.save(new Customer("test3", "test3", "11111111113", "test3",49000,"test3"));
			/*
			 * empty the database
			 */
			ProductRepository.deleteAll();
			/*
			 * create a Product
			 */
			Product prod = new Product("test", "test", 1, true);
			/*
			 * save in the database
			 */
			ProductRepository.save(prod);
			ProductRepository.save(new Product("test2", "test2", 2, true));
			ProductRepository.save(new Product("test3", "test3", 3, true));
			
			
		};
	}
	
}
