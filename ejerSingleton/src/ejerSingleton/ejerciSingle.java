package ejerSingleton;

public class ejerciSingle {

	import java.util.List;
	import java.util.ArrayList;

	public class Logger {
	    private static Logger instance;
	    private List<String> logMessages = new ArrayList<>();

	    private Logger() {
	        // Constructor private
	    }
	    
	    // Method static
	    public static Logger getInstance() {
	        if (instance == null) {
	            instance = new Logger();
	        }
	        return instance;
	    }
	    
	    // Add logs
	    public void addLogMessage(String message) {
	        logMessages.add(message);
	    }
	    
	    // Print logs
	    public void printLogs() {
	        for (String message : logMessages) {
	            System.out.println(message);
	        }
	    }
	}
}
