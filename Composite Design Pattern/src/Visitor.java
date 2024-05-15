public interface Visitor {
    void visitFile(File file);
    void visitFolder(Folder folder);
}
