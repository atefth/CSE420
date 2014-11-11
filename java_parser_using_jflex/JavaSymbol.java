
public class JavaSymbol extends java_cup.runtime.Symbol implements sym {
  private int line;
  private int column;

  public JavaSymbol(int type, int line, int column) {
    this(type, line, column, -1, -1, null);
  }

  public JavaSymbol(int type, int line, int column, Object value) {
    this(type, line, column, -1, -1, value);
  }

  public JavaSymbol(int type, int line, int column, int left, int right, Object value) {
    super(type, left, right, value);
    this.line = line;
    this.column = column;
  }

  public int getLine() {
    return line;
  }

  public int getColumn() {
    return column;
  }

  public String isIdentifier(){
    if (sym == IDENTIFIER) {
      return "'"+value+"'";
    }else{
      return "";
    }
  }

  public String isInteger(){
    if (sym == INTEGER_LITERAL) {
      return "'"+value+"'";
    }else{
      return "";
    }
  }

  public String isString(){
    if (sym == STRING_LITERAL) {
      return "'"+value+"'";
    }else{
      return "";
    }
  }


  public String isFunction(){
    if (sym == IDENTIFIER) {
      return "'"+value+"'";
    }else{
      return "";
    }
  }  

  public String toString() {   
    // return "line "+line+", column "+column+"sym: "+sym+(value == null ? "" : (", value: '"+value+"'"));
    // return (value == null ? "" : ("'"+sym+"'"));
    switch (sym) {
      case IDENTIFIER:
        return "Identifier : " + "'" +value+"'";
      case INTEGER_LITERAL:
        return "var int : " + "'" +value+"'";
      case STRING_LITERAL:
        return "var string : " + "'" +value+"'";
      default:
        return "";
    }
  }
}
