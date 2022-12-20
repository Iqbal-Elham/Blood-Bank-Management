
package bloodbankk;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Iqbal Elham
 */
public class Nurse extends Admin{
    
    String name;
    private int Id;
    String [] listOfNu = new String [8];
    
    Scanner sc = new Scanner(System.in);
    
    public int takingBlood()
    {   System.out.println("************************************************");
        System.out.println("Hi, hope yor doing well!");
        System.out.println("I am Nurse Hadi!");
        System.out.println("How much blood you want to donate: ");
        System.out.println("1. 100cc\n2. 200cc\n3. 300cc\n4. 400cc\n5. 500cc");
        int taking=in.nextInt();
        System.out.println("Are you ready for taking blood!");
        System.out.println("1. Yes\n2. No");
        byte ans=sc.nextByte();
        while (ans != 1){
            System.out.println("Okey, I am waiting!");
            System.out.println("Any time you become ready tell me yes!");
            ans=sc.nextByte();   
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
         System.out.println("\nYour blood has been taken, Thank you for Donation!"); 
         return taking;
        }
    public String checkingBloodGroup()
    {
        String [] groups = {"A+","A-","B+","B-","O+","O-","AB+","AB-"}; 
        String rand = groups[new Random().nextInt(groups.length)];
        return rand;
    }
    public void listOfNurse()
    {
        listOfNu[0] = "1. Nurse Hadi Ahmadi";
        listOfNu[1] = "2. Nurse Hekmat Qadirzai";
        listOfNu[2] = "3. Nurse Zafar Mohamadi";
        listOfNu[3] = "4. Nurse Fatima Rahimi";
        listOfNu[4] = "5. Nurse Shakoko Parsoz";
        for (int i = 0; i < listOfNu.length; i++)
        {
            System.out.println((i+1)+". "+listOfNu[i]);
        }
    }
     public void addNurse()
    {   System.out.println("You can Add only 3 more! ");
        System.out.println("How much Nurses you want to add: ");
        int num = in.nextInt();
        for (int j = 0; j < num; j++)
        {
            System.out.println("Enter his\\her name: ");
            String add = in.next();
            listOfNu[j + 5] = add;
            
        }
        System.out.println("Added Successfully! ");
    }
}