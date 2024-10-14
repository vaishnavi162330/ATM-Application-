import java.util.Scanner;
    
public class ATM {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int Balance= 1000;
        while (true){
            System.out.println("Wecome to the ATM");
            System.out.println("1. Check Balance.");
            System.err.println("2. Withdraw Money.");
            System.err.println("3. Credit Money.");
            System.out.println("4. Exit."); 
            int b=s.nextInt();
            if(b==1){
                System.out.println("Balance is "+ Balance);
            }
            if(b==2){
                System.out.println("Enter the amount you want to withdraw");
                int w=s.nextInt();
            Balance=Balance-w;
            System.out.println("Your current balance is: " + Balance);
            }
            if(b==3){
                System.out.println("Enter the amount you want to credit.");
                int c=s.nextInt();
                Balance=Balance+c;
                System.err.println("Your current balance is: "+ Balance);
            }
            if(b==4){
                break;
            }        
        }
        
    }
}

