package labtask.lab03;
public class Labtask03f {
    int top;
    int size;
    char[] reversestack;
    Labtask03f(int size){
    this.reversestack=new char[size];
    this.top=-1;
    }
    
    public void push(char ch){
        if (top==reversestack.length-1) {
            System.out.println("Stack overflow");
        }else{
            reversestack[++top]=ch;
        }
    }
    
    public void reverseString(String str){
        for (char x: str.toCharArray()) {
            push(x);
        }
        
        for (int i = top; i >= 0; i--) {
            System.out.print(reversestack[i]);
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        String str = "Stack";
        Labtask03f obj = new Labtask03f(str.length());
        obj.reverseString(str);
    }
    
}
