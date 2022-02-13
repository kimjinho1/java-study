package collection.hashmap;

// HashMap : 검색을 위한 자료구조
// key-value를 쌍으로 관리하는 메서드를 구현
public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member member1 = new Member(1001, "김진호");
        Member member2 = new Member(1002, "신현수");
        Member member3 = new Member(1003, "빌게이츠");
        Member member4 = new Member(1004, "주커버그");

        memberHashMap.addMember(member1);
        memberHashMap.addMember(member2);
        memberHashMap.addMember(member3);
        memberHashMap.addMember(member4);

        memberHashMap.showAllMember();

        memberHashMap.removeMember(1003);
        memberHashMap.showAllMember();
    }
}
