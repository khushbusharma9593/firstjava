public class calculator
{
    static int a = 30;
    static int b = 20;

    public static void main(String[] args)
    {
        add();
        subtract();
        multi();
        div();
    }

    public static void add()
    {
        int answer = a + b;
        System.out.println("addition of "+a+" & "+b+" = "+answer);
    }

    public static void subtract()
    {
        int answer = a - b;
        System.out.println("substraction of "+a+" & "+b+" = "+answer);
    }
    public static void multi()
    {
        int answer = a * b;
        System.out.println("multiplication of "+a+" & "+b+" = "+answer);
    }
    public static void div()
    {
        double answer =(double) a / b;
        System.out.println("division of "+a+" & "+b+" =" +answer);
    }

}
