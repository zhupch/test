package org.vo;

/**
 * AbstractStudentId entity provides the base persistence definition of the
 * StudentId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStudentId implements java.io.Serializable {

	// Fields

	private String name;
	private String num;
	private Integer age;

	// Constructors

	/** default constructor */
	public AbstractStudentId() {
	}

	/** full constructor */
	public AbstractStudentId(String name, String num, Integer age) {
		this.name = name;
		this.num = num;
		this.age = age;
	}

	// Property accessors

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractStudentId))
			return false;
		AbstractStudentId castOther = (AbstractStudentId) other;

		return ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
				&& this.getName().equals(castOther.getName())))
				&& ((this.getNum() == castOther.getNum()) || (this.getNum() != null && castOther.getNum() != null
						&& this.getNum().equals(castOther.getNum())))
				&& ((this.getAge() == castOther.getAge()) || (this.getAge() != null && castOther.getAge() != null
						&& this.getAge().equals(castOther.getAge())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + (getNum() == null ? 0 : this.getNum().hashCode());
		result = 37 * result + (getAge() == null ? 0 : this.getAge().hashCode());
		return result;
	}

}