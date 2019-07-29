package oophw8;

import java.io.File;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human("N1", "S1", 30, 70, "m");

		Group group1 = new Group();
		try {
			group1.addStudent(new Student("N0", "S8", 17, 70, "m", 1));
			group1.addStudent(new Student("N1", "S7", 16, 70, "m", 1));
			group1.addStudent(new Student("N2", "S6", 17, 55, "f", 1));
			group1.addStudent(new Student("N3", "S5", 18, 70, "m", 1));
			group1.addStudent(new Student("N4", "S4", 19, 60, "f", 1));
			group1.addStudent(new Student("N5", "S3", 20, 75, "m", 1));
			group1.addStudent(new Student("N6", "S2", 21, 70, "f", 1));
			group1.addStudent(new Student("N7", "S7", 19, 70, "m", 1));
			group1.addStudent(new Student("N8", "S8", 18, 65, "f", 1));
			// group1.addStudent(new Student("N9","S9",17,70,"m",1));
			// group1.addStudent(new Student("N10","S10",16,70,"f",1));

		} catch (MyException e) {

			e.printStackTrace();
		}
		// try {
		// group1.addST();
		// } catch (MyException e) {
		// TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//group1.print();
		//group1.deleteStudent("S3");
		//group1.print();
		//group1.searchStudent("S5");
		//group1.goarmy();
		//System.out.println(Arrays.toString(group1.goarmy()));
		//group1.sortLN(true);
		//group1.print();
		
		File folder = new File("my");
		folder.mkdirs();
		GroupInt groupInt= new GroupIntSer(folder);
		GroupCont controller= new GroupCont(groupInt);
		controller.saveGroup(group1);
		group1.print();
		System.out.println();
		Group group2= controller.loadGroup(group1);
		group2.print();
		
		
		
		
		
		
		
		
		
		
	}
}
