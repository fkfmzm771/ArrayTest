import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main extends ArrayList<Integer> {
	public static void main(String[] args) {

		Main m = new Main();

		for (int i = 0; i < 100 ; i++) {
			m.add(i+1);
		}


		Iterator<Integer> iter_m = m.iterator();

		do {
			int a = iter_m.next();
			if (a == 10){
				break;
			}
			System.out.println(a);
		}while (iter_m.hasNext());


	}
}
