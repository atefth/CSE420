import java.util.ArrayList;
import java.util.Stack;

public class Main  {

	public static String[] terminalsArray = {new String("id"), new String("+"), new String("*"), new String("("), new String(")"), new String("$")};
	public static String[] nonTerminalsArray = {new String("E"), new String("E'"), new String("T"), new String("T'"), new String("F")};
	public static String[] input = new String("( id * id ) + id $").split(" ");
	public static Stack<String> stack = new Stack<String>();
	public static Language lang = new Language(terminalsArray, nonTerminalsArray);	
	public static String[] keys = { "E|id", "T|id", "F|id", "E'|+", "T'|+", "T'|*", "E|(", "T|(", "F|(", "E'|)", "T'|)", "E'|$", "T'|$" };
	public static String[] values = { "E -> T E'", "T -> F T'", "F -> id", "E' -> + T E'", "T' -> #", "T' -> * F T'", "E -> T E'", "T -> F T'", "F -> ( E )", "E' -> #", "T' -> #", "E' -> #", "T' -> #"};
	public static Grammar gram = new Grammar(keys, values);

	public static void main(String[] args) {

		stack.push("$");
		stack.push("E");
		int currentInput = 0;
		String inputTop = "" + input[currentInput];
		String stackTop;
		Stack<String> temp = new Stack<String>();
		// gram.debug();
		while (currentInput < input.length - 1) {
			stackTop = stack.peek();
			if (inputTop.equals(stackTop)) {
				currentInput++;
				stackTop = stack.pop();
				inputTop = "" + input[currentInput];
			}else{
				String production = gram.get(stackTop+"|"+inputTop);
				stackTop = stack.pop();	
				if (production != null) {
					if (production.charAt(production.length()-1) != '#') {
						String literals[] = production.split(" ");

						for (int i = 2; i < literals.length; i++) {
							temp.push(literals[i]);
						}
						while (temp.size() != 0) {
							String val = temp.pop();
							stack.push(val);
						}
					}
					System.out.println(production);
				}
			}
		}
	}
}