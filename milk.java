public class milk 
{
    public static void main(String[] args)
    {
        String m1 = "A";
        String m2 = "B";
        String m3 = "C";

        String m = "C";
        int price = 25;

        if(m.equals("B") || m.equals("C")) //標號||為"或"(兩者其一為真為true)
        {
            if(price >= 10 && price <=20) //標號&&為"且"(兩者皆為真為true)
            {
                System.out.println("buy it!");
            }
            else
            {
                System.out.println("money question.");
            }
        }
        else
        {
            System.out.println("don't buy it.");
        }
    }    
}
