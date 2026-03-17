package singletonPatternLogger;

public class MainLogger {
	public static void main(String[] args) {
		
		// Store the global Logger instance
		Logger logger = Logger.getInstance();
		
	
		// Add logs
		logger.logError("Failed trying to read file");
		logger.logInfo("System access");
		logger.logWarning("Carga del sistema (1055ms)");
		logger.logInfo("Loaded drivers");
		
		// Show only logs with log level INFO
		logger.showLogs(LogLevel.INFO);
		
		System.out.println();
		
		// Show all logs
		logger.showLogs();
	}
}
