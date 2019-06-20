package classWork;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> collection1 = new ArrayList<String>();
		collection1.add("Toronto");
		collection1.add("Hamilton");
		collection1.add("London");
		collection1.add("Ottawa");
		collection1.add("Toronto");
		System.out.println("A list of cities in c1 is " + collection1);
		System.out.println(" Is hamilton in c1? " + collection1.contains("Hamilton"));
		System.out.println("Size of collection c1 is " + collection1.size());
		Collection<String> collection2 = new ArrayList<String>();
		collection1.add("Vancouver");
		collection1.add("Delhi");
		collection1.add("chd");
		collection1.add("Toronto");
		collection1.addAll(collection2);
		System.out.println("combined list is : " + collection1);
//		Collection<String> c1 = new ArrayList<String>(collection1);
//		c1.retainAll(collection2);
//		System.out.println("A list of cities in c1 is " + c1);
//		c1.removeAll(collection2);
//		System.out.println("A list of cities in c1 is " + c1);
		
	}

}
