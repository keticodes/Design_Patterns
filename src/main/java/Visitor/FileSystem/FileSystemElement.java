package Visitor.FileSystem;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}