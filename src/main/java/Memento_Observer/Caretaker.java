package Memento_Observer;

import java.util.Stack;

class Caretaker {
    final Stack<Memento> undoStack = new Stack<>();
    private final Stack<Memento> redoStack = new Stack<>();

    public void addMemento(Memento memento) {
        undoStack.push(memento);
        redoStack.clear();
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
