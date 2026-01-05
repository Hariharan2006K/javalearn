import java.util.*;

public class ooes {
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);
        int a;
        int ods=0;
        int es=0;
        a=sc.nextInt();
        for(int i=0;i<=a;i++){
            if(i%2==0){
                es=es+i;
            }
            else{
                ods=ods+i;
            }
        }
        System.out.println(ods);
        System.out.println(es);

    }
}
