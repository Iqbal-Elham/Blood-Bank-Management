package bloodbankk;

import java.util.Scanner;

/*
 * @author Iqbal Elham
 */
public class Bloodbankk
{

    public static void main(String[] args)
    {
        Admin ad = new Admin();
        Donor Don = new Donor();
        Reciever Pur = new Reciever();
        Scanner sc = new Scanner(System.in);
        int BB;
        System.out.println("  ヽ(•‿•)ノ         Welcome To The Happy Blood Bank   ヽ(•‿•)ノ");
        do
        {
            System.out.println("\nCan you tell us what you want, Please!");
            System.out.println("1. Admin Login");
            System.out.println("2. Donate Blood \n3. Recieve Blood: ");
            System.out.println("4. Cost of Bloods\n5. List of Donors");
            System.out.println("6. List of Recievers\n7. Exit");
            BB = sc.nextInt();
            switch (BB)
            {
                case 1:
                {
                    ad.login();
                    ad.managerJob();
                    break;
                }
                case 2:
                {
                    Don.inputDonor();
                    System.out.println("\n\nPress 0 to get back to reception.\n");
                    sc.nextInt();
                    break;
                }
                case 3:
                {
                    Pur.inputReciever();
                    System.out.println("\nPress 0 to get back to reception.\n");
                    sc.nextInt();
                    break;
                }
                case 4:
                    Bloodgrouplist.BloodList();
                    System.out.println("\nPress 0 to get back to reception.\n");
                    sc.nextInt();
                    break;
                case 5:
                    Don.displayList();
                    System.out.println("\nPress 0 to get back to reception.\n");
                    sc.nextInt();
                    break;
                case 6:
                    Pur.display();
                    System.out.println("\nPress 0 to get back to reception.\n");
                    sc.nextInt();
                    break;
                case 7:
                    System.out.println("Good Bye\nHave a nice Day!   ◉‿◉  ");

            }
        } while (BB != 7);
    }
}
