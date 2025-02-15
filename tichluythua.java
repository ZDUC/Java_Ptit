import java.util.Scanner;
public class tichluythua 
{
    
        static Long mod = 1000000007L;
    
        public static Long Pow(Long n, Long k) 
        {
            if (k == 0)
                return 1L;
            Long x = Pow(n, k / 2);
            x = (x * x) % mod;
            if (k % 2 == 0)
                return x;
            else
                return (x * n) % mod;
        }
    
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            while (true) 
            {
                Long n = sc.nextLong();
                Long k = sc.nextLong();
                if (n == 0 && k == 0)
                    return;
                System.out.println(Pow(n, k));
            }
        }
}
    
