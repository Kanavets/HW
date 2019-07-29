package oophw8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class GroupIntTxt implements GroupInt {
	private File folder;

	public GroupIntTxt(File folder) {
		super();
		this.folder = folder;
	}

	public GroupIntTxt() {
		super();
	}

	public File getFolder() {
		return folder;
	}

	public void setFolder(File folder) {
		this.folder = folder;
	}

	@Override
	public void saveGroup(Group group) {
		try (PrintWriter pw = new PrintWriter(new File(folder, "temp"))) {
			for (Student student : group.getGrouplist()) {
				if (student != null) {
					pw.println(student.getName() + "," + student.getLastname() + "," + student.getAge() + ","
							+ student.getWeight() + "," + student.getSex() + "," + student.getCourse());
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	@Override
	public Group loadGroup(Group group) {
		Group groupFile = new Group();
		try (BufferedReader br = new BufferedReader(new FileReader(new File(folder, "temp")))) {
			String text = "";
			for (; (text = br.readLine()) != null;) {
				String[] studentDate = text.split(",");
				String name = studentDate[0];
				String lastname = studentDate[1];
				int age = Integer.valueOf(studentDate[2]);
				Double weight = Double.valueOf(studentDate[3]);
				String sex = (studentDate[4]);
				int course = Integer.valueOf(studentDate[5]);

				Student student = new Student(name, lastname, age, weight, sex, course);
				groupFile.addStudent(student);

			}
		} catch (IOException | MyException e) {
			System.out.println(e);
			return null;
		}
		return groupFile;
	}

}
