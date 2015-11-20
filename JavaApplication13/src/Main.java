import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        System.out.println("Liczba");
        String x;
        Scanner odczyt = new Scanner(System.in);
        x = odczyt.nextLine();
        int a = Integer.parseInt(x);
        for(int i = 1; i<a; i++)
        {
            if(i%2 == 1)
            {
                System.out.println(i);
            }
        }
    }
}