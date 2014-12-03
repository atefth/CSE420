import java.util.HashMap;

public class Grammar {
	private HashMap<String, String> productions;
	public Grammar(String[] keys, String[] values){
		productions = new HashMap<String, String>();
		int index = 0;
		for (String string : keys) {
			productions.put(string, values[index]);
			index++;
		}
	}
	public void set(String key, String value) {
		productions.put(key, value);
	}
	public String get(String key) {
		return productions.get(key);
	}
	public void debug() {
		for (String key : productions.keySet()) {
			System.out.println("["+key+"] => "+productions.get(key));
		}
	}
}