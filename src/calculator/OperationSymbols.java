
package calculator;

public enum OperationSymbols{
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    POWER("^");

    String userSymbol;
    private OperationSymbols(String userSymbol) {
        this.userSymbol = userSymbol;
    }
    
    public static String getUserSymbol(OperationSymbols operation){
        return operation.userSymbol;
    }

    public static OperationSymbols getOperation (String symbol){
        for(OperationSymbols operations : OperationSymbols.values()){
            if (symbol.equals(operations.userSymbol))
                return operations;
        }
        return null;
    }
}