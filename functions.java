import java.util.*;

public class functions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(add(a,b));
        
    }
    public static void name(){
            System.out.println("hello");
        }
    public static int add (int a1,int b1){
        int sum=a1+b1;
        return sum;
    }
}
