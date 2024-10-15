import java.util.*;

public class h161 
{
    public static void main(String[] args) {
       int x=4,y=3;
       int z=x-y;
       try{
            x=y/z;
            System.out.println("x= "+x);
       }
       catch(ArithmeticException e){
            System.out.println("co loi");
            System.out.println(e);
       }
       System.out.println("viec 1");
       System.out.println("viec 2");
       System.out.println("viec 3");

    }
}
