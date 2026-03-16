package singletonPatternLogger;

import java.util.ArrayList;
import java.util.List;


public class Logger {
	
	private static Logger instance;
	private List<Log> logList = new ArrayList<>();
	private int logCounter;
	
	// Private method to avoid external instantiation
	private Logger() {}
	
	// Method that returns the instance
	public static Logger getInstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}
	
	public void logInfo(String msg) {
		logList.add(new Log(msg, LogLevel.INFO));
		logCounter++;
	}

	public void logWarning(String msg) {
		logList.add(new Log(msg, LogLevel.WARNING));
		logCounter++;
	}
	
	public void logError(String msg) {
		logList.add(new Log(msg, LogLevel.ERROR));
		logCounter++;
	}
	
	public int getLogCounter() {
		return logCounter;
	}
	
	
	// Show all logs
	public void showLogs() {
		System.out.printf("===== LOGS (%d) =====%n", logCounter);
		for (Log log : this.logList) {
			System.out.printf("[%s] %s%n", log.getLogLevel(), log.getMsg());
		}
	}
	
	// Show logs with a specific log level (method overloading)
	public void showLogs(LogLevel logLevel) {
		System.out.printf("===== LOGS (%d) =====%n", logCounter);
		for (Log log : this.logList) {
			if (log.getLogLevel() == logLevel) {
				System.out.printf("[%s] %s%n", log.getLogLevel(), log.getMsg());

			}
		}
	}
}
