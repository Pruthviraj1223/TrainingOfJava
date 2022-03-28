import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class HashmapPractice {
    public static void main(String args[ ]) throws NoSuchFieldException, IllegalAccessException {


        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"basketball");
        hashMap.put(3,"tennis");
        hashMap.put(2,"golf");
        hashMap.put(4,"badminton");
        hashMap.put(5,"Cricket");

        HashMap<Integer,String> hashMap2 = new HashMap<>();
        hashMap2.putAll(hashMap);
        hashMap2.putIfAbsent(6,"new name");
        hashMap2.remove(4,"badminton");
        hashMap2.getOrDefault(10,"anything");
        Collection<String> collection = hashMap2.values();

        hashMap2.compute(2,(k,v)-> v.equalsIgnoreCase("tennis")?v.concat(" table "):v.concat(" lawn "));
        hashMap2.computeIfAbsent(19,k -> "Pruthviraj");
        hashMap2.putIfAbsent(22,null);
        hashMap2.computeIfPresent(1, (k,v) -> " cricket ");
        System.out.println("hash map2 = " + hashMap2.getOrDefault(5,"anything"));
        System.out.println("colelction = " + collection);

        System.out.println("hashmap 2 = " + hashMap2);

        System.out.println(hashMap);
        System.out.println("size = " + hashMap.size());
//        hashMap.clear();
//        System.out.println(" AFter clear = " + hashMap);

        hashMap.replace(4,"Football ");
        hashMap.remove(4);

        Set<Integer> keySet =  hashMap.keySet();
        System.out.println("key set " + keySet);

        for(Map.Entry<Integer,String> entry: hashMap.entrySet()) {
            System.out.println( "key = " + entry.getKey() + "hash = " + entry.hashCode());
        }
        System.out.println("foreach loop using .. ..");

        ArrayList<String> stringArrayList = new ArrayList<>();
        AtomicInteger count= new AtomicInteger();
        hashMap.forEach((integer, s) -> {

        });
        System.out.println("list = " + stringArrayList);
        System.out.println("array list = " + stringArrayList.get(stringArrayList.size()-1));


    }
}
