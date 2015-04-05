package it.univaq.flyaq.flightinstructor.utils;

public class Logger {

	public static final int   DEBUG = 0;
	public static final int    INFO = 1;
	public static final int WARNING = 2;
	public static final int   ERROR = -1;

	public static void log(int severity, String msg) {

		System.out.println(msg);
		
	}

}
