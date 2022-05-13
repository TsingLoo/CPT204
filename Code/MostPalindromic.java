import java.util.*;
public class MostPalindromic {
    public  static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while(sc.hasNext())
        {
            input = sc.nextLine();
        }

        int count = 0;
        for(int i=0; i<input.length();i++)
        {
            int left = i;
            int right = input.length()-1;

            while(left< right) {
                int tempLeft = left;
                int tempRight = right;
                while (tempLeft < tempRight) {
                    if (input.charAt(tempLeft) != input.charAt(tempRight)) break;
                    tempLeft++;
                    tempRight--;
                }

                if (tempLeft >= tempRight) {
                    count++;
                }
                right--;
            }
        }

        System.out.print(count);

    }
}
