package classWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {

	public static void main(String[] args) {
		Collection<String> collection1 = new ArrayList<String>();
		collection1.add("Toronto");
		collection1.add("Hamilton");
		collection1.add("London");
		collection1.add("Ottawa");
		collection1.add("Toronto");
		Iterator <String> iterator = collection1.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		for (String city : collection1) {
			System.out.println(city);
		}
	}

}
