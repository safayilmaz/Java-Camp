package Interface;

public class SmsLogger implements Logger{

    @Override
    public void Logger(String message) {

        System.out.println(message + " is logged into the file");
    }
}
