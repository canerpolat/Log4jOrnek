package com.caner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {

	static Logger logger = Logger.getLogger(Log4j.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");
		logger.debug("debug message");
		logger.info("info message");
		logger.warn("warn message");
		logger.error("error message");
		logger.fatal("fatal message");

		/*
		 * XML konfigurasyon dosyamiza ulasirken , PropertyConfigurator yerine
		 * DOMConfigurator sinifini kullaniyoruz.
		 */

	}

}
