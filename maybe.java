import java.util.Scanner;

public class maybe 
{
    public static void main(String[] args)
    {Scanner scanner = new Scanner(System.in);
        scanner.close();
        int price = scanner.nextInt();
        if(price > 20)
        {
            System.out.println("Don't even think about that!!");
        }
        else
        {
            System.out.println("Just Buy It!!!");
        }

    }
}
//如果要用文字來作條件，不能使用 == ，取而代之要用string.equals("想要說的文字")