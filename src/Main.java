import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //-->  ## Collection Interface Framework ##

        //Collection arr = new ArrayList<>();

//--------------------------------------------------------------------------------------------------------------//

            //--> ArrayList implementation
                // used dynamical arrayList

        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(100);
        arrList.add(200);
        arrList.add(200);
        arrList.add(135);
        arrList.add(90);
        System.out.println(arrList);
        System.out.println(arrList.size());

        // remove a item from the arrayList
        arrList.remove(1);

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

                    // used doubly linkedList
                // we can use LinedList as a Stack or Queue
                    // in Stack -- >  we can add data using # push command or # add command
                        // and we can remove data from Stack using # pop command
                    // in Queue -- >  we can add data using # offer command or # add command
                        // and we can remove data from Queue using # poll command

        LinkedList<String> list2 = new LinkedList<String>();

        list2.add("chamara");
        list2.add("kawindu");
        list2.add("zara");
        list2.add("Chamara");
        list2.add("kamal");

        // print the LinkedList
        System.out.println(list2);

        //list2.remove();  // without index. remove the first element in the LinkedList
        //list2.remove(1);    // we can remove elements using their index

        System.out.println("First item : " + list2.getFirst());  // get the first item in LinkedList
        System.out.println("Last item : " + list2.getLast());    // get the last item in LinkedList

        // sort the linkedList values
        // firstly sorted Capital letters and after sort simple letters
        Collections.sort(list2);

        // get the item at top of the LinkedList
        System.out.println(list2.peek());

        // check the value is available in LinkedList
        System.out.println("is has this : " + list2.contains("chamara"));
        System.out.println(list2);

        // print the LinkedList value one by one using Iterator
        Iterator<String> ii = list2.iterator();
        while (ii.hasNext()){
            System.out.println(ii.next());
        }


//--------------------------------------------------------------------------------------------------------------//


            // --> Stack Data Structure -  Last in first out

        Stack<Integer> ss = new Stack<Integer>();
        boolean result = ss.empty();
        System.out.println("Is Stack empty before adding values : "+result);

        // add values to Stack using push command
        ss.push(123);
        ss.push(243);
        ss.push(100);
        ss.push(300);

        // print the current Stack
        System.out.println(ss);
        // print tha top of element in tha Stack
        System.out.println(ss.peek());

        // remove top of elements using pop command
        ss.pop();
        ss.pop();

        // print the Stack after pop command
        System.out.println(ss);
        // print the top of element after the pop command
        System.out.println(ss.peek());


//--------------------------------------------------------------------------------------------------------------//

            // --> Double Embed Queue - Deque  (   first in first out   )

                // null element can not be allowed
                // duplicate values can be allowed
                // can remove and ad value top and the bottom sides
                // we can use stack functions too
                // push , pop , offer , poll and related functions to them

        ArrayDeque<Integer> dd = new ArrayDeque<>();

        // add value to ArrayDeque
        dd.add(5);
        dd.add(10);
        dd.add(34);
        dd.add(14);
        System.out.println(dd);

        // add element to front
        dd.addFirst(1);
        // add element to rear
        dd.addLast(100);

        System.out.println(dd);

        // print first element from the Deque
        System.out.println("The first element : " + dd.getFirst());
        System.out.println("The first element : " + dd.peek());
        // print last element from the Deque
        System.out.println("The last element  : " + dd.getLast());

        dd.remove();      // remove the first element in default
        dd.removeFirst(); // remove the first element too
        dd.removeLast();  // remove last element in Deque
        System.out.println(dd);


//----------------------------------------------------------------------------------------------------------------------//

             // --> Stack Data Structure

        // ### this is the "last in first out" ###

        // in stack data structure, if we need to add a new value to stack, we used push function
        // and we use pop function to remove a value from the stack

        // create a stack
        Stack<String> stackOfBooks = new Stack<>();
        // check stack is empty or not
        System.out.println("before pushing "+stackOfBooks.empty());
        System.out.println("is Stack empty ? "+stackOfBooks.isEmpty());
        // pushing data to the Stack
        stackOfBooks.push("python notes");
        stackOfBooks.push("java notes");
        stackOfBooks.push("spring notes");
        stackOfBooks.push("php notes");
        stackOfBooks.push("bootstrap notes");

        // to view the stack
        System.out.println(stackOfBooks);

        // pop the stack and view the stack
        stackOfBooks.pop();
        System.out.println(stackOfBooks);
        stackOfBooks.pop();
        System.out.println(stackOfBooks);

        stackOfBooks.push("java fx notes");
        System.out.println(stackOfBooks);

        // view the value in top of the stack
        String topOfItem = stackOfBooks.peek();
        System.out.println("the top of value : " + topOfItem);
        // or
        System.out.println(stackOfBooks.peek());

//----------------------------------------------------------------------------------------------------------------------//

            // --> Queue Data Structure

        // ### this is the "first in first out" ###

        // in queue data structure, if we need to add a new value to queue, we used offer command
        // and we used poll command to remove a value from queue

        Queue<String> newQueue = new LinkedList<>();
        newQueue.offer("sanchitha");
        newQueue.offer("udana");
        newQueue.offer("wijesundara");
        newQueue.offer("vilayaya");

        // we can check queue is empty or not
        System.out.println(newQueue.isEmpty());
        // we can check size of the queue
        System.out.println(newQueue.size());
        // we can search the value, if available or not
        System.out.println(newQueue.contains("udana"));
        // we can get first value of the queue
        System.out.println(newQueue.peek());
        // we can get out value from Queue using poll
        System.out.println(newQueue);
        newQueue.poll();
        System.out.println(newQueue);
        // clear alla data included in Queue
        newQueue.clear();
        System.out.println(newQueue);


//----------------------------------------------------------------------------------------------------------------------//

            // --> Priority Queue

        // in the queue, when used while loop to poll values ,
        // the output show small value to large value  A to Z
        // to reverse the order   Z to A
        // Queue<Integer> nameOfNewObject = new PriorityQueue<>(Collections.reverseOrder());  <--  can use this code
        // in PriorityQueue calling Constructor inside " Collections.reverseOrder() "

        Queue<Integer> queuep = new PriorityQueue<>(Collections.reverseOrder());

        queuep.offer(100);
        queuep.offer(50);
        queuep.offer(70);
        queuep.offer(10);
        queuep.offer(15);

        // when the queue empty, while loop is running when the queue is empty
        while (!queuep.isEmpty()){
            System.out.println(queuep.poll());
        }

//----------------------------------------------------------------------------------------------------------------------//

            //--> LinkedList  as Stack and Queue

        LinkedList<String> linked1 = new LinkedList<String>();

        // we can use this LinkedList as Stack
        /*
        linked1.push("A");
        linked1.push("B");
        linked1.push("C");
        linked1.push("D");
        linked1.push("F");
        System.out.println("before pop "+linked1);
        linked1.pop();
        System.out.println("after pop "+linked1);
        */
        // using as a Queue

        linked1.offer("A");
        linked1.offer("B");
        linked1.offer("C");
        linked1.offer("D");
        linked1.offer("F");
        //System.out.println(linked1);
        //linked1.poll();
        // ada new values
        System.out.println(linked1);
        linked1.add(4,"E");
        System.out.println(linked1);
        linked1.add(6,"G");
        System.out.println(linked1);
        // remove value
        linked1.remove("G");
        System.out.println(linked1);
        // add a value to first
        linked1.addFirst("1");
        System.out.println(linked1);
        // add a value to last
        linked1.addLast("Z");
        System.out.println(linked1);
        // remove last and first value
        linked1.removeFirst();
        linked1.removeLast();
        // we can use remove function to remove first element
        linked1.remove();
        System.out.println(linked1);


//--------------------------------------------------------------------------------------------------------------//

            //--> Set Interface
                // can not use duplicate element
                // can use only one null value
                        // HashSet
                        // LinkedHashSet
                        // TreeSet

        //-->  HashSet

            // implemented from set interface
            // can not decide printing order

        HashSet<Integer> hset = new HashSet<>();

        // add element to HashSet
        hset.add(400);
        hset.add(200);
        hset.add(300);
        hset.add(100);
        hset.add(100);

        System.out.println(hset);

        // print the elements one by one using Iterator method
        Iterator <Integer> hi = hset.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }


//--------------------------------------------------------------------------------------------------------------//

            // --> LinkedHashSet
                // element access input order

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        // add element using add command
        lhs.add("B");
        lhs.add("A");
        lhs.add("Z");

        System.out.println(lhs);


//--------------------------------------------------------------------------------------------------------------//

            //--> TreeSet
                // access by as ordered list

        TreeSet <Integer> tset = new TreeSet<>();
        // add element to the TreeSet
        tset.add(1);
        tset.add(100);
        tset.add(0);

        System.out.println("TreeSet Element printing : " + tset);

        Iterator <Integer> www = tset.iterator();
        while(www.hasNext()){
            System.out.println(www.next());
        }

//--------------------------------------------------------------------------------------------------------------//


























        





        









    }
}