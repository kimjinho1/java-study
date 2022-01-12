package array_of_object;

//      얕은 복사
//      객체 주소만 복사되어 한쪽 배열의 요소를 수정하면 같이 수정됨 -> 두 배열이 같은 객체를 가리킴
public class ShallowCopy {
    public static void main(String[] args) {
        Book[] library = new Book[3];
        Book[] copyLibaray = new Book[3];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");

        System.arraycopy(library, 0, copyLibaray, 0, 3);

        System.out.println("======copy library=========");
        for (Book book : copyLibaray) {
            book.showBookInfo();
        }

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        System.out.println("======library=========");
        for (Book book : library) {
            book.showBookInfo();
        }

        System.out.println("======copy library=========");

        for (Book book : copyLibaray) {
            book.showBookInfo();
        }
    }
}
