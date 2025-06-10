import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        DefaultLruCache cache = new DefaultLruCache(2);
        cache.put(1,1);
        cache.put(2,2);
        cache.get(1);
        cache.put(4,4);
    }
}
