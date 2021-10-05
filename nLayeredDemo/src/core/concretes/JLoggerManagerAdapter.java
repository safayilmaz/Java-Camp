package core.concretes;

import core.abstracts.LoggerService;
import jLogger.jLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {
    @Override
    public void logToSystem(String message) {
        jLoggerManager jManager = new jLoggerManager();
        jManager.log(message);
    }
}
