public class prog2 {
    public static void main(String[] args) {

        float a= 1.27F;
        float b=3.881F;
        float c=9.6F;

        float sum = a + b + c;

        System.out.println("The sum with typecasting to int is:" + (int)sum);
        System.out.println("The sum with rounding the result:" + Math.round(sum));


    }

}
