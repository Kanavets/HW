package oophw8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class GroupIntSer implements GroupInt{
	private File casheFolder;

	public GroupIntSer() {
		super();
	}

	public GroupIntSer(File casheFolder) {
		super();
		this.casheFolder = casheFolder;
	}
	@Override
	public void saveGroup(Group group) {
		File file = new File(casheFolder,"temp");
		try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream(file))) {
			out.writeObject(group);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
		@Override
		public Group loadGroup (Group group){
			File file = new File(casheFolder,"temp");
			try (ObjectInput in = new ObjectInputStream(new FileInputStream(file))) {
				return (Group) in.readObject();
			} catch (IOException | ClassNotFoundException e) {
				return null;
			}

}
}