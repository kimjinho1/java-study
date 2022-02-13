package collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add(new String("김진호"));
        hashSet.add(new String("신현수"));
        hashSet.add(new String("빌게이츠"));
        hashSet.add(new String("주커버그"));

        System.out.println(hashSet);
    }
}
