package it.univaq.flyaq.rest.util;

public class RestUtil {

	private static String jsonExtendedMissionsMM = null;
	private static String jsonDrones = null;

	public static String surroundBy (String string, String symbol) {
		return symbol + string + symbol;
	}

	public static void setJsonExtendedMissionsMM (String json) {
		jsonExtendedMissionsMM = json;
	}
	
	public static String getJsonExtendedMissionsMM() {
		return jsonExtendedMissionsMM;
	}

	public static void setJsonDrones (String json) {
		jsonDrones = json;
	}
	
	public static String getJsonDrones() {
		return jsonDrones;
	}
}
