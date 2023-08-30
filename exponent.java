import java.util.Scanner;

public class exponent{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int base, power;
        System.out.println("Which number will be exponentiaed: ");
        base=input.nextInt();
        System.out.println("What is the exponent of the number you entered: ");
        power=input.nextInt();

        int answer=1;
        for(int i=1; i<=power; i++){
            answer=answer*base;
        }
        System.out.println(answer);

    }
}