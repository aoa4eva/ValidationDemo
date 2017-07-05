package me.aoa4eva.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User {

	//Uniquely Generated ID field
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id; 
	
	
	//Adding a unique index on the column e-mail for validation 
	@Column(unique=true)
	@NotEmpty
	private String email;


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	} 



}
