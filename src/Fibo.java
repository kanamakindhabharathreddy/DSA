import java.util.Scanner;
class Fibo {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int c = 0;
     int b = 1;
     int count = 2 ;
     while(count <=n){
         int temp = b;
         b = b + c;
         c = temp;
         count++;
     }
        System.out.println(b);
    }

}
