import java.util.*;

public class prod {
    
    public static int product(int a1,int b2){
        int prod=a1*b2;
        return prod;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a1= sc.nextInt();
        int b2=sc.nextInt();
        System.out.println(product(a1, b2));
    }
}
