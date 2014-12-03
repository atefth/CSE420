import java.util.ArrayList;
import java.util.Stack;

public class Main  {

	public static Language[] syllables = {new Language("id"), new Language("+"), new Language("*"), new Language("("), new Language(")"), new Language("$")};
	public static Grammar[] rules = {new Grammar("E"), new Grammar("E'"), new Grammar("T"), new Grammar("T'"), new Grammar("F")};
	public static Stack<String> stack = new Stack<String>();
	public static String[] input = new String("( id * id ) + id $").split(" ");

	public static void main(String[] args) {
		Table matrix = new Table(rules, syllables);
		matrix.set("E", "id", "E -> T E'");
		matrix.set("T", "id", "T -> F T'");
		matrix.set("F", "id", "F -> id");
		matrix.set("E'", "+", "E' -> + T E'");
		matrix.set("T'", "+", "T' -> #");
		matrix.set("T'", "*", "T' -> * F T'");
		matrix.set("E", "(", "E -> T E'");
		matrix.set("T", "(", "T -> F T'");
		matrix.set("F", "(", "F -> ( E )");
		matrix.set("E'", ")", "E' -> #");
		matrix.set("T'", ")", "T' -> #");
		matrix.set("E'", "$", "E' -> #");
		matrix.set("T'", "$", "T' -> #");

		stack.push("$");
		stack.push("E");
		// for (Grammar g : rules) {
		// 	for (Language i : syllables) {
		// 		System.out.println("["+g.get()+", "+i.get()+"] => "+matrix.get(g,i));
		// 	}
		// }
		int currentInput = 0;
		String inputTop = "" + input[currentInput];
		String stackTop;
		Stack<String> temp = new Stack<String>();
		while (currentInput < input.length - 1) {
			stackTop = stack.peek();
			if (stackTop.equals("$")) {
				break;
			}
			if (inputTop.equals(stackTop)) {
				currentInput++;
				stackTop = stack.pop();
				inputTop = "" + input[currentInput];
			}else{
				String production = matrix.get(stackTop, inputTop);
				if (production != null) {
					stackTop = stack.pop();					
					if (production.charAt(production.length()-1) != '#') {
						String literals[] = production.split(" ");

						for (int i = 2; i < literals.length; i++) {
							temp.push(literals[i]);
						}
						while (temp.size() != 0) {
							String val = temp.pop();
							stack.push(val);
						}
						System.out.println(production);
					}
				}
			}
		}
	}
}