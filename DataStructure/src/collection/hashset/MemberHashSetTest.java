package collection.hashset;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member member1 = new Member(1, "김진호");
        Member member2 = new Member(2, "신현수");
        Member member3 = new Member(3, "빌게이츠");
        Member member4 = new Member(4, "주커버그");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);
        memberHashSet.addMember(member4);
        memberHashSet.showAllMember();

        Member memberB = new Member(3, "빌게이츠");
        memberHashSet.addMember(memberB);
        memberHashSet.showAllMember();
    }
}
