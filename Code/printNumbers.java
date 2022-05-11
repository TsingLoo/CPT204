public class printNumbers {
    public  int[] printNumbersMethod(int n)
    {
        int target = 1;
        while(n>0)
        {
            target = target * 10;
            n = n-1;
        }
        int[] result =  new int[target-1];
        for(int i=0; i<target-1;i++)
        {
            result[i] = i+1;
        }

        return result;
    }
}
