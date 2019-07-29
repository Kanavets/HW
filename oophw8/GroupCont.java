package oophw8;

public class GroupCont {
private GroupInt groupInt;

public GroupCont() {
	super();
}

public GroupCont(GroupInt groupInt) {
	super();
	this.groupInt = groupInt;
}

public GroupInt getGroupInt() {
	return groupInt;
}

public void setGroupInt(GroupInt groupInt) {
	this.groupInt = groupInt;
}
public Group loadGroup(Group group) {
	if(groupInt== null) {
		throw new IllegalArgumentException("Null GroupInt");}
	return groupInt.loadGroup(group) ;
	}
public void saveGroup(Group group) {
	if(groupInt== null) {
		throw new IllegalArgumentException("Null GroupInt");}
	groupInt.saveGroup(group) ;
	}


}








