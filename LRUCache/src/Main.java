import java.util.LinkedHashMap;

public class Main {
    // Implement LRU cache on the basis of LinkedHashMap
    //
    //
    //Create the next interface
    //
    //
    //public interface LruCache {
    //
    //
    //
    ///**
    //
    //* @return the value of the key if the key exists,
    //
    //* otherwise return -1
    //
    //*/
    //
    //int get(int key);
    //
    //
    ///**
    //
    //* Update the value of the key if the key exists.
    //
    //* Otherwise, add the key-value pair to the cache.
    //
    //* If the number of keys exceeds the capacity from this operation,
    //
    //* evict the least recently used key.
    //
    //*/
    //
    //void put(int key, int value);
    //
    //
    ///**
    //
    //* Set the max capacity of the cache
    //
    //*/
    //
    //void setCapacity(int capacity);
    //
    //}
    //
    //
    //
    //b. Implement LruCache interface in class DefaultLruCache
    public static void main(String[] args) {
        DefaultLruCache cache = new DefaultLruCache(2);
        cache.put(1,1);
        cache.put(2,2);
        cache.get(1);
        cache.put(4,4);
    }
}