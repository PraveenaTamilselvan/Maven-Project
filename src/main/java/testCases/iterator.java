package testCases;

import java.util.LinkedList;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		// Iterator itr = al.iterator();
		// while (itr.hasNext()) {
		// System.out.println(itr.next());

		for (String al1 : al) {

			System.out.println(al1);
		}

	}
}
