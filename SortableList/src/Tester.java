/**
 * Created by Andrej on 02.02.2017.
 */
import SortingAlg.*;
import SortingLib.*;
public class Tester
{
	public static void main(String[] args) {
		SortableList ToSort = new SortableList(10, 100);
		ToSort.printList();
		bubble bubl = new bubble();
		bubl.sort(ToSort);
		ToSort.printList();
	}

}
