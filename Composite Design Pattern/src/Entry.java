public interface Entry {
    String getName();
    int getSize();
    void accept(Visitor visitor);
}
