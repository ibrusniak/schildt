
public class StackWalkerDemo0 {
    
    public static void main(String[] args) {

        StackWalker stackWalker = StackWalker.getInstance();

        stackWalker.forEach(stackFrame ->
            System.out.printf("%s, %s, %s%n",stackFrame.getClassName(),
                stackFrame.getMethodName(),
                stackFrame.getLineNumber()));
    }
}

