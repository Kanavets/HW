package oophw8;

import java.io.Serializable;

public class Student extends Human implements Serializable{
	private static final long serialVersionUID = 1L;
	private int course;

	public Student(String name, String lastname, int age, double weight, String sex, int course) {
		super(name, lastname, age, weight, sex);
		this.course = course;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", getName()=" + getName() + ", getLastname()=" + getLastname()
				+ ", getAge()=" + getAge() + ", getWeight()=" + getWeight() + ", getSex()=" + getSex() + "]";
	}

	
	

	
	}
	
	

