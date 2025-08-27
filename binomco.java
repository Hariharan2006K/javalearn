import java.util.*;

public class binomco {
   
   public static int factorial(int n){
        int f=1;

        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static int binom(int n,int r){
        int fn=factorial(n);
        int fr=factorial(r);
        int fnr=factorial(n-r);
        int b=fn/(fr*fnr);
        return b;
    }
    public static void main(String[] args) {

        int a;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println(binom(a,b));
    }
}
