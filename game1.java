import java.util.Scanner;
class game1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        String string = scanner.nextLine();
        if(string.equals("scissors"))
        {
            System.out.println("stone");
        }
        else
        {
            if(string.equals("paper"))
            {
                System.out.println("scissors");
            }
            else
            {
                System.out.println("papper");
            }
        }
    }
    
}
