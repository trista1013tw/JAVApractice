public class simple 
{
   public static void main(String args[])
   {
       int LIMI = 1000;
       for(int i = 2; i< LIMI ; i++)
       {
            if(isPrime(i))
            {
                System.out.print(i+",");
            }
       }
   } 
   public static boolean isPrime(int number)
   {
       for(int l=2; l < number; l++)
       {
           if(number % l == 0)
           {
               return false;
           }
       }
       return true;
   }
}
