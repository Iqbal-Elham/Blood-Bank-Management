package bloodbankk;

import java.util.Scanner;

/**
 * @author Iqbal Elham
 */
public class Reciever extends Customer
{
    Bill b1 = new Bill();
    Scanner sc = new Scanner(System.in);
    String[] nam = new String[100];
    long[] number = new long[100];
    String[] blood = new String[100];
    int count = 0;

    public void inputReciever()
    {
        System.out.println("====================================");
        System.out.println("Enter your information.");
        System.out.print("Your Name: \t");
        name = sc.next();
        System.out.print("your lastname: \t");
        Lname = sc.next();
        System.out.print("Your Contact Number: \t");
        contactno = sc.nextLong();
        System.out.println();
        String bloodGroup = b1.DisplayBill();
        nam[count] = name;
        number[count] = contactno;
        blood[count] = bloodGroup;
        count++;
    }

    public void display()
    {
        if (count != 0)
        {
            for (int i = 0; i < count; i++)
            {
                System.out.print("name: " + nam[i]);
                System.out.print("\tphone number: " + number[i]);
                System.out.println("\tRecieved blood type: " + blood[i]);
            }
        } else
        {
            System.out.println("There is no Recievers!! ");
        }
    }
}
