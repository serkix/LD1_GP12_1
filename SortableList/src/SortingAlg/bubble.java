package SortingAlg;
/**
 * Created by Andrej on 02.02.2017.
 */
import SortingLib.*;
public class bubble extends Sorting{
	public void sort(SortableList ToSort)
	{
		boolean _end=false;
		while (!_end)
		{
			_end=true;
			for (int i=0;i<ToSort.size()-1;i++)
			{
				if (ToSort.compare(i,i+1)==1)
				{
					ToSort.swap(i,i+1);
					_end=false;
				}
			}
		}
	}
}
