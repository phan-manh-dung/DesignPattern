package observerPattern;
public class Main {
    public static void main(String[] args) {
        ConcreteGroup group = new ConcreteGroup();
        Member member1 = new ConcreteMember("Anh");
        Member member2 = new ConcreteMember("Bình");

        group.registerObserver(member1);
        group.registerObserver(member2);

        group.setMessage("Họp nhóm lúc 10h sáng mai!");
    }
}