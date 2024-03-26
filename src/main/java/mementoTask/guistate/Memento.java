package mementoTask.guistate;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Memento implements iMemento {

    private LocalDateTime timestamp;
    private int[] state;
    private boolean isSelected;

    public Memento(int[] state, boolean isSelected) {
        this.state = state;
        this.isSelected = isSelected;
        this.timestamp = LocalDateTime.now();
    }

    @Override
    public int[] getOptions() {
        return state;
    }

    @Override
    public boolean isSelected() {
        return isSelected;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "timestamp=" + timestamp +
                ", state=" + Arrays.toString(state) +
                ", isSelected=" + isSelected +
                '}';
    }
}