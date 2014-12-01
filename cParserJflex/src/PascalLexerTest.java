import java_cup.runtime.Symbol;
import java.io.*;
public class PascalLexerTest {
	public static void main(String[] args) {
        Symbol sym;
        try {
            PascalLexer lexer = new PascalLexer(new FileReader(args[0]));
            for (sym = lexer.next_token(); sym.sym != 0;
                    sym = lexer.next_token()) {

                System.out.println("Token " + sym +
                    ", with value = " + sym.value + 
                    "; at line " + sym.left + ", column " + sym.right);
            }
        }
        catch (Exception e) {
        }
    }
}
