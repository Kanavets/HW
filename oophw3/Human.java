package oophw3;

public class Human {

	private String name;
	private String lastname;
	private int age;
	private double weight;
    private String sex;
	public Human() {
		super();
	}
	public Human(String name, String lastname, int age, double weight, String sex) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.weight = weight;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname () {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", lastname=" + lastname + ", age=" + age + ", weight=" + weight + ", sex=" + sex
				+ "]";
	}
    
}
