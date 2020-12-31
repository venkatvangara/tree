package tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person p1=new Person("venkat",24);
Person p2=new Person("sureh",25);
Person p3=new Person("remedy",26);
Person p4=new Person("kennedy",27);
Person p5=new Person("david",28);
Person p6=new Person("lakshmi",29);
BST b=new BST();
b.insert(p1);
b.insert(p2);
b.insert(p3);
b.insert(p4);
b.insert(p5);
b.insert(p6);
//b.showAll(b.findNode("remedy"));
Person p=b.getdata(b.findParent("suresh"));
System.out.print(p.toString());
	}

}
