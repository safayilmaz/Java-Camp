package Interface;

public class FileLogger implements Logger{

    public void Logger (String message){
        System.out.println(message + " is logged into the file");

    }
}
