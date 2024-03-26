package Visitor.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private String extension;
    private List<File> foundFiles = new ArrayList<>();

    public SearchVisitor(String extension) {
        this.extension = extension;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(extension)) {
            foundFiles.add(file);
        }
    }

    @Override
    public void visit(Directory dir) {
        for (FileSystemElement element : dir.getElements()) {
            element.accept(this);
        }
    }

    public List<File> getFoundFiles() {
        return foundFiles;
    }
}