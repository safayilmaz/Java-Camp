package Interface;

public class DatabaseLogger implements Logger{

    @Override
    public void Logger(String message) {
        System.out.println(message + " is logged into the file");
    }
}
