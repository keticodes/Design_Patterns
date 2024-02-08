package LoggerSystem;

import java.io.*;

public class Logger {
    private static Logger logger;
    private PrintWriter printWriter;

    private Logger(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            printWriter = new PrintWriter(new BufferedWriter(fileWriter));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger("default_log.txt");
        }
        return logger;
    }

    public void setFileName(String fileName) {
        printWriter.close();
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            printWriter = new PrintWriter(new BufferedWriter(fileWriter));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(String message) {
        printWriter.println(message);
        printWriter.flush();
    }

    public void close() {
        printWriter.close();
    }
}
