/**
 * Created by Andrej on 02.02.2017.
 */
package SortingLib;
public class TData
{
    private long data;

    /**
     * Constructs TData with newData value
     * @param newData new data which should be appended
     */
    TData(long newData)
    {
        set(newData);
    }

    /**
     * sets data value to a random number in range
     * @param range of random numbers
     * @return the random number;
     */
    public long setRandom(int range)
    {
        data=(long)(Math.random()*range);
        return get();
    }

    /**
     * returns the data
     * @return data stored in TData object
     */
    public long get()
    {
        return data;
    }

    /**
     * Sets the data to new data
     * @param newData new data value
     */
    public void set(long newData)
    {
        data=newData;
    }

}
