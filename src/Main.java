import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Zadatak 1. Korištenjem petlje while -> Izračunaj zbroj znamenaka unesenog broja.
        // Npr 351 zbroj znamenaka je 9.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesi broj cije znamenke zelis zbrojiti: ");
        int uneseniBroj = scanner.nextInt();
        int suma = 0;
        while (uneseniBroj > 0) {
            suma += uneseniBroj % 10;
            uneseniBroj /= 10;
        }
        System.out.println("Zbroj svih znamenki unesenog broja je: " + suma+"\n\n");



        //Zadatak 2. Korištenjem petlje do while izračunaj zbroj brojeva od 1 do 1000 djeljivih sa 7
        int i = 1;
        int sum = 0;
        do {
            if (i % 7 == 0){
                sum+=i;
            }
            i++;
        } while (i<=1000);
        System.out.println("Zbroj brojeva od 1 do 1000 djeljivih sa 7 je: " + sum);
    }
}