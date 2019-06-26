package support;

import java.util.HashMap;
import java.util.Map;

public class JsonSuporte {
	public static Map<String, Object> json = new HashMap<String, Object>();
	public static Map<String, Object> header = new HashMap<String, Object>();
	
	public void LimpaJson() {
		json.clear();
	}
	
	public void LimpaHeader() {
		header.clear();
	}
}
