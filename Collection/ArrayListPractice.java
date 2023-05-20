package Collection;
import java.util.*;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        
        /*Methods to create ArrayList*/
        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("four");
        list1.add("five");

        System.out.println("List1: "+list1);

        /* By using array */
        List<String> list2 = Arrays.asList("six","seven","eight","nine","ten");
        System.out.println("List2: "+list2);

        /* By using collection */
        List<String> list3 = new ArrayList<>(list1);
        
        /* addAll() Method */
        list3.addAll(list2);  
        System.out.println("List3: "+list3);

        /* Check if ArrayList is empty */
        System.out.println("isEmpty(): "+list3.isEmpty());

        /* Access the element from ArrayList */
        System.out.println("Access element at index 0 from list2: "+list2.get(0));

        /* Check the size of the ArrayList */
        System.out.println("Size of arraylist list3: "+list3.size());

        /* replace an element at specific index */
        list3.set(0, null);
        System.out.println("Replaced null at index at 0: "+list3);

        /* Remove an element at specific index from list */
        list3.remove(0);
        System.out.println("Remove an element at index 0: "+list3);

        /* Remove an element from list */
        list3.remove("two");
        System.out.println("Remove two from list3: "+list3);

        /* Remove list2 from list3 */
        list3.removeAll(list2);
        System.out.println("removed list2 from list3: "+list3);
        
        /* Remove an integer from a collection */
        List<Integer> count = Arrays.asList(1,2,3,4,5,6);
        System.out.println("New List count: "+count);

        /*
        count.remove(Integer.valueOf(5));
        System.out.println("Remove integer 5 from list count: "+count);
        */

        /* Remove an element which starts which element 'e' */
        /*
        list2.removeIf(n->(n.charAt(0)=='e'));
        System.out.println("Remove element which starts with e: "+list2);
         */

        /* Remove all the elements from list */
        /* 
        list2.clear();
        System.out.println("Clear list2: "+list2);
        */

    }
}
