public class choice 
{
    public static void main(String[] args)
    {
        boolean bool;

        int price = 70;
        bool = price == 50;
        if (price <= 50)
        {
            System.out.println("buy!");
        }
        else
        {
            System.out.println("don't buy!");
        }
        System.out.println(bool);
    }
    
}
