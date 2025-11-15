
package labtask.lab01;
//Syed Muhammad Suhaib Hasan
//24F-CS-192
import java.util.Scanner;

public class Labtask01a {
    int[] arr;
    Labtask01a(int size){
    this.arr=new int[size];
    }
    public int binarySearch(int[] arr,int target){
    int start = 0;
    int end = arr.length-1;
    while(start<=end){
        int mid = start+(end-start)/2;
        if (target>arr[mid]) {
            start=mid+1;
        }
        else if (target<arr[mid]) {
            end=mid-1;
        }
        else
            return mid;
    }
    return -1;
    }
    
    public int linearSearch(int[] arr, int target){
    int foundAt=0;
        for (int i = 0; i < arr.length; i++) {
            if (target==arr[i]) {
                foundAt=i;
                break;
            }
            return foundAt+1;
        }
    return -1;
    }
    public static void main(String[] args) {
        Labtask01a obj = new Labtask01a(5);
        int[] arr = {-1,18,2,23,1};
        int target = 18;
        System.out.println("              LAB TASK QUESTION NO. 1 \n");
        System.out.println(" LINEAR SEARCH");
        int sol = obj.linearSearch(arr, target);
        System.out.println("Using linear search the element is at " + (sol) + " of the unsorted array.\n" );
        //i also created a sorting method so
        // even if user inputs unsorted array it doesnot make any difference
        obj.bubblesort(arr);
        System.out.println(" BINARY SEARCH");
        obj.displayArray(arr);
        int answer = obj.binarySearch(arr, target);
        System.out.println("Using binary search the element is at " + (answer) + " index of the sorted array.\n");
        
        int n=100000;
        int[] newarr = new int[n];
        for (int i = 0; i < n-1; i++) {
            newarr[i]=i;
        }
        int arrtarget = n-1;
        Long Lstart = System.nanoTime();
        obj.linearSearch(arr, target);
        Long Lend = System.nanoTime();
        
        Long Bstart = System.nanoTime();
        obj.binarySearch(arr, target);
        Long Bend = System.nanoTime();
        
        System.out.println(" TIME COMPLEXITIES");
        System.out.println("Time complexity of linear search: " +(Lend-Lstart)+"ns");
        System.out.println("Time complexity of Binary search: " + (Bend-Bstart) + "ns");
    }
    
    public int[] bubblesort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;               
                }
            }
    } 
        return arr;}
    public void displayArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }  
    }
}
