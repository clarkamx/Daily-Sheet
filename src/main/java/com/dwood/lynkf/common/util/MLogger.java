package com.dwood.lynkf.common.util;

import org.apache.log4j.Logger;

public class MLogger {
	private static Logger logger;
	
	private MLogger() {
	}
	
	public static Logger getLogger() {
		if(logger == null) {
			logger = Logger.getLogger("com.dwood.lynkf");
		}
		return logger;
	}
}
