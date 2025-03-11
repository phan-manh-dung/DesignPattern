package observerPattern;

class ConcreteMember implements Member {
    private String name;

    public ConcreteMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " nhận được: " + message);
    }
}
