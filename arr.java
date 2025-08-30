import java.util.*;

public class arr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age[]= new int[4];
        for(int i=0;i<age.length;i++){
            age[i]=sc.nextInt();
        }
        for(int i=0;i<age.length;i++){
            System.out.println(age[i]);
            System.out.println("\n");
        }
}
}