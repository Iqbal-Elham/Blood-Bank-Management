package bloodbankk;

import java.util.Scanner;

/**
 * @author Iqbal Elham
 */
public class Doctor extends Admin
{

    Scanner sc = new Scanner(System.in);
    boolean bGroup;
    String[] listOfDoc = new String[5];

    public boolean checkDonor()
    {
        Nurse nus = new Nurse();
        System.out.println("*************************************************");
        System.out.println("Hi, hope you doing well!\nI am Doctor Hayat!");
        System.out.println("Answer these questions, Please!");
        System.out.println("\nIs your age above 18?");
        System.out.println("1. Yes\n2. No");
        int Ans = sc.nextInt();
        if (Ans == 1)
        {
            System.out.println("Is your weight above 45Kgs?");
            System.out.println("1. Yes\n2. No");
            Ans = sc.nextInt();
            bGroup = true;
            if (Ans == 1)
            {
                System.out.println("Do you have any severe disease?");
                System.out.println("1. Yes\n2. No");
                Ans = sc.nextInt();
                bGroup = true;
                if (Ans == 2)
                {
                    System.out.println("Do have allergy in any antibiotics?");
                    System.out.println("1. Yes\n2. No");
                    Ans = sc.nextInt();
                    bGroup = true;
                    if (Ans == 2)
                    {
                        System.out.println("You can donate blood , now proceed to Nurse\n");
                        bGroup = true;
                    } else if (Ans == 1)
                    {
                        System.out.println("You are not eligible to donate blood , Sorry.\n");
                        bGroup = false;
                    }
                } else if (Ans == 1)
                {
                    System.out.println("You are not eligible to donate blood , Sorry.\n");
                    bGroup = false;
                }
            } else if (Ans == 2)
            {
                System.out.println("You are not eligible to donate blood , Sorry.\n");
                bGroup = false;
            }
        } else if (Ans == 2)
        {
            System.out.println("You are not eligible to donate blood , Sorry.\n");
            bGroup = false;
        }
        return bGroup;
    }

    public void listOfDoctors()
    {

        listOfDoc[0] = "Dr.Ahmad Ahmadi (Ear and Throat Specialist)";
        listOfDoc[1] = "Dr.Hayatullah shaikhzada (Dermatology Specialist)";
        listOfDoc[2] = "Dr.Bilal ahmadzai (Internal  Specialist)";
        for (int i = 0; i < listOfDoc.length; i++)
        {
            System.out.println((i+1)+". "+listOfDoc[i]);
        }
    }

    public void addDoctor()
    {
        System.out.println("you can add only 2 more! ");
        System.out.println("how much doctors you want to add: ");      
        int num = in.nextInt();
        for (int j = 0; j < num; j++)
        {
            System.out.println("Enter his\\her name: ");
            String add = in.next();
            listOfDoc[j + 3] = add;

        }
        System.out.println("Added Successfully! ");
    }
}
