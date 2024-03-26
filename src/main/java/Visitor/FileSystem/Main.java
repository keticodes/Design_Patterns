package Visitor.FileSystem;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.jpg", 20);
        Directory subDir = new Directory("subDir");
        File file3 = new File("file3.txt", 30);

        root.addElement(file1);
        root.addElement(file2);
        root.addElement(subDir);
        subDir.addElement(file3);

        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size: " + sizeVisitor.getTotalSize());

        SearchVisitor searchVisitor = new SearchVisitor(".txt");
        root.accept(searchVisitor);
        System.out.println("Found files: " + searchVisitor.getFoundFiles().size());
    }
}