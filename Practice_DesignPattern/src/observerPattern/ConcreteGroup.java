package observerPattern;

import java.util.ArrayList;
import java.util.List;

class ConcreteGroup implements Group {
    private List<Member> members = new ArrayList<>();
    private String message;

    @Override
    public void registerObserver(Member member) {
        members.add(member);
    }

    @Override
    public void removeObserver(Member member) {
        members.remove(member);
    }

    @Override
    public void notifyObservers() {
        for (Member member : members) {
            member.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}