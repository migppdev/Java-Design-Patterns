package singletonPatternLogger;

public class Log {
	
	private String msg;
	private LogLevel logLevel;
	
	/**
	 * 
	 * @param msg The log message
	 * @param logLevel The log level (INFO, WARNING, ERROR)
	 */
	public Log(String msg, LogLevel logLevel) {
		this.msg = msg;
		this.logLevel = logLevel;
	}

	public String getMsg() {
		return msg;
	}

	public LogLevel getLogLevel() {
		return logLevel;
	}
	
}
