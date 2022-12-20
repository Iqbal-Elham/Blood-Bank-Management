package bloodbankk;

import java.util.Scanner;

public class Admin
{

    Scanner in = new Scanner(System.in);
    Donor don = new Donor();

    Reciever rec = new Reciever();

    public void login()
    {
        String username = "";
        String pass = "";
        while (!username.equals("iqbal_elham"))
        {
            System.out.println("Enter the username: ");
            username = in.next();
            if (username.equals("iqbal_elham"))
            {

                while (!pass.equals("*****"))
                {
                    System.out.println("Enter the Password: ");
                    pass = in.next();
                    if (pass.equals("*****"))
                    {
                        System.out.println("     Welcome Iqbal Elham (๑‵●‿●‵๑)");

                    } else
                    {
                        System.out.println("password is wrong!");
                    }
                }
            } else
            {
                System.out.println("username is wrong!");
            }
        }
    }

    public void managerJob()
    {
        int op = 0;
        Nurse nu = new Nurse();
        Doctor doc = new Doctor();
        while (op < 5)
        {
            System.out.println("========================================");
            System.out.println("what you want to do: ");
            System.out.println("1. list of doctors\n2. list of nurses");
            System.out.println("3. Add doctors\n4. Add nurses");
            System.out.println("5. Logout");
            op = in.nextInt();
            switch (op)
            {  
                case 1:
                    doc.listOfDoctors();
                    System.out.println("Back to menu press 0:  ");
                    op = in.nextInt();
                    break;
                case 2:
                    nu.listOfNurse();
                    System.out.println("Back to menu press 0:  ");
                    op = in.nextInt();
                    break;
                case 3:
                    doc.addDoctor();
                    System.out.println("Back to menu press 0:  ");
                    op = in.nextInt();
                    break;
                case 4:
                    nu.addNurse();
                    System.out.println("Back to menu press 0:  ");
                    op = in.nextInt();
                    break;
            }
        }
    }
}
