package arraylist.review;

public class MyArrayListTest {
    public static void main(String[] args) {

        MyArrayList numbers = new MyArrayList();

        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);
        System.out.println(numbers);
        System.out.println();

//        numbers.add(1, 15);
//        System.out.println(numbers);
//        System.out.println();
//
//        numbers.addFirst(5);
//        System.out.println(numbers);
//        System.out.println();
//
//        System.out.println(numbers.remove(1));
//        System.out.println();
//
//        numbers.removeFirst();
//        numbers.removeLast();
//        System.out.println(numbers);
//        System.out.println();
//
//        System.out.println(numbers.get(2));
//        System.out.println(numbers.indexOf(15));
//        System.out.println(numbers.size());
//        System.out.println(numbers);


        MyArrayList.ListIterator li = numbers.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
        System.out.println();

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
        System.out.println();

        while (li.hasNext()) {
            int num = (int) li.next();
            if (num == 20) {
                li.remove();
            }
        }
        System.out.println(numbers);
    }
}
