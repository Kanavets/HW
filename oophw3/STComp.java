package oophw3;

import java.util.Comparator;

public class STComp implements Comparator {
	private boolean forward = true;

	public STComp(boolean forward) {
		super();
		this.forward = forward;
	}

	@Override
	public int compare(Object a, Object b) {

		int n = (this.forward) ? 1 : -1;

		if (a != null && b == null) {
			return 1;
		}
		if (a == null && b != null) {
			return -1;
		}
		if (a == null && b == null) {
			return 0;
		}
		Student studentOne = (Student) a;
		Student studentTwo = (Student) b;

		return (studentOne.getLastname().compareTo(studentTwo.getLastname())) * n;
	}
}