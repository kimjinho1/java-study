package collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// Comparator의 활용
// Comparable이 구현되어 있는 경우, Comparator로 비교하는 방식을 다시 구현할 수 있다
class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return (s1.compareTo(s2)) *-1 ;
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>(new MyCompare());
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");

        System.out.println(set);
    }
}
