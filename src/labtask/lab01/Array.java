package labtask.lab01;
public class Array {
    int[] ar;
    int count=0;
    public Array(int size){
    this.ar=new int[size];
    }
    
    public void insert(int item){
    ar[count++]=item;
    }
    
    public void removeAt(int index){
        if (index<0||index>ar.length) {
            System.out.println("Index out of bound.");
            return;
        }
        for (int i = index; i < count-1; i++) {
            ar[i]=ar[i+1];
        }
        count--;
    }
    
    public int indexOf(int target){
        int foundAt=0;
        for (int i = 0; i < ar.length; i++) {
            if (target==ar[i]) {
                foundAt=i;
                break;
            }
            return foundAt+1;
        }
    return -1;
    }
    
    public void updateAt(int index,int item){
    try{
    ar[index]=item;
    }catch(Exception e){
        System.out.println("\nError Message!");
         System.out.println(e.getMessage());
        }
    }
    
    public void displayarray(){
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
    
}
