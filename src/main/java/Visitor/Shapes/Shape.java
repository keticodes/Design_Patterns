package Visitor.Shapes;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
