package com.boaFramework.companyName.projectName.helper.logger;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

import com.boaFramework.companyName.projectName.resourceHelper;

public class LoggerHelper {
	
	private static boolean  root=false;
	
	public static Logger getLogger(Class cls) {
		if (root) {
			return getLogger(cls);
			
		}
		Object getresourceHelper;
		PropertyConfigurator.configure(resourceHelper.getresourcePath("src/main/java/com/boaFramework/companyName/projectName/helper/logger/logger.java"));
	
		root = true;
		return getLogger(cls);
	
	
	
	}
	
	public static void main(String[]args) {
	Logger log	= LoggerHelper.getLogger(LoggerHelper.class);
	log.info("Logger is configured");
	log.info("Logger is configured");
	log.info("Logger is configured");
	log.info("Logger is configured");
	log.info("Logger is configured");
		
	}
}
	
	
	
	
	


