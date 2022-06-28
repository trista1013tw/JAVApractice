public class big  {
    public static void main(String args[])
    {
        int[] arrayA = new int[]{10,20,30}; //new int[]可以不寫，但是有寫出來可以區分是否為新物件
        int[] arrayB = arrayA;

        arrayB[1] = 5;
        System.out.println(arrayA[0]);
    }
}
