package Memento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Memento implements IMemento {
    // Existing code...

    private LocalDateTime timestamp; // Add timestamp

    public Memento(int[] options, boolean isSelected) {
        // Existing code...
        this.timestamp = LocalDateTime.now(); // Record timestamp when memento is created
    }

    public String getMetadata() {
        // Return metadata as a formatted string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "State saved at " + timestamp.format(formatter);
    }
}
