package bloodbankk;
import java.util.Scanner;
import java.io.*;
/**
 * @author Iqbal Elham
 */
public class Bloodgrouplist
{
    public static int selectCriteria()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("*******************************************");
        System.out.println("1.Positive Blood Groups. \n2.Negative Blood Groups. \n");
        int chcr = sc.nextInt();
        return chcr;
    }
    public static void BloodList()
    {
        int cr = selectCriteria();
        if (cr == 1)
        {
            try
            {
                File bloodGroup = new File("C:\\Users\\iqbal\\Desktop\\blood bank proj\\PositiveBloodGroup.txt");
                Scanner in = new Scanner(bloodGroup);
                while (in.hasNextLine())
                {
                    String a = in.nextLine();
                    String b = in.nextLine();
                    String o = in.nextLine();
                    String ab = in.nextLine();
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(o);
                    System.out.println(ab);
                }
            } catch (FileNotFoundException e)
            {
                e.printStackTrace(System.out);
            }
        } 
        else
        {
            try
            {
                File bloodGroup = new File("C:\\Users\\iqbal\\Desktop\\blood bank proj\\negativeBloodGroup.txt");
                Scanner in = new Scanner(bloodGroup);
                while (in.hasNextLine())
                {
                    String a = in.nextLine();
                    String b = in.nextLine();
                    String o = in.nextLine();
                    String ab = in.nextLine();
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(o);
                    System.out.println(ab);
                }
            } catch (FileNotFoundException e)
            {
                e.printStackTrace(System.out);
            }
        }

    }

}
