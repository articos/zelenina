package zelenina;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] zeleniny = { "zelí", "okurka", "rajče", "paprika", "ředkev", "mrkev", "brokolice" };
        String[] ovoce = { "jablko", "hruška", "pomeranč", "jahoda", "banán", "kiwi", "malina" };

        Scanner sc = new Scanner(System.in, "Windows-1250");
        String vstup = sc.nextLine();

        String pokracovani = "ano";

        while ( pokracovani == "ano") {
            System.out.println("zadej zeleninu");
            String zadanaZelenina = sc.nextLine();

            for (String z : zeleniny) {
                if (z.contains(zadanaZelenina)) {
                    System.out.println("Je to zelenina");
                }
            }
            for (String o : ovoce) {
                if (o.contains((zadanaZelenina))) {
                    System.out.println("tohle je ale ovoce");
                }
            }
            System.out.println("Chces pokracovat ?");
            pokracovani = sc.nextLine().trim();
        }
    }
}
