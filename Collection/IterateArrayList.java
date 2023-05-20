package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class IterateArrayList {
    
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("one","two","three","four","five");
        
        /* Traversal in ArrayList */

        //Method-1: using simple loop 
        System.out.println("Simple for loop: ");
        for(int i=0; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }

        //Method-2: using Enhanced for loop
        System.out.println("Enhanced for loop: ");
        for(String str : list1){
            System.out.println(str);
        }

        //Method-3: using Java 8 features (Stream + lambda)
        System.out.println("Stream + lambda: ");
        list1.stream().forEach(str->System.out.println(str));

        //Module-4: using Java 8 features (ForEach + lambda)
        System.out.println("forEach + lambda: ");
        list1.forEach(str->System.out.println(str));

        //Method-5: using Iterator - While loop
        System.out.println("Using iterator - While loop: ");
        Iterator it = list1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Method-6: using Iterator - For loop
        System.out.println("Using iterator - for loop: ");
        for(Iterator itr = list1.iterator();itr.hasNext();){
            System.out.println(itr.next());
        }
    }
}
