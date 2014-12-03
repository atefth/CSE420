public class Language {

	private String[] terminals;
	private String[] nonTerminals;

	public Language(String[] tArray, String[] nTArray){
		terminals = tArray;
		nonTerminals = nTArray;
	}

	public int getIndexOf(String value, int type) {
		if (type == 0) {
			for (int i = 0; i < terminals.length - 1; i++) {
				if (value.equals(terminals[i])) {
					return i;
				}
			}
		}else{
			for (int i = 0; i < nonTerminals.length - 1; i++) {
				if (value.equals(nonTerminals[i])) {
					return i;
				}
			}
		}
		return -1;
	}
}