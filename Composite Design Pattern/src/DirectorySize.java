public class DirectorySize {

    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.addEntry(new File("file1.txt", 10));
        root.addEntry(new File("file2.jpg", 50));

        Folder subfolder = new Folder("subfolder");
        subfolder.addEntry(new File("file3.pdf", 20));
        root.addEntry(subfolder);

        SizeCalculator visitor = new SizeCalculator();
        root.accept(visitor);

        int totalSize = root.getSize();

        System.out.println("Total directory size: " + totalSize + " bytes");
    }
}
