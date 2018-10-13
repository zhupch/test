package org.vo;

/**
 * UserTable entity. @author MyEclipse Persistence Tools
 */
public class UserTable extends AbstractUserTable implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UserTable() {
	}

	/** full constructor */
	public UserTable(String username, String password) {
		super(username, password);
	}

}
