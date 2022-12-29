import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //--> Collection Interface
        Collection arr = new ArrayList<>();

//--------------------------------------------------------------------------------------------------------------//

            //--> ArrayList implementation

        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(100);
        arrList.add(200);
        arrList.add(200);
        arrList.add(135);
        arrList.add(90);
        System.out.println(arrList);
        System.out.println(arrList.size());

        // remove a item from the arrayList
        arr.remove(1);

        // create object using Iterator interface
        Iterator ite = arrList.iterator();
        // print arrayList item one by one
        // check for the next item and print the item
        while (ite.hasNext()){
            System.out.println(ite.next());  // print the item
        }
        // sort the arrayList
        Collections.sort(arrList);
        System.out.println(arrList);


//--------------------------------------------------------------------------------------------------------------//

            //--> ArrayList with user defined class variables

        ArrayList<Parent> classArray = new ArrayList<Parent>();
        // parent class object 1
        Parent p1 = new Parent(1,2,3);
        // parent class object 2
        Parent p2 = new Parent(4,5,6);

        classArray.add(p1);
        classArray.add(p2);

        Iterator ite2 = classArray.iterator();
        while (ite2.hasNext()){
            System.out.println( ( (Parent)ite2.next() ).b );
            System.out.println( ( (Parent)ite2.next() ).b );
        }

            // child class access by parent object ArrayList in extends Parent class

        ArrayList<Parent> a = new ArrayList<Parent>(); // new array using Parent class object Generics

        Child c1 = new Child(1,2,3,4);  // Child class object 1
        Child c2 = new Child(7,8,9,0);  // Child class object 2

        a.add(c1);  // add c1 object to a ArrayList
        a.add(c2);  // add c2 object to a ArrayList
            // Iterator using to print item one by one in ArrayList
        Iterator i = a.iterator();
        while (i.hasNext()){
            System.out.println( ( (Child)i.next() ).d );
            System.out.println( ( (Child)i.next() ).a );
        }

//--------------------------------------------------------------------------------------------------------------//

            //--> LinkedList implementation

        LinkedList<String> list2 = new LinkedList<String>();

        





        









    }
}