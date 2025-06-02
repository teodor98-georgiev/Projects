import java.util.LinkedHashMap;
import java.util.Map;

public class DefaultLruCache extends LinkedHashMap<Integer, Integer>
        implements LruCache{
    private int capacity;

    // necessary default constructor to handle special cases - I could forget to write the capacity or intentianally I want a default
    // capacity.
    public DefaultLruCache(){
        super (3, 0.75f, true);
    }

    public DefaultLruCache(int capacity){ // super is necessary beacause I need access order that runs on least recently used
        // and to enable accessOrder the super constructor fromlinkedhashmap must be present with true set on accessorder
        super (capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override // why rewrite a new method from 0 if I can get the already wrote method from hashmap ?
    public void put(int key, int value){
        super.put(key, value);
    }
    @Override // same concept as put
    public int get(int key){
        Integer insertedKey = super.get(key); // being null a reference that means insertedKey must be a reference as weel so
        // it's not int type but Integer type data
        if (insertedKey == null) {
            return -1;
        }
        return super.get(key);
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest){
        return size() > capacity;
    }

}
