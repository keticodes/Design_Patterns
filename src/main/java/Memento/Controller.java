package Memento;

import java.util.Stack; // Import Stack for using as redo list

public class Controller {
    private Model model;
    private Gui gui;
    private Stack<IMemento> undoStack; // Undo list
    private Stack<IMemento> redoStack; // Redo list

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            IMemento previousState = undoStack.pop();
            redoStack.push(model.createMemento()); // Save current state to redo
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            IMemento nextState = redoStack.pop();
            undoStack.push(model.createMemento()); // Save current state to undo
            model.restoreState(nextState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        undoStack.push(model.createMemento());
        redoStack.clear(); // Clear redo stack when new changes made
    }
}
