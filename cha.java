import java.util.Scanner;

public class cha {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        int price = scanner.nextInt();
        if(price >20)
        {
            System.out.println("don't buy it!");
        }
        else
        {
            System.out.println("Just buy it!!");
        }
    }
    
}
