import java.util.*;
public class funol {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println((add(a,b,c)));

    }   
    
    public static int add(int a1,int b1){
        return a1+b1;
    }

    public static int add(int a1,int b1,int c1){

        return a1+b1+c1;
    }
}
