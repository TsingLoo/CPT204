import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *  Hash-based Map
 */
public class HAMap<K, V> implements Iterable<K> {

    /**
     * Represents a key-value pair.
     */
    private class Entry {
        K key;
        V value;

        Entry(K k, V v) {
            key = k;
            value = v;
        }
    }

    private static final int DEFAULT_CAPACITY = 16;
    private static final double DEFAULT_LOAD_FACTOR = 1.5;

    private ArrayList<ArrayList<Entry>> buckets;
    private HashSet<K> keySet;
    private int numBuckets;
    private int numEntries;
    private final double loadFactor;

    /**
     * @return a set of the keys contained in this map.
     */
    public HashSet<K> keySet() {
        return keySet;
    }

    /**
     * @return the number of entries in this map.
     */
    public int size() {
        return numEntries;
    }

    /**
     * @return the number of buckets in this map.
     */
    public int getNumBuckets() {
        return numBuckets;
    }

    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    /*
     ***** HELPER METHODS START *****
     */

    
	// INCLUDE your helper methods in EACH of your submissions that use them
    private  int reduce(K key, int capacity)
    {
        return  Math.floorMod(key.hashCode(),capacity);
    }

    private  void resize(int newCapacity)
    {
        ArrayList<ArrayList<Entry>> newBuckets = new ArrayList<>();

        for(int i=0;i<newCapacity;i++)
        {
            newBuckets.add(new ArrayList<>());
        }

        int index;
        for (K key: this)
        {
            index = reduce(key,newCapacity);
            newBuckets.get(index).add(new Entry(key,get(key)));
        }

        buckets = newBuckets;
        numBuckets = newCapacity;


    }
	
	
	

    /*
     ***** HELPER METHODS END *****
     */


    // LAB EXERCISE 12.2 CONSTRUCTORS

    public HAMap(int initialCapacity, double loadFactor) {
		buckets = new ArrayList<>();
        keySet = new HashSet<>();

        numBuckets = initialCapacity;
        numEntries = 0;

            this.loadFactor = loadFactor;

            for(int i=0;i<numBuckets;i++)
            {
                buckets.add(new ArrayList<>());
            }
    }

    public HAMap() {
        this(DEFAULT_CAPACITY , DEFAULT_LOAD_FACTOR);
    }

    public HAMap(int initialCapacity) {
        this(initialCapacity,DEFAULT_LOAD_FACTOR);
    }


    // LAB EXERCISE 12.3 CLEAR

    /**
     * Removes all of the entries from this map.
     */
    public void clear() {
		buckets = new ArrayList<>();
        keySet = new HashSet<>();

        numEntries = 0;
        //this.loadFactor = loadFactor;

        for(int i=0;i<numBuckets;i++)
        {
            buckets.add(new ArrayList<>());
        }
    }


    // LAB EXERCISE 12.4 CONTAINS KEY and ITERATOR

    /**
     * @param key to be checked
     * @return true iff this map contains an entry with the specified key
     */
    public boolean containsKey(K key) {
		return keySet.contains(key);
    }

    /**
     * @return an Iterator that iterates over the stored keys
     */
    @Override
    public Iterator<K> iterator() {
		return keySet.iterator();
    }


    // CODING ASSIGNMENT 12.1 GET

    /**
     * @param key of the value to be returned
     * @return the value to which the specified key is mapped
     *         null if this map contains no entries of the key
     */
    public V get(K key) {
        if(!containsKey(key))
        {
            return  null;
        }

        int idx = reduce(key,numBuckets);
        ArrayList<Entry> zipList = buckets.get(idx);
        for(Entry e:zipList)
        {
            if(e.key.equals(key))
            {
                return  e.value;
            }
        }
        return null;
    }


    // CODING ASSIGNMENT 12.2 PUT

    /**
     * Associates the specified value with the specified key in this map.
     * If the map previously contained an entry with that key, the old value is replaced.
     * The key is not null.
     * @param key of the entry to be added
     * @param value of the entry to be added
     */
    public void put(K key, V value) {
        if(!containsKey(key))
        {
            numEntries ++;
            keySet.add(key);
            if(((double)keySet.size()/numBuckets)>loadFactor)
            {
                resize(2*numBuckets);
            }

            int idx = reduce(key,numBuckets);
            ArrayList<Entry> zipList = buckets.get(idx);

            //int idx = reduce(key,numBuckets);
            //ArrayList<Entry> zipList = buckets.get(idx);
            zipList.add(new Entry(key,value));
        }else
        {
            int idx = reduce(key,numBuckets);
            ArrayList<Entry> zipList = buckets.get(idx);
            for(Entry e:zipList)
            {
                if(e.key.equals(key))
                {
                    e.value = value;
                }
            }
        }
    }
	
	
    // CODING ASSIGNMENT 12.3 REMOVE

    /**
     * Removes the entry for the specified key only if it is
     * currently mapped to the specified value.
     * @param key of the entry to be removed
     * @param value of the entry to be removed
     * @return the value if entry found,
     *         null otherwise
     */
    public V remove(K key, V value) {
        Entry toRemove = null;
        int index = reduce(key, numBuckets);
        for (Entry entry : buckets.get(index)) {
            if (entry.key.equals(key) && (value == null || entry.value.equals(value))) {
                toRemove = entry;
            }
        }
        if (toRemove != null) {
            buckets.get(index).remove(toRemove);
            keySet.remove(key);
            numEntries--;
            return toRemove.value;
        }
        return null;
    }

    public V getV(K key)
    {
        int index;
        if (containsKey(key)) {
            index = reduce(key, numBuckets);
            for (Entry entry : buckets.get(index)) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }

}
