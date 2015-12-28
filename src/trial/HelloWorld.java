package trial;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class HelloWorld {
	//log4j.properties C: log.out is the output
	static final Logger logger = Logger.getLogger(HelloWorld.class);
	public static void main(String[] args) {
		//BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("Hello World!");
		logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
				
		System.out.println("Hello World Java Program for Log4j");
	}
}
