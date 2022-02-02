package linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList numbers = new MyLinkedList();

//        numbers.addFirst(40);
//        numbers.addFirst(30);
//        numbers.addFirst(20);
//        numbers.addFirst(10);
//        numbers.add(3, 35);
//
//        System.out.println(numbers.remove(2));
//        System.out.println(numbers.removeLast());
//        System.out.println(numbers.get(1));
//        System.out.println(numbers.indexOf(20));
//        System.out.println(numbers);

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);

        MyLinkedList.ListIterator i = numbers.listIterator();

        i.add(5);
        i.next();
        i.add(15);
        System.out.println(numbers);

        while (i.hasNext()) {
            if ((int) i.next() == 20) {
                i.remove();
            }
        }
        System.out.println(numbers);
    }
}
