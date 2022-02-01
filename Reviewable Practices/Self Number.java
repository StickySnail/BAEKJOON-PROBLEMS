import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		HashSet<Integer> hSet1 = new HashSet<Integer>();
		HashSet<Integer> hSet2 = new HashSet<Integer>();
		for (int i = 1; i <= 10000; i++) {
			hSet1.add(i + NonSelfNumber(i));
		}
		for (int i = 1; i <= 10000; i++) {
			if(!(hSet1.contains(i))) hSet2.add(i);
		}
		
		List<Integer> i= new ArrayList<Integer>(hSet2);
		Collections.sort(i);
		Iterator<Integer>itr = i.iterator();
		while(itr.hasNext()) System.out.println(itr.next());
	}

	static int NonSelfNumber(int n) {
		int sum = 0;
		while(n!=0) {
			sum += n%10;
			n /= 10;
		}
		
		
		
		return sum;
	}

}
