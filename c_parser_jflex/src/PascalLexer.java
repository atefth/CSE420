/* The following code was generated by JFlex 1.6.0 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>A.flex</tt>
 */
import java_cup.runtime.Symbol;
class PascalLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\12\1\6\1\7\1\7\1\7\22\0\1\12\1\54\5\0"+
    "\1\5\1\45\1\46\1\37\1\40\1\44\1\41\1\4\1\42\12\2"+
    "\1\55\1\43\1\52\1\51\1\53\2\0\32\1\1\47\1\0\1\50"+
    "\1\0\1\3\1\0\1\13\1\20\1\32\1\15\1\21\1\26\1\22"+
    "\1\35\1\23\2\1\1\24\1\31\1\14\1\27\1\30\1\1\1\16"+
    "\1\25\1\34\1\33\1\36\2\1\1\17\1\1\1\10\1\0\1\11"+
    "\7\0\1\7\u1fa2\0\1\7\1\7\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\1\1\4\1\2\1\5\1\2"+
    "\10\3\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\22\1\2\1\23"+
    "\1\24\2\0\1\25\5\3\1\26\1\27\1\30\4\3"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\2\3\1\37"+
    "\4\3\1\40\2\3\1\41\2\3\1\42\1\43\1\44"+
    "\1\45\4\3\1\46\2\3\1\47";

  private static int [] zzUnpackAction() {
    int [] result = new int[78];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\134\0\212\0\270\0\346\0\56\0\u0114"+
    "\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256\0\u0284"+
    "\0\56\0\56\0\56\0\56\0\56\0\56\0\56\0\56"+
    "\0\56\0\56\0\56\0\u02b2\0\u02e0\0\u030e\0\u033c\0\270"+
    "\0\u036a\0\u0114\0\56\0\u0398\0\u03c6\0\u03f4\0\u0422\0\u0450"+
    "\0\134\0\134\0\134\0\u047e\0\u04ac\0\u04da\0\u0508\0\56"+
    "\0\56\0\56\0\56\0\56\0\134\0\u0536\0\u0564\0\134"+
    "\0\u0592\0\u05c0\0\u05ee\0\u061c\0\134\0\u064a\0\u0678\0\134"+
    "\0\u06a6\0\u06d4\0\134\0\134\0\134\0\134\0\u0702\0\u0730"+
    "\0\u075e\0\u078c\0\134\0\u07ba\0\u07e8\0\134";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[78];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\1\0"+
    "\1\10\1\2\1\7\1\11\4\3\1\12\1\13\1\3"+
    "\1\14\3\3\1\15\1\16\3\3\1\17\1\3\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\57\0"+
    "\3\3\7\0\24\3\21\0\1\4\1\0\1\40\53\0"+
    "\1\40\53\0\6\41\2\0\46\41\11\42\1\43\44\42"+
    "\1\0\3\3\7\0\1\3\1\44\1\3\1\45\20\3"+
    "\20\0\3\3\7\0\6\3\1\46\15\3\20\0\3\3"+
    "\7\0\1\3\1\47\7\3\1\50\12\3\20\0\3\3"+
    "\7\0\13\3\1\51\10\3\20\0\3\3\7\0\3\3"+
    "\1\52\7\3\1\53\10\3\20\0\3\3\7\0\3\3"+
    "\1\54\20\3\20\0\3\3\7\0\4\3\1\55\15\3"+
    "\1\56\1\3\20\0\3\3\7\0\1\57\23\3\70\0"+
    "\1\60\55\0\1\61\55\0\1\62\55\0\1\63\11\0"+
    "\1\64\51\0\3\3\7\0\2\3\1\65\21\3\20\0"+
    "\3\3\7\0\3\3\1\66\20\3\20\0\3\3\7\0"+
    "\7\3\1\67\14\3\20\0\3\3\7\0\2\3\1\70"+
    "\21\3\20\0\3\3\7\0\12\3\1\71\11\3\20\0"+
    "\3\3\7\0\14\3\1\72\7\3\20\0\3\3\7\0"+
    "\15\3\1\73\6\3\20\0\3\3\7\0\6\3\1\74"+
    "\15\3\20\0\3\3\7\0\3\3\1\75\20\3\20\0"+
    "\3\3\7\0\1\76\23\3\20\0\3\3\7\0\10\3"+
    "\1\77\13\3\20\0\3\3\7\0\6\3\1\100\15\3"+
    "\20\0\3\3\7\0\7\3\1\101\7\3\1\102\4\3"+
    "\20\0\3\3\7\0\6\3\1\103\15\3\20\0\3\3"+
    "\7\0\1\3\1\104\22\3\20\0\3\3\7\0\4\3"+
    "\1\105\17\3\20\0\3\3\7\0\1\3\1\106\22\3"+
    "\20\0\3\3\7\0\3\3\1\107\20\3\20\0\3\3"+
    "\7\0\6\3\1\110\15\3\20\0\3\3\7\0\1\111"+
    "\23\3\20\0\3\3\7\0\2\3\1\112\21\3\20\0"+
    "\3\3\7\0\16\3\1\113\5\3\20\0\3\3\7\0"+
    "\20\3\1\114\3\3\20\0\3\3\7\0\3\3\1\115"+
    "\20\3\20\0\3\3\7\0\6\3\1\116\15\3\17\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2070];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\4\1\1\11\11\1\13\11\5\1\2\0"+
    "\1\11\14\1\5\11\32\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[78];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */

/**
 * Return a new Symbol with the given token id, and with the current line and
 * column numbers.
 */
Symbol newSym(int tokenId) {
    return new Symbol(tokenId, yyline, yycolumn);
}

/**
 * Return a new Symbol with the given token id, the current line and column
 * numbers, and the given token value.  The value is used for tokens such as
 * identifiers and numbers.
 */
Symbol newSym(int tokenId, Object value) {
    return new Symbol(tokenId, yyline, yycolumn, value);
}



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  PascalLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 164) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;           
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { return newSym(sym.INT, new Integer(yytext()));
          }
        case 40: break;
        case 2: 
          { System.out.println("Illegal char, '" + yytext() +
                    "' line: " + yyline + ", column: " + yychar);
          }
        case 41: break;
        case 3: 
          { return newSym(sym.IDENT, yytext());
          }
        case 42: break;
        case 4: 
          { return newSym(sym.DOT);
          }
        case 43: break;
        case 5: 
          { /* Ignore whitespace. */
          }
        case 44: break;
        case 6: 
          { return newSym(sym.TIMES);
          }
        case 45: break;
        case 7: 
          { return newSym(sym.PLUS);
          }
        case 46: break;
        case 8: 
          { return newSym(sym.MINUS);
          }
        case 47: break;
        case 9: 
          { return newSym(sym.DIVIDE);
          }
        case 48: break;
        case 10: 
          { return newSym(sym.SEMI);
          }
        case 49: break;
        case 11: 
          { return newSym(sym.COMMA);
          }
        case 50: break;
        case 12: 
          { return newSym(sym.LEFT_PAREN);
          }
        case 51: break;
        case 13: 
          { return newSym(sym.RT_PAREN);
          }
        case 52: break;
        case 14: 
          { return newSym(sym.LEFT_BRKT);
          }
        case 53: break;
        case 15: 
          { return newSym(sym.RT_BRKT);
          }
        case 54: break;
        case 16: 
          { return newSym(sym.EQ);
          }
        case 55: break;
        case 17: 
          { return newSym(sym.GTR);
          }
        case 56: break;
        case 18: 
          { return newSym(sym.LESS);
          }
        case 57: break;
        case 19: 
          { return newSym(sym.COLON);
          }
        case 58: break;
        case 20: 
          { return newSym(sym.REAL, new Double(yytext()));
          }
        case 59: break;
        case 21: 
          { /* For this stand-alone lexer, print out comments. */
                  System.out.println("Recognized comment: " + yytext());
          }
        case 60: break;
        case 22: 
          { return newSym(sym.IF);
          }
        case 61: break;
        case 23: 
          { return newSym(sym.OR);
          }
        case 62: break;
        case 24: 
          { return newSym(sym.OF);
          }
        case 63: break;
        case 25: 
          { return newSym(sym.LESS_EQ);
          }
        case 64: break;
        case 26: 
          { return newSym(sym.GTR_EQ);
          }
        case 65: break;
        case 27: 
          { return newSym(sym.NOT_EQ);
          }
        case 66: break;
        case 28: 
          { return newSym(sym.ASSMNT);
          }
        case 67: break;
        case 29: 
          { return newSym(sym.CHAR, new Character(yytext().charAt(1)));
          }
        case 68: break;
        case 30: 
          { return newSym(sym.AND);
          }
        case 69: break;
        case 31: 
          { return newSym(sym.END);
          }
        case 70: break;
        case 32: 
          { return newSym(sym.VAR);
          }
        case 71: break;
        case 33: 
          { return newSym(sym.ELSE);
          }
        case 72: break;
        case 34: 
          { return newSym(sym.TYPE);
          }
        case 73: break;
        case 35: 
          { return newSym(sym.THEN);
          }
        case 74: break;
        case 36: 
          { return newSym(sym.ARRAY);
          }
        case 75: break;
        case 37: 
          { return newSym(sym.BEGIN);
          }
        case 76: break;
        case 38: 
          { return newSym(sym.PROGRAM);
          }
        case 77: break;
        case 39: 
          { return newSym(sym.PROCEDURE);
          }
        case 78: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
