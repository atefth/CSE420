/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Copyright (C) 2004-2014  Gerwin Klein <lsf@jflex.de>                    *
 * All rights reserved.                                                    *
 *                                                                         *
 * License: BSD                                                            *
 *                                                                         *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

import java.io.*;
import java.util.*;
// import java_cup.runtime.Symbol;
// import atef.java.symbols;

/**
 * Simple test driver for the java lexer. Just runs it on some
 * input files and produces debug output. Needs symbol class from
 * parser. 
 */
public class TestLexer {

  /** some numerals to for lexer testing */
  int intDec = 37;
  long longDec = 37l;
  int intHex = 0x0001;
  long longHex = 0xFFFFl;
  int intOct = 0377;
  long longOc = 007l;
  int smallest = -2147483648;   

  public static void main(String argv[]) {

    List<String> identifiers = new ArrayList<String>();
    List<String> integers = new ArrayList<String>();
    List<String> strings = new ArrayList<String>();

    for (int i = 0; i < argv.length; i++) {
      try {
        // System.out.println("Lexing ["+argv[i]+"]");
        Scanner scanner = new Scanner(new UnicodeEscapes(new FileReader(argv[i])));
                
        JavaSymbol s;
        String current;
        do {
          s = (JavaSymbol)scanner.next_token();
          current = s.isIdentifier();
          if (current.length() > 0) {
            identifiers.add(current);
          }
          current = s.isInteger();
          if (current.length() > 0) {
            integers.add(current);
          }
          current = s.isString();
          if (current.length() > 0) {
            strings.add(current);
          }
          // System.out.println(s);
        } while (s.sym != sym.EOF);

        System.out.print("Identifiers:");
        for (int j = identifiers.size() - 1; j > 0 ; j--) {
          current = identifiers.remove(j);
          System.out.print(" "+ current +" ");
        }
        System.out.println();

        System.out.print("Integers:");
        for (int j = integers.size() - 1; j > 0 ; j--) {
          current = integers.remove(j);
          System.out.print(" "+ current +" ");
        }
        System.out.println();

        System.out.print("Strings:");
        for (int j = strings.size() - 1; j > 0 ; j--) {
          current = strings.remove(j);
          System.out.print(" "+ current +" ");
        }
        System.out.println();

        System.out.println("No errors.");
      }
      catch (Exception e) {
        e.printStackTrace(System.out);
        System.exit(1);
      }
    }
  }
}
