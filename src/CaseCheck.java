import java.util.Scanner;
class CaseCheck {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    char ch= input.next().charAt(0);

    if(ch >='a' && ch <= 'z'){
        System.out.println("lowecase");}
    else {
            System.out.println("Uppercase");
        }

    }
    }
