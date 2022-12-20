package bloodbankk;

import java.util.Scanner;

/**
 *
 * @author Iqbal Elham
 */
public class Donor extends Customer
{

    Scanner sc = new Scanner(System.in);
    Bill b1 = new Bill();
    String[] names = new String[100];
    long[] numbers = new long[100];
    String[] bloodGroup = new String[100];
    int count;
    boolean checkedByDoc;
    String bG;
    int taking;

    public void inputDonor()
    {
        Doctor doc = new Doctor();
        Nurse nurs = new Nurse();
        System.out.print("\nEnter your information.\nYour Name: \t");
        name = sc.next();
        System.out.print("Your Lastname: \t");
        Lname = sc.next();
        System.out.print("Your Age: \t");
        age = sc.nextInt();
        System.out.print("Your Contact Number: \t");
        contactno = sc.nextLong();

        System.out.println("You want to Donate your blood for Free or Sell it:");
        System.out.println("1. Free\n2. Sell");
        byte donate = sc.nextByte();
        if (donate == 1)
        {
            checkedByDoc = doc.checkDonor();
            if (checkedByDoc)
            {
                taking = nurs.takingBlood();
                bG = nurs.checkingBloodGroup();
                System.out.println("your Blood group is: " + bG);
                names[count] = name;
                numbers[count] = contactno;
                bloodGroup[count] = bG;
                count++;
            }

        } else
        {
            checkedByDoc = doc.checkDonor();

            if (checkedByDoc)
            {
                taking = nurs.takingBlood();
                b1.donorBill();
                bG = nurs.checkingBloodGroup();
                System.out.println("your Blood group is: " + bG);
                names[count] = name;
                numbers[count] = contactno;
                bloodGroup[count] = bG;
                count++;

                switch (bG)
                {
                    case "A+":
                        System.out.println("This is your " + (taking * 150) + "Afg");
                        break;
                    case "A-":
                        System.out.println("This is your " + (taking * 150) + "Afg");
                        break;
                    case "B+":
                        System.out.println("This is your " + (taking * 150) + "Afg");
                        break;
                    case "B-":
                        System.out.println("This is your " + (taking * 150) + "Afg");
                        break;
                    case "O+":
                        System.out.println("This is your " + (taking * 300) + "Afg");
                        break;
                    case "O-":
                        System.out.println("This is your " + (taking * 150) + "Afg");
                        break;
                    case "AB+":
                        System.out.println("This is your " + (taking * 150) + "Afg");
                        break;
                    case "AB-":
                        System.out.println("This is your " + (taking * 150) + "Afg");
                        break;

                }

            }
        }

    }

    public void displayList()
    {
        if (count != 0)
        {
            for (int i = 0; i < count; i++)
            {
                System.out.print("name: " + names[i]);
                System.out.print("\tPhone Number: " + numbers[i]);
                System.out.println("\tBlood Group is: " + bloodGroup[i]);
            }
        } else
        {
            System.out.println("There is no donor!");
        }
    }

}
