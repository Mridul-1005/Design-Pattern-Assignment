import java.util.ArrayList;
import java.util.List;

public class Folder implements Entry{
    private final String name;
    private final List<Entry> entries;

    public Folder(String name) {
        this.name = name;
        this.entries = new ArrayList<>();
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (Entry entry : entries) {
            totalSize += entry.getSize();
        }
        return totalSize;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitFolder(this);
        for (Entry entry : entries) {
            entry.accept(visitor);
        }
    }
}
