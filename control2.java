public class control2 
{
    public static void main(String[] args)
    {
        int[] diceCounter = new int[6];
        
        int NUM_ROLLS = 10000000;
        float average = (float)NUM_ROLLS/6.0f;

        for(int i = 0; i< NUM_ROLLS; i++)
        {
            int number = (int)(Math.random()*5.99999999999); //random可以隨機產生0~1間的小數
            diceCounter[number]++;
        }
        System.out.println("one:"+ diceCounter[0] + " " + (diceCounter[0]-average)/average*100.0f +"%");
        System.out.println("two:"+ diceCounter[1] + " " + (diceCounter[1]-average)/average*100.0f +"%");
        System.out.println("three:"+ diceCounter[2] + " " + (diceCounter[2]-average)/average*100.0f +"%");
        System.out.println("four:"+ diceCounter[3] + " " + (diceCounter[3]-average)/average*100.0f +"%");
        System.out.println("five:"+ diceCounter[4] + " " + (diceCounter[4]-average)/average*100.0f +"%");
        System.out.println("six:"+ diceCounter[5] + " " + (diceCounter[5]-average)/average*100.0f +"%");
        
    }    
}
