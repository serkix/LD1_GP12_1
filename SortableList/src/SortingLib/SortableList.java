/**
 * Created by Andrej on 02.02.2017.
 */
package SortingLib;
import java.util.*;

public class SortableList extends ArrayList<TData>
{
    /**
     * Creates and fills the list with len elements of random nubers in range
     * @param len length of the list
     * @param range range of the random numbers
     */
    public SortableList(int len,int range)
    {
        super();
        TData El;
        for (int i=0;i<len;i++)
        {
            El=new TData(0);
            El.setRandom(range);
            this.add(El);
        }
    }

    /**
     * Creates empty list
     */
    public SortableList()
    {
        super();
    }

    /**
     * Emptys and fills the list with len elements of random nubers in range
     * @param len length of the list
     * @param range range of the random numbers
     */
    public void setRandom(int len,int range)
    {
        this.clear();
        TData El;
        for (int i=0;i<len;i++)
        {
            El=new TData(0);
            El.setRandom(range);
            this.add(El);
        }
    }

    /**
     * Checks if the list is sorted
     * @return Returns true if it is or false if it is not
     */
    public boolean check()
    {
        long prev=-1;
        for (TData i:this)
        {
            if (prev==-1)
                prev=i.get();
            else
            {
                if (prev>i.get())
                    return false;
                prev=i.get();
            }
        }
        return true;
    }

    //Use only long for data
    /**
     * Compares two list elements
     * @param comparable1 index of first comparable
     * @param comparable2 index of second comparable
     * @return byte -1 if smaller 0 if equal 1 if greater
     */
    public byte compare(int comparable1, int comparable2)
    {
        if (this.get(comparable1).get()<this.get(comparable2).get())
            return (int)-1;
        else
            return (byte)((comparable1>comparable2)?0:1);
    }

    /**
     * Swaps 2 elements in list
     * @param swapable1 index of first swapable element
     * @param swapable2 index of second swapable element
     */
    public void swap(int swapable1,int swapable2)
    {
        TData temp=this.get(swapable1);
        this.set(swapable1,this.get(swapable2));
        this.set(swapable2,temp);
    }


    /*
        Prints the list
     */
    public void printList()
    {
        for(TData i : this) {
            System.out.print(i.get()+";");
        }
        System.out.println();
    }

}
