package access.modifier;

// 접근 제어 지시자(access modifier)와 정보은닉(infomation hiding)
// 객체의 멤버 변수에 접근 제한을 가함 -> public 메서드를 사용해서 멤버 변수를 입력하거나 읽어야 함
// -> 메서드 딴에서 잘못된 입력을 처리할 수 있으므로 객체를 사용할 때 오류가 나지 않음
// -> 만약 오류가 났더라도 매서드 부분만 확인하면 되니까 디버깅하기도 편함
public class AccessModifier {
    public static void main(String[] args) {
        BirthDay date = new BirthDay();
        date.setYear(2022);
        date.setMonth(1);
        date.setDay(32);

        date.showDate();

        System.out.println(date.getIsValid());
    }
}
