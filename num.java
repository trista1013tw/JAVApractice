public class num 
{
    public static void main(String[] args)
    {
        int number = 3;
        String answer;

        answer = number % 2 ==0 ? "even":"odd";
        //相較於：
        //if(number%2==0)
        // {
        //     answer = "even";
        // }
        // else{
        //     answer = "odd";
        // }
        System.out.println(answer);
    }
    
}
