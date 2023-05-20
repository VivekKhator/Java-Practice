package Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// class MySort implements Comparator{

//     @Override
//     public int compare(Integer i1, Integer i2){

//         return i1;
//     }
// }

public class SortArrayList{
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,24,6,8,0,2);
        
        /* ArrayList sorting techniques */
        //Method-1: using Collections in-built method
        Collections.sort(list1);
        System.out.println("Sorted in ASC using In-built method: "+list1);
        Collections.reverse(list1);
        System.out.println("Sorted in DSC using In-built method: "+list1);

        //Method-2: using Comparable interface
        Collections.sort(list1, new Comparator<Integer>(){
            @Override
            public int compare(Integer i1, Integer i2){
                return (int)i1-i2; //if want to reverse then change order i2-i1
            }
        });
        System.out.println("using comparable interface1: "+list1);

        //if data is of user defined  - Sort emp details based on the salary
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Ramesh",34000L));
        emp.add(new Employee(2,"Mahesh",40000L));
        emp.add(new Employee(3,"Suresh",14000L));
        emp.add(new Employee(4,"Dinesh",3000L));

        Collections.sort(emp, (o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
        System.out.println("Sort emp details based on the salary: ");
        for(Employee e : emp){
            System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getSalary());
        }
        
        Collections.sort(emp, (o1,o2)->(o1.getName().compareTo(o2.getName())));
        System.out.println("Sort emp details based on the name: ");
        for(Employee e : emp){
            System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getSalary());
        }

        //Method-3: using comparator with lambda expression
        Collections.sort(list1, (o1,o2)->(int)(o1-o2));
        System.out.println("using comparator with lambda expression(Integer): "+list1);

        List<String> list2 = Arrays.asList("one","four","two","three","five");
        Collections.sort(list1, (o1,o2)->o1.compareTo(o2));
        System.out.println("using comparator with lambda expression(String): "+list2);



    }
}
