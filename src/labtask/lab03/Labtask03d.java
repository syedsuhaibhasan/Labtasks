package labtask.lab03;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
public class Labtask03d {
    int top;
    class stack{
    char arr[];
    int top;
    
    stack(int size){
    this.arr=new char[size];
    this.top=-1;
    }
    
    public void push(char data){
        if (top==arr.length) {
            System.out.println("STACK OVERFLOW");
        }else{
            arr[++top]=data; 
        }                   
    }
    
    public char pop(){
        if (top==-1) {
            System.out.println("STACK UNDERFLOW");
        }
          return  arr[top--];   
    
    }
    
    public void print(){
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]+"");
        }
        System.out.println("");
    }
    
    public boolean isEmpty(){
    return top==-1;    
    }}
    
    public boolean isBalanced(String str){
        stack obj = new stack(str.length());
        for (char x:str.toCharArray()) {
            if (x=='{'||x=='['||x=='(') {
                obj.push(x);
            }
            else if(x=='}'||x==']'||x==')'){
                if (obj.isEmpty()) {
                    return false;
                }
                char top = obj.pop();
                if ((x=='}' && top!='{')||
                     (x==')' && top!='(')||
                        (x==']' && top!='['))
                    {
                    return false;
                }
            }
        }
    return obj.isEmpty();
    }
    
    
    public static void main(String[] args) {
        Labtask03d obj = new Labtask03d();
        String str = "{(A+B})";
        System.out.println(obj.isBalanced(str));
       
    }
}