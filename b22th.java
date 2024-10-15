import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class b22th {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(new File("MATRIX.in"));
            int t=sc.nextInt();
            while(t-->0){
                Matrix mx=new Matrix();
                mx.nhap(sc);
                mx.in();
            }

        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
class Matrix {
    int a[][];
    int n,m;
    public Matrix(){

    }
    public void nhap(Scanner sc){
        n=sc.nextInt();
        m=sc.nextInt();
        int c=sc.nextInt()-1;
        a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n-1;i++){
            for( int j=i+1;j<n;j++){
                if(a[i][c]>a[j][c]){
                    int tmp=a[i][c];
                    a[i][c]=a[j][c];
                    a[j][c]=tmp;
                }
            }
        }

    }
    public void in(){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
