package project;

import java.util.Scanner;
public class MainClass {

    public static void main(String[] args)
    {
        AtmOperationImpl op=new AtmOperationImpl();
        int atm_number=776077336;
        int atmpin=1999;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to demo oops ATM Machine");
        System.out.print("Enter Atm Number : ");
        int atmNumber=in.nextInt();
        System.out.print("Enter Pin: ");
        int pin=in.nextInt();
        if((atm_number==atmNumber)&&(atmpin==pin)){
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Exit");
                System.out.println("Enter Choice : ");
                int ch=in.nextInt();
                if(ch==1)
                {
                    op.viewBalance();
                }
                else if(ch==2)
                {
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount=in.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if(ch==3)
                {
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount=in.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if(ch==4)
                {
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm Number or pin");
            System.exit(0);
        }


    }
}
