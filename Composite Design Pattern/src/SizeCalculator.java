public class SizeCalculator implements Visitor{
    private int totalSize;

    @Override
    public void visitFile(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visitFolder(Folder folder) {

    }

    public int getTotalSize() {
        return totalSize;
    }
}
