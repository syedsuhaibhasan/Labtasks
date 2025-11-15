package labtask.lab03;
public class InfixToPostfix {
    private char[] infix;
    private char[] postfix;
    private char[] stack;
    private int top;
    InfixToPostfix(int size){
    infix=new char[size];
    postfix= new char[size];
    stack= new char[size];
    this.top=-1;
    }
 
    private  void push(char ch){
        if (top==stack.length-1) {
            System.out.println("STACK OVERFLOW");
        }else{
            stack[++top]=ch;
        }
    }
    
    private char pop(){
        if (top==-1) {
            System.out.println("STACK UNDERFLOW");
            return '\0';
        }
        return stack[top--];
    }
    
    private char peek(){
        if (top==-1) {
            System.out.println("STACK IS EMPTY");
        }
        return stack[top];
        
    }
    
    private int precedence(char chr){
        switch(chr){
            case '^':return 3; 
            case '/':
            case '*':
                return 2;
            case '+':
            case '-':
                return 1;
            default: return 0;
        }
    }
    
    public void infixToPostfix(String str){
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            char input = str.charAt(i);
            switch(input){
            case'(': push(input); break;
            case')':while(top!=-1 && peek()!='('){
                postfix[count++]=pop();
            }
            pop(); break;
            case '+':
            case '-':
            case '/':
            case '*':
            case '^':
                while(top!=-1 && precedence(peek())>=precedence(input)){
                postfix[count++]=pop();
                }
                push(input);
                break;
                
            default:
                postfix[count++]=input;
            }
        }
     while(top!=-1){
     postfix[count++]=pop();
     }
        System.out.println("");
        for (int i = 0; i < postfix.length; i++) {
            System.out.print(postfix[i]+" ");
        }
    }
}
