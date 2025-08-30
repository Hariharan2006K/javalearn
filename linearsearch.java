import java.util.*;

public class linearsearch {


    public static int ls(int marks[],int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int key= sc.nextInt();
        int marks[]={23,45,67,89,90};
        System.out.println(ls(marks,key));

}
}