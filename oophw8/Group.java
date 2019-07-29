package oophw8;

import java.io.Serializable;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Group implements Voencom, Serializable {
	private static final long serialVersionUID = 1L;
	private Student[] grouplist = new Student[10];

	public boolean addStudent(Student student) throws MyException {
		if (student == null) {
			throw new IllegalArgumentException("No student");
		}
		for (int i = 0; i < grouplist.length; i++) {
			if (grouplist[i] == null) {
				grouplist[i] = student;
				return true;
			}
		}
		throw new MyException();
	}

	public boolean deleteStudent(String lastname) {
		for (int i = 0; i < grouplist.length; i++) {
			if (grouplist[i] != null && grouplist[i].getLastname().equals(lastname)) {
				grouplist[i] = null;
				return true;
			}
		}
		return false;
	}

	public Student searchStudent(String lastname) {
		for (Student student : grouplist) {
			if (student != null && student.getLastname().equals(lastname)) {
				return student;
			}
		}
		return null;
	}

	public void addST() throws MyException {
		try {
			String name = getName("Input student name");
			String lastName = getlastName("Input student lastname");
			int age = getAge("Input age");
			double weight = getWeight("Input weight");
			String sex = getSex("Input sex m/f");
			int course = getCourse("Input course 1-6");
			Student std = new Student(name, lastName, age, weight, sex, course);
			this.addStudent(std);
		} catch (NullPointerException e) {
			System.out.println("Cancel");
			return;
		}
	}

	private int getAge(String message) throws NullPointerException {
		boolean done = false;
		int age = 0;
		for (; !done;) {
			try {
				age = Integer.valueOf(JOptionPane.showInputDialog(message));
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Error ");
			}
		}
		return age;
	}

	private String getName(String message) throws NullPointerException {
		boolean done = false;
		String name = "";
		for (; !done;) {
			try {
				name = JOptionPane.showInputDialog(message);
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Error");
			}
		}
		return name;
	}

	private String getlastName(String message) throws NullPointerException {
		boolean done = false;
		String lastname = "";
		for (; !done;) {
			try {
				lastname = JOptionPane.showInputDialog(message);
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Error");
			}
		}
		return lastname;
	}

	private double getWeight(String message) throws NullPointerException {
		boolean done = false;
		double weight = 0;
		for (; !done;) {
			try {
				weight = Integer.valueOf(JOptionPane.showInputDialog(message));
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Error ");
			}
		}
		return weight;
	}

	private String getSex(String message) throws NullPointerException {
		boolean done = false;
		String sex = "";
		for (; !done;) {
			try {
				sex = JOptionPane.showInputDialog(message);
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Error");
			}
		}
		return sex;
	}

	private int getCourse(String message) throws NullPointerException {
		boolean done = false;
		int course = 0;
		for (; !done;) {
			try {
				course = Integer.valueOf(JOptionPane.showInputDialog(message));
				done = true;
			} catch (NumberFormatException e) {
				JOptionPane.showInternalMessageDialog(null, "Error ");
			}
		}
		return course;
	}

	public void print() {
		for (Student student : grouplist) {
			System.out.println(student);
		}
		System.out.println();
	}

	public void sortLN(boolean forward) {
		Arrays.sort(this.grouplist, new STComp(forward));
	}
	public Student[] getGrouplist() {
		Student[] temp = new Student[this.grouplist.length];
		System.arraycopy(grouplist, 0, temp, 0, temp.length);
		return temp;
	}
	@Override
	public String toString() {
		return "Group [grouplist=" + Arrays.toString(grouplist) + ", goarmy()=" + Arrays.toString(goarmy()) + "]";
	}

	@Override
	public Student[] goarmy() {
		int n = 0;
		for (Student student : grouplist) {
			if (student != null && student.getSex() == "m" && student.getAge() >= 18 && student.getAge() <= 27) {
				n += 1;
			}
		}
		Student[] goarmy = new Student[n];
		int i = 0;
		for (Student student : this.grouplist) {
			if (student != null && student.getSex() == "m" && student.getAge() >= 18 && student.getAge() <= 27) {
				goarmy[i++] = student;
			}
		}
		return goarmy;
	}

}
