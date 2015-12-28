package trial;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import org.apache.log4j.Logger;

import java.io.*;
import java.sql.SQLException;
import java.util.*;

//log4j.properties C: log.out is the output
public class hello {
	static Logger log = Logger.getLogger(hello.class.getName());

public static void main(String[] args) throws IOException,SQLException{
	PropertyConfigurator.configure("log4j.properties");
	log.debug("Hello this is an debug message");
	log.info("Hello this is an info message");

}
}
