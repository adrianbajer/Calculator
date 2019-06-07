
package calculator;

public enum OperationSymbols{
    ADD("+") {
        @Override
        public double performOperation(double firstUserNumber, double secondUserNumber) {
            return result = firstUserNumber+secondUserNumber;
        }
    },
    SUBTRACT("-") {
        @Override
        public double performOperation(double firstUserNumber, double secondUserNumber) {
            return result = firstUserNumber-secondUserNumber;
        }
    },
    MULTIPLY("*") {
        @Override
        public double performOperation(double firstUserNumber, double secondUserNumber) {
            return result = firstUserNumber*secondUserNumber;
        }
    },
    DIVIDE("/") {
        @Override
        public double performOperation(double firstUserNumber, double secondUserNumber) {
            return result = firstUserNumber/secondUserNumber;
        }
    },
    POWER("^") {
        @Override
        public double performOperation(double firstUserNumber, double secondUserNumber) {
            return result = Math.pow(firstUserNumber, secondUserNumber);
        }
    };
    
    double result;
    
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
    abstract public double performOperation(double firstUserNumber, double secondUserNumber);
}