package triangleprintingjl;     //@author Justin Little
import java.util.Scanner;

public class TrianglePrintingJL {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count, star, space;
        
        System.out.println("A.");
        for(count = 0; count < 10; count++)
        {
            for(star = 0; star < count+1; star++)
                System.out.print("*");
                System.out.println();
        }
        System.out.println("B.");       
        for(count = 11; count >= 0; count--)
        {
            for(star = 0; star < count-1; star++)
                System.out.print("*");
                System.out.println();
        }
        System.out.println("C.");
        for(count = 0; count < 10; count++)
        {
            for(space = 1; space < count+1; space++)
                System.out.print(" ");
            for(star = 10; star > count; star--)
                System.out.print("*");
                System.out.println();
        }
        System.out.println("D.");
        for(count = 10; count > 0; count--)
        {
            for(space = 0; space < count-1; space++)
                System.out.print(" ");
            for(star = 10; star > count-1; star--)
                System.out.print("*");
                System.out.println();
    }
}
}