import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        part1();
        part2();
        part3();
        part4();
        part5();
        part6();
        part7();
    }

    public static void part1() {
        byte a=1;
        short b=10;
        long c=1000L;
        float d=12.334f;
        double e=1234.245456;
        char f='$';
        boolean j=true;
        int h=100;
        String str="Hello World";
    }
    public static void part2() {
        float a=15f;
        float b=2f;
        float c=4f;
        float d=2f;

        float rez_part2=my_math(a,b,c,d);
        System.out.println("rez_part2= "+rez_part2);
    }
    public static void part3() {
        int a=15;
        int b=7;

        boolean rez_part3=from_10_to_20(a,b);
        System.out.printf("Сумма чисел %d и %d в диапазоне от 10-20? Результат="+rez_part3+"\n",a,b);
    }
    public static void part4() {
        int a=15;
        zero_plus(a);
    }
    public static void part5() {
        int a=-15;
        boolean rez5=zero_minus(a);
        System.out.println("Число "+a+" отрицательное? "+rez5);
    }
    public static void part6() {
        String name="Олег";
        print_hello_name(name);
    }

    public static void part7() {

        for (int year=0; year<2001; year++) {
            if (year(year)){
                System.out.println("Год "+year+" високосный");
            }
            else{
                System.out.println("Год "+year+" не високосный");
            }
        }
    }


    public static float my_math(float a, float b, float c, float d){
        if (d==0){
            return  0;
        }
        else {
            return a * (b + (c / d));
        }
    }

    public static  boolean from_10_to_20(int a, int b){
        if (a+b>=10 && a+b<=20){
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void zero_plus(int a){
        System.out.print("Число " + a);
        if (a>=0){
            System.out.println(" положительное");
        }
        else{
            System.out.println(" отрицательное");
        }
    }

    public static  boolean zero_minus(int a){
        if (a<=0){
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void print_hello_name(String name){
        System.out.println("Привет, "+name+"!");
    }

    public static boolean year(int year){
        int div4 = year % 4;
        int div100 = year % 100;
        int div400 = year % 400;

        if ((div4==0 && div100!=0) ||(div400==0)){
            return true;
        }
        else{
            return false;
        }
    }

}
