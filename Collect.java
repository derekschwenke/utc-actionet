
import java.util.*;
import java.util.stream.IntStream;

public class Collect {

    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<Integer>();
        ArrayList<Integer> listB = new ArrayList<Integer>();

        IntStream.range(1, 10+1).forEach(i -> listA.add(i));
        IntStream.range(6, 15+1).forEach(i -> listB.add(i));

        Collections.shuffle(listA);
        Collections.shuffle(listB);
        
        printList("Shuffled A", listA);
        printList("Shuffled B", listB);

        TreeSet<Integer> result = new TreeSet<Integer>(Collections.reverseOrder());
        for (Integer i : listA) result.add(i);
        for (Integer i : listB) result.add(i);
        result.remove(result.toArray()[ result.size()/2 ]);        

        printList("Result C", result);
        System.out.println();
        
        HashMap<String, String> acronyms = new HashMap<String, String>();
        putIfAbsent(acronyms,"W3C","World Wide Web Consortium");
        putIfAbsent(acronyms,"HTTP","Hypertext Transfer Protocol");
        putIfAbsent(acronyms,"Ajax","Asynchronous JavaScript and XML");
        putIfAbsent(acronyms,"J2EE","Java 2 Enterprise Edition");
        putIfAbsent(acronyms,"REST","Representational State Transfer");
        putIfAbsent(acronyms,"REST","Representational State Transfer - Discarded"); // duplicate
        
        System.out.printf("\n%d Acronyms:\n===========\n", acronyms.size() );
    	for(String key : acronyms.keySet()){
            System.out.printf("  %8s: %s\n", key, acronyms.get(key));
        }
    }
    
    private static void putIfAbsent(Map<String, String> c, String key, String value) {
        if  (c.putIfAbsent(key, value) != null)
            System.out.printf("Warning duplicate key: \"%s\" \n",key);
    }

    private static void printList(String name, Collection<Integer> list){
        System.out.printf("%20s size=%2d %s\n",name, list.size(), list);
    }
}
