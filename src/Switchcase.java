import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String phone = in.next();
        switch(phone){
            case "Apple" :
                System.out.println("brand Value");
                break;
            case "Samsung" :
                System.out.println("Lasts Longer");
                break;

            case "Vivo" :
                    System.out.println("Camers");
                    break;

            case "Oneplus" :
                        System.out.println("Overall Performance");
                        break;
            default :
                System.out.println("PLease enter valid phone");


            }



        }
    }

