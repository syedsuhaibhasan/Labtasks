package labtask.lab01;
//SYED MUHAMMAD SUHAIB HASAN
//24F-CS-192
public class Labtask01b {
    public static void main(String[] args) {
        System.out.println("            LAB TASK QUESTION NO. 2\n");
    double[] A = {25,14,12,74,58,74,98,84,15,24};
    double[] B = {87,11,10,81,67,94,74,82,15,24};
    double[] C = new double[10];
        for (int i = 0; i < C.length; i++) {
                if (B[i]>A[i]) {
                    C[i]=B[i]+(A[i]/100);
                }
                else 
                    C[i]=A[i]+(B[i]/100);
        }
        for (double x:C) {
            System.out.println(x);
        }
    }
}
