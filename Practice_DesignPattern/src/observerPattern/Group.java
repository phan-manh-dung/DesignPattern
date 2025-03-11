package observerPattern;
interface Group {
    void registerObserver(Member member);
    void removeObserver(Member member);
    void notifyObservers();
}