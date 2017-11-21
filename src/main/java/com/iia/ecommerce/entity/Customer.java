/**
 * 
 */
package com.iia.ecommerce.entity;

/*
 * Imports
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * @author clement
 *
 */
@Entity
@Table(name="shop_customer")
public class Customer {
	
	/** Technical ID for Database*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	/** Last name of customer*/ 
	@Column(nullable = false, unique = true, length = 255)
	private String lastName;
	/** First name of customer*/
	@Column(nullable = false, length = 255)
	private String firstName;
	/**Phone number of customer*/
	@Column(length=15)
	private String phone;
	/** Adress of customer */
	@Column(length=255)
	private String adress;
	
	/** Code postal of customer*/
	private Integer CP;
	/** City of customer*/
	private String city;
	
	protected Customer(){}	
	
	/**
	 *Constructor class @see Customer
	 * @param lastName		@see String		lastName of this @see Customer
	 * @param firstName 	@see String		firstName of this @see Customer
	 * @param phone			@see String		phone of this @see Customer
	 * @param address		@see String		address of this @see Customer
	 * @param cp			@see Integer	cp of this @see Customer
	 * @param city 			@see String		city of this @see Customer
	 */
	public Customer(String lastName, String firstName, String phone, String address, int CP, String city) {
		this.setLastName(lastName)
			.setFirstName(firstName)
			.setPhone(phone)
			.setAdress(address)
			.setCP(CP)
			.setCity(city);
	}
	
	/*
	 * ToString method(non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"customer(String firstName'%s', String lastName'%s', String phone '%s', String adress '%s', Integer CP '%d', String city'%s')",
				this.firstName, this.lastName, this.phone, this.adress, this.CP, this.city);
	}
	
	/*
	 * Link to table
	 */
	@OneToMany(mappedBy="customer")
	private Caddy caddy;
	
	
	/*
	 *  GETTERS AND SETTERS
	 */
	
	/**
	 * 
	 * @return the caddy
	 */
	public Caddy getCaddy() {
		return caddy;
	}

	/**
	 * @param  the caddy to set
	 */
	public Customer setCaddy(Caddy caddy) {
		this.caddy = caddy;
		return this;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}
	/**
	 * @param  the id to set
	 */
	public Customer setId(Long id) {
		Id = id;
		return this;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param  the lastName to set
	 */
	public Customer setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param  the firstName to set
	 */
	public Customer setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param  the phone to set
	 */
	public Customer setPhone(String phone) {
		this.phone = phone;
		return this;
	}
	/**
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}
	/**
	 * @param  the adress to set
	 */
	public Customer setAdress(String adress) {
		this.adress = adress;
		return this;
	}
	/**
	 * @return the cP
	 */
	public Integer getCP() {
		return CP;
	}
	/**
	 * @param  the cP to set
	 */
	public Customer setCP(Integer cP) {
		CP = cP;
		return this;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param  the city to set
	 */
	public Customer setCity(String city) {
		this.city = city;
		return this;
	}
	
}
