import java.util.*;
public class Array {
    public static void main(String[] args) {
        System.out.print("enter the rows of array: ");
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        System.out.print("Enter the columns of array: ");
        int c= sc.nextInt();
        int [][]arr1= new int[r][c];
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        //first print the arr1
        System.out.println("printing the array");
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        //lets transpose guys
        //lets print the transpose
        int [][]arr2= new int[r][c];
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr2[i][j]=arr1[j][i];
            }
        }
        System.out.println("transpose of the array");
        for(int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();


    }
}
