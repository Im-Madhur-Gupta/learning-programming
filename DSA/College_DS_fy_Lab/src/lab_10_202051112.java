public class lab_10_202051112 {
    public static int calcPop(StackLL<Integer> tempStack){
        if(tempStack.isEmpty()){
            throw new IllegalArgumentException("Invalid Postfix Expression detected.");
        }
        return tempStack.pop();
    }
    public static int postfixEvaluate(String postfix){
        char currentChar;
        int operand,var1,var2;
        StackLL<Integer> tempStack = new StackLL<Integer>();

        for(int i=0;i<postfix.length();i++){
            currentChar = postfix.charAt(i);
            if(currentChar>='0' && currentChar<='9'){
                operand=0;
                while(postfix.charAt(i+1)==' '){
                    operand = (postfix.charAt(i)-'0') + operand*10;
                    i+=2;
                }
                operand = (postfix.charAt(i)-'0') + operand*10;
                tempStack.push(operand);
            }
            else if(currentChar=='%'||currentChar=='+'||currentChar=='-'||currentChar=='*'||currentChar=='/') {
                var2 = calcPop(tempStack);
                var1 = calcPop(tempStack);
                switch (currentChar){ // I will reuse var1 to store result of arithmetic operation on var1 and var2.
                    case '%' -> var1%=var2;
                    case '+' -> var1+=var2;
                    case '-' -> var1-=var2;
                    case '*' -> var1*=var2;
                    case '/' -> var1/=var2;
                }
                tempStack.push(var1);
            }
            else if(currentChar=='@'||currentChar=='?') {
                var1 = calcPop(tempStack);
                if(currentChar=='?'){
                    var1 *= -1;
                }
                tempStack.push(var1);
            }
            else {
                throw new IllegalArgumentException("Invalid Postfix Expression detected.");
            }
        }
        return tempStack.pop();
    }

    private static int Precedence(char operator){
        switch(operator){ // Here, we are only considering arithmetic operators so all other operaters have default precedence of -1.
            case '*', '/', '%' -> { return 2; }
            case '+', '-' -> { return 1; }
            default -> { return 0; }
        }
    }
    public static String InfixToPostfix(String infix){
        StackLL<Character> tempStack = new StackLL<Character>();
        String result = "";
        char currentChar;

        for(int i=0;i<infix.length();i++){
            currentChar=infix.charAt(i);
            if(Character.isLetterOrDigit(currentChar)||currentChar==' '){
                result += currentChar;
            }
            else if(currentChar=='('){
                tempStack.push(currentChar);
            }
            else if(currentChar==')'){
                while(!tempStack.isEmpty() && tempStack.peek()!='('){
                    result += tempStack.pop();
                }
                tempStack.pop(); // This will give an error if ')' are more than '('.
            }
            else{
                while(!tempStack.isEmpty() && Precedence(currentChar)<=Precedence(tempStack.peek())){
                    result += tempStack.pop();
                }
                tempStack.push(currentChar);
            }
        }
        while(!tempStack.isEmpty()){
            if(tempStack.peek()=='('){
                throw new IllegalArgumentException("Invalid Infix expression detected.");
            }
            result += tempStack.pop();
        }
        return result;
    }

    private static String strReverse(String str){
        String revstr = "";
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)=='('){
                revstr += ')';
            }
            else if(str.charAt(i)==')'){
                revstr += '(';
            }
            else{
                revstr += str.charAt(i);
            }
        }
        return revstr;
    }
    public static String InfixToPrefix(String infix){
        StackLL<Character> tempStack = new StackLL<Character>();
        String result = "";
        char currentChar;

        infix = strReverse(infix);
        for(int i=0;i<infix.length();i++){
            currentChar=infix.charAt(i);
            if(Character.isLetterOrDigit(currentChar)||currentChar==' '){
                result += currentChar;
            }
            else if(currentChar=='('){
                tempStack.push(currentChar);
            }
            else if(currentChar==')'){
                while(!tempStack.isEmpty() && tempStack.peek()!='('){
                    result += tempStack.pop();
                }
                tempStack.pop(); // This will give an error if ')' are more than '('.
            }
            else{
                while(!tempStack.isEmpty() && Precedence(currentChar)<Precedence(tempStack.peek())){
                    result += tempStack.pop();
                }
                tempStack.push(currentChar);
            }
        }
        while(!tempStack.isEmpty()){
            if(tempStack.peek()=='('){
                throw new IllegalArgumentException("Invalid Infix expression detected.");
            }
            result += tempStack.pop();
        }
        return strReverse(result);
    }

    public static void main(String[] args) {
        // Part a
        System.out.println("This implementation supports multidigit operands.\nunary - is '?', unary + is '@'.\n");
        System.out.println("Postfix expression : 1 61*62/+");
        System.out.println("Calculated value : "+postfixEvaluate("1 61*62/+"));
        System.out.println("\nPostfix expression : 61*62/+");
        System.out.println("Calculated value : "+postfixEvaluate("61%62/+"));
        System.out.println("\nPostfix expression : 6?1*62/+");
        System.out.println("Calculated value : "+postfixEvaluate("6?1*62/+"));

        // Part b
        System.out.println("\nThis implementation supports multidigit operands, but it doesnt support unary '+' or '-'.");
        System.out.println("\nInfix expression : a+b*c/d");
        System.out.println("Converted Postfix expression : "+InfixToPostfix("a+b*c/d"));
        System.out.println("\nInfix expression : 1 2-6*2");
        System.out.println("Converted Postfix expression : "+InfixToPostfix("1 2-6*2"));

        // Part c
        System.out.println("\nThis implementation supports multidigit operands, but it doesnt support unary '+' or '-'.");
        System.out.println("\nInfix expression : a+b*c/d");
        System.out.println("Converted Prefix expression : "+InfixToPrefix("a+b*c/d"));
        System.out.println("\nInfix expression : x+y*z/w+u");
        System.out.println("Converted Prefix expression : "+InfixToPrefix("x+y*z/w+u"));
        System.out.println("\nInfix expression : 1 2-6*2");
        System.out.println("Converted Prefix expression : "+InfixToPrefix("1 2-6*2"));
    }
}