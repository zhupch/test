package org.vo;

/**
 * StudentId entity. @author MyEclipse Persistence Tools
 */
public class StudentId extends AbstractStudentId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public StudentId() {
	}

	/** full constructor */
	public StudentId(String name, String num, Integer age) {
		super(name, num, age);
	}

}
