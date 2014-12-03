import java.util.HashMap;

public class Table {
	private HashMap<String, String> matrix;
	public Table(Grammar[] rules, Language[] syllables){
		matrix = new HashMap<String, String>();
		for (Grammar rule : rules) {
			for (Language syllable : syllables) {
				matrix.put(rule+"|"+syllable, "$");
			}
		}
	}
	public void set(String rule, String syllable, String production) {
		matrix.put(rule+"|"+syllable, production);
	}

	public String get(Grammar rule, Language syllable) {
		return matrix.get(rule.get()+"|"+syllable.get());
	}

	public String get(String rule, String syllable) {
		return matrix.get(rule+"|"+syllable);
	}
}