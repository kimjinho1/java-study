package collection.treeset;

// TreeSet : 객체의 정렬에 사용하는 클래스
// Set 인터페이스를 구현하여 중복을 허용하지 않고, 오름차순이나 내림차순으로 객체를 정렬할 수 있다
// 비교 대상이 되는 객체에 Comparable이나 Comparator 인터페이스를 구현해야 TreeSet에 추가가 가능하다
public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member member3 = new Member(3, "빌게이츠");
        Member member1 = new Member(1, "김진호");
        Member member2 = new Member(2, "신현수");

        memberTreeSet.addMember(member3);
        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2);
        memberTreeSet.showAllMember();
    }
}
