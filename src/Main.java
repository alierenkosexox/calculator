import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        int n1,n2,select;           // describe data

        Scanner input = new Scanner(System.in);         //  create a scanner
        System.out.println("Enter the first number : ");        // ask first number
        n1 =input.nextInt();                                    // save firstnumber
        System.out.println("Enter the second number: ");        //ask second number
        n2 = input.nextInt();                                   //save second number

        System.out.println("Select transaction :");             //
        System.out.println("1-Sum\n2-Subtraction\n3-Divide\n4-Multiplication"); //ask which operation is required
        select = input.nextInt();                   // save the chosen operation

        switch (select){
            case 1:                 // describe case 1 Sum op.
                System.out.println("Result : " + (n1+n2));  // write result
                System.out.println("End of Calculator Program");
                break;              // if chosen is not case 1 ,break and look others
            case 2:
                System.out.println("Result : "+ (n1-n2));
                System.out.println("End of Calculator Program");
                break;
            case 3 :
                if (n2 !=0) {
                    System.out.println("Result : " + (n1 / n2));
                    System.out.println("End of Calculator Program");
                }
                else  {
                    System.out.println("Number cannot be divided by zero");
                }
                     {
                System.out.println("Operatipon rejected");
            }   break;

            case 4 :
                System.out.println("Result : "+ (n1*n2));
                System.out.println("End of Calculator Program");
                break;

        }
    }
}     // Ali Eren KÖSE 21/02/2024  17:54      Acımasızca geçip giden zamandan ,geriye kalan sadece yalnızlıklarımız.