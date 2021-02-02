import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class findhighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 5, 0, 2, 4, 1, 3, 6 };
		int sum = 5;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] + a[j]) == sum) {
					System.out.println(a[i] + "\t" + "+\t" + a[j] + "\t=\t"
							+ sum);
				}
			}
		}
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		Iterator<Integer> it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		int fbig = 0;
		int sbig = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > fbig) {
				sbig = fbig;
				fbig = a[i];
				
			} else if (a[i] > sbig && fbig > a[i]) {
				sbig = a[i];
			}
		}

		System.out.println("First Biggest" + fbig);
		System.out.println("First Biggest" + sbig);
	}

}
