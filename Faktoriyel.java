package Basic;
import java.util.Scanner;
public class Faktoriyel {
    public static void main(String[] args) {
        int number,total=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Faktöriyel Sayısı: ");
        number = input.nextInt();

        for(int i = 1 ; i <= number ; i++){
            total = total * i;
        }
        System.out.println(number + " faktöriyel: " + total);
    }
}
