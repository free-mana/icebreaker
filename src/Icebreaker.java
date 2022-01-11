import java.util.Scanner;
/*
 * Alan Freeman
 * Christian Saputro
 * Bobby Palko
 * Christine Cho
 * Skyler Shaw
 */
public class Icebreaker{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int days;
        int i = 7;
        double rate = 1.2;
        int totalStudents = 39740;
        System.out.print("Please enter the number of days to simulate: ");
        days = in.nextInt();
        do{
            if(days < 0){
                System.out.println("Please enter a nonnegative number.");
            }else{
                int arr[] = new int[days + 1];
                arr[0] = i;
                int sum = i;
                int withdrawnStudents = sum;
                for(int j = 1; j < arr.length; j++){
                    arr[j] = (int)Math.floor(rate * arr[j - 1]);
                    sum += arr[j];
                    if(j <= 14){
                        withdrawnStudents = sum;
                    }
                }
                System.out.println("The total number of infected students is " + sum);
                System.out.println("Temple lost $" + (withdrawnStudents * 9972) + " from students withdrawing");
            }
            System.out.print("Please enter the number of days to simulate: ");
            days = in.nextInt();
        }while(days != 0);
    }
}
