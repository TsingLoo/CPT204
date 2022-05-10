public class Power {

    public static  void main(String[] args)
    {
        //System.out.println(((1&1)==1));
    }


    public double PowerMethod(double base, int exponent) {

        if(exponent <0)
        {
            base = 1/base;
            exponent = -exponent;
        }

        return pow(base,exponent);
    }

    public double pow(double base, int exponent){
        if(exponent == 0)
        {
            return 1;
        }

        if(exponent == 1)
        {
            return base;
        }

        //n是一个奇数的话
        if((exponent&1) == 1)
        {
            return base * pow(base, exponent -1);
        }else
        {
            return pow(base*base, exponent/2);
        }
    }
}
