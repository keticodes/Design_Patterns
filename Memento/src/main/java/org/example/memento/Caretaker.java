package Memento_Observer;

import com.sun.javafx.UnmodifiableArrayList;

import java.util.Stack;

// Caretaker
class Caretaker {
    public final Stack<Memento> undoStack = new Stack<>();
    private final Stack<Memento> redoStack = new Stack<>();

    public void addMemento(Memento memento) {
        undoStack.push(memento);
        redoStack.clear(); // Clear redo stack on new change
    }

    public Memento undo() {
        if (!undoStack.isEmpty()) {
            Memento memento = undoStack.pop();
            redoStack.push(memento);
            return memento;
        }
        return null;
    }

    public Memento redo() {
        if (!redoStack.isEmpty()) {
            Memento memento = redoStack.pop();
            undoStack.push(memento);
            return memento;
        }
        return null;
    }
}
