package org.vo;

/**
 * AbstractUserTable entity provides the base persistence definition of the
 * UserTable entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUserTable implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;

	// Constructors

	/** default constructor */
	public AbstractUserTable() {
	}

	/** full constructor */
	public AbstractUserTable(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}