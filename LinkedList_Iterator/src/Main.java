import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        for (int i = 1; i <= 4; i++){
            list.add(i);
        }
        list.addFirst(12);
        list.remove(2);
        list.get(3);
        list.contains(2);
        list.clear();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int result = iterator.next();
            System.out.println(result);
        }
    }
}