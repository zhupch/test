package org.vo;

/**
 * AbstractStudent entity provides the base persistence definition of the
 * Student entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStudent implements java.io.Serializable {

	// Fields

	private StudentId id;

	// Constructors

	/** default constructor */
	public AbstractStudent() {
	}

	/** full constructor */
	public AbstractStudent(StudentId id) {
		this.id = id;
	}

	// Property accessors

	public StudentId getId() {
		return this.id;
	}

	public void setId(StudentId id) {
		this.id = id;
	}

}