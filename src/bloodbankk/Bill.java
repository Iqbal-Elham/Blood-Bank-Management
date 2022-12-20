
package bloodbankk;
import java.util.Scanner;
/**
 *
 * @author Iqbal Elham
 */
public class Bill 
{
    Scanner sc = new Scanner(System.in);
    int wantedbloodgroup;
    String retGroup;
    
    public  String DisplayBill()
    {
        System.out.println("\nThe blood group you want :\nChoose from: \n1.A+\t1000 Afg\n2.A-\t1000 Afg\n3.B+\t1000 Afg\n4.B-\t1000 Afg\n5.O+\t5000 Afg\n6.O-\t1000 Afg\n7.AB+\t1000 Afg\n8.AB-\t1000 Afg\n");
        wantedbloodgroup = sc.nextInt();
        System.out.println("=============================================");
        switch(wantedbloodgroup)
        {
            case 1:
            {
                System.out.println("    Blood Bank  ");
                System.out.println("Receipt Bill");
                System.out.println("Blood group you wanted : A+");
                System.out.println("Cost : Afg 1000/-\n");
                retGroup = "A+";
                break;
            }
                 case 2:
            {
                System.out.println("       Blood Bank     ");
                System.out.println("Receipt Bill");
                System.out.println("Blood group you wanted : A-");
                System.out.println("Cost : Afg 1000/-\n");
                retGroup = "A-";
                break;
            }
                 case 3:
            {
                System.out.println("       Blood Bank     ");
                System.out.println("Receipt Bill");
                System.out.println("Blood group you wanted : B+");
                System.out.println("Cost : Afg 1000/-\n");
                retGroup = "B+";
                break;
            }
                 case 4:
            {
                System.out.println("       Blood Bank     ");
                System.out.println("Receipt Bill");
                System.out.println("Blood group you wanted : B-");
                System.out.println("Cost : Afg 1000/-\n");
                retGroup = "B-";
                break;
            }
                 case 5:
            {
                System.out.println("       Blood Bank     ");
                System.out.println("Receipt Bill");
                System.out.println("Blood group you wanted : O+");
                System.out.println("Cost : Afg 5000/-\n");
                retGroup = "O+";
                break;
            }
                 case 6:
            {
                System.out.println("       Blood Bank     ");
                System.out.println("Receipt Bill");
                System.out.println("Blood group you wanted : O-");
                System.out.println("Cost : Afg 1000/-\n");
                retGroup = "O-";
                break;
            }
                 case 7:
            {
                System.out.println("       Blood Bank     ");
                System.out.println("Receipt Bill");
                System.out.println("Blood group you wanted : AB+");
                System.out.println("Cost : Afg 1000/-\n");
                retGroup = "AB+";
                break;
            }
                 case 8:
            {
                System.out.println("       Blood Bank     ");
                System.out.println("Receipt Bill");
                System.out.println("Blood group you wanted : AB-");
                System.out.println("Cost : Afg 1000/-\n");
                retGroup = "AB-";
                break;
            }
        }
       return retGroup;
        
    }
    public void donorBill()
    {   System.out.println("**********Costs***********");
        System.out.println("A+   150 Afg per (100cc)");
        System.out.println("A-   150 Afg per (100cc)");
        System.out.println("B+   150 Afg per (100cc)");
        System.out.println("B-   150 Afg per (100cc)");
        System.out.println("O+   600 Afg per (100cc)");
        System.out.println("O-   150 Afg per (100cc)");
        System.out.println("AB+   150 Afg per (100cc)");
        System.out.println("AB-   150 Afg per (100cc)");
    }
    
    
}
