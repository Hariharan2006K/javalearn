public class elseif {
    public static void main(String args[]){
        int age=25;
        if(age<18){
            System.out.println("Not eligible to vote");
        }
        else if(age>=18 && age<60){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Senior citizen");
        }
    }
}
