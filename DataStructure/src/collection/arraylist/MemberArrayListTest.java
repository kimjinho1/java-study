package collection.arraylist;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(1, "김진호");
        Member member2 = new Member(2, "신현수");
        Member member3 = new Member(3, "빌게이츠");
        Member member4 = new Member(4, "주커버그");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);
        memberArrayList.addMember(member4);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(member3.getMemberId());
        memberArrayList.showAllMember();
    }
}