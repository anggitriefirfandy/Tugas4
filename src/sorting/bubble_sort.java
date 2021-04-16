/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author anggit rief irfandy
 */
public class bubble_sort {

    /**
     * @param args the command line arguments
     */
    public static void bubbleSort(int[] A){
        int i=1, j, n = A.length;
        int temp;
        while (i<n){
            j = n-1;
            while(j>=i){
                if (A[j-1]>A[j]){
                temp = A[j];
                A[j] = A[j-1];
                A[j-1] = temp;
            }
                j = j - 1;
            }
            i = i + 1;
        }
    }
    public static void tampil(int data[]){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int A[] = {25, 7, 9, 13, 3};
        bubble_sort.tampil(A);
        bubble_sort.bubbleSort(A);
        bubble_sort.tampil(A);
        
        System.out.println("\n");
        System.out.println();
        System.out.println("Anggit Rief Irfandy");
    }
    
}
