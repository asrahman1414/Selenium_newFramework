package com.boaFramework.companyName.projectName;

public class resourceHelper {

	public static String getresourcePath(String path) {
		                  

		String	basepath = System.getProperty("dir");
		return basepath + path;
	
}

public static void main(String[]args) {
	
	String path = resourceHelper.getresourcePath ("src/main/resources/configurationFile/log4j.properties");
	System.out.println(path);
}



}
