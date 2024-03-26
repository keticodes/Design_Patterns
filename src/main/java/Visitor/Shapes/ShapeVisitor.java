package Visitor.Shapes;

public interface ShapeVisitor {
    void visit(Rectangle rectangle);
    void visit(Line line);
    void visit(Triangle triangle);
}
