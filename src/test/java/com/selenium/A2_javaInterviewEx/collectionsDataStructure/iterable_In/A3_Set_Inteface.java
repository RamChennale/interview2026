
import java.util.*;

    public static void main(String[] args) {
    }
    public static void SetHashSettest(){
        Set<String> set = new HashSet<>();

        set.add("Rahul");
        set.add("Priya");
        set.add("Rahul");

        System.out.println(set);

    }

    public static void HashSettest(){
        HashSet<String> set=new HashSet<String>();
        set.add("Andrew");
        set.add("Mark");
        set.add("Peter");
        set.add("Johnson");
        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

    public static void LinkedHashSettest(){

        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("Peter");
        set.add("Jack");
        set.add("Peter");
        set.add("Johnson");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public static void SortedSettest(){
        SortedSet<String> set = new TreeSet<>();

        set.add("Rahul");
        set.add("Priya");
        set.add("Amit");

        System.out.println(set);
    }


    public static void TreeSettest(){
        //Creating and adding elements
        TreeSet<String> set=new TreeSet<String>();
        set.add("Thomas");
        set.add("Davis");
        set.add("Thomas");
        set.add("Donald");
        //traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }


