import java.util.*;
public class lamlai {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ds="";
        int l=s.length();
        ds=ds+s.charAt(l-1);
        char c=s.charAt(l-1);
        for(int i=l-2;i>=0;i--){
            if(s.charAt(i)-c>=0){
                ds=s.charAt(i)+ds;
                c=s.charAt(i);
            }
        }
        System.out.println(ds);
    }
}