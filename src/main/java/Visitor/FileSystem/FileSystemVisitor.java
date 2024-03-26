package Visitor.FileSystem;

public interface FileSystemVisitor {
    void visit(File file);
    void visit(Directory dir);
}
