package Collections;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListHW {
    public static void main(String[] args) {
        
        // Create a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("Cherry");
        list.add("Mango");
        list.add("Kiwi");
        list.add("Grapes");
        list.add("Orange");

        System.out.println("Original LinkedList: " + list);
        Iterator<String> itr = list.iterator();
        while(itr.hasNext())
        {
        	String str = itr.next();
        	if(str.toLowerCase().contains("a"))
        	{
        		itr.remove();//Safe removal using iterator
        	}
        }
        System.out.println("Linked list after removing Strings containing letter 'a': "+list);
        /*while (itr.hasNext()) {
            String str = itr.next();

            // ✅ Basic method: Manually check each character
            boolean hasA = false;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
                    hasA = true;
                    break;
                }
            }

            if (hasA) {
                itr.remove();
            }
        }*/
}
}