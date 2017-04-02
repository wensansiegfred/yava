package com.wensan.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private int id;

	@NotNull
	private String firstName;

	@NotNull
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Student(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Student() {}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Student student = (Student) o;
		if (id != student.id) return false;

		if (firstName != null ? !firstName.equals(student.firstName) :
				student.firstName != null)
			return false;
		if (lastName != null ? !lastName.equals(student.lastName) :
			student.lastName != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result;
		result = id;
		result = 29 * result + (firstName != null ? firstName.hashCode() : 0);
		result = 29 * result + (lastName != null ? lastName.hashCode() : 0);

		return result;
	}
}
