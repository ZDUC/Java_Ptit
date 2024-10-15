import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

import java.io.File;
import java.io.IOException;

public class b3th {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(new File("DANHSACH.in"));
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<String> l=new ArrayList<>();
        while(n-->0){
            String[] s=sc.nextLine().trim().toLowerCase().split("\\s+");
            String res =s[s.length-1];
            for(int i=0;i<s.length-1;i++){
                res+=s[i].charAt(0);
            }
            l.add(res);
            int c=Collections.frequency(l, res);
            System.out.println(res+(c==1?"":c)+"@ptit.edu.vn");
        }
        }
        catch(IOException e){
            System.out.println(e);
        }
        
        }
    }
