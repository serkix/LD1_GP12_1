package SortingAlg;

import SortingLib.SortableList;

/**
 * Created by Andrej on 02.02.2017.
 */
abstract public class Sorting {
	/**
	 * sorts the array
	 * @param ToSort list which you need to sort
	 */
	abstract public void sort(SortableList ToSort);

	/**
	 * Testing function
	 * @param times how many times you need to sort
	 * @param len length of sortable list
	 * @param range range of sortable numbers
	 * @return return true if array is sorted or false otherwise
	 */
	public boolean test(int times,int len, int range)
	{
		SortableList ToSort=new SortableList();
		for (int i=0;i<times;i++)
		{
			ToSort.setRandom(len, range);
			sort(ToSort);
			if (!ToSort.check())
				return false;
		}
		return true;
	}

}
