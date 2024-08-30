import static java.lang.System.in;

public class Find {
    public static void main(String[] args) {
        int count = 0;
        int number = 32323;
       while(number>0) {
           int rem = number % 10;
           if (rem == 3) {
               count++;
           }

            number = number/10;

           }






        System.out.println(count);
    }
}
