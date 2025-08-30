import java.util.*;

public class largest {

    public static int largst(int marks[],int max){
        for(int i=0;i<marks.length;i++){
            if(marks[i]>max){
                max=marks[i];
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int marks[]= new int[5];
        int max=marks[0];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println(largst(marks,max));

}
}