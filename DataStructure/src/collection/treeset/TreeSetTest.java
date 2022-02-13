package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("김진호");
        treeSet.add("신현수");
        treeSet.add("빌게이츠");

        for (String str : treeSet) {
            System.out.println(str);
        }
    }
}
