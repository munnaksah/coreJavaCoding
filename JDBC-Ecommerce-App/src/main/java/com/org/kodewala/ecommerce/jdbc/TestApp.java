package com.org.kodewala.ecommerce.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
;

public class TestApp {

	private static final Logger logger = LogManager.getLogger(TestApp.class);

	public static void main(String[] args) {
//	
//		logger.error("Something went wrong");
//		logger.trace("Trace message");
//		logger.debug("Debug message");
//		logger.info("Application Started");
//		logger.warn("Warning message");

		
		logger.trace("Trace message");
		logger.debug("Debug message");
		logger.info("Info message");
		logger.warn("Warning message");
		logger.error("Error message");
		logger.fatal("Fatal message");
	}
}
