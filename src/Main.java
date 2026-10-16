import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            System.out.print("Ingresa un número entero positivo (N): ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Por favor, ingresa un número entero positivo mayor que 0.");
            } else {
                System.out.println("--- Resultados para el número " + n + " ---");

                // A. Usando FOR
                int contFor = 0;
                System.out.print("Divisores con FOR: ");
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        System.out.print(i + " ");
                        contFor++;
                    }
                }
                System.out.println("(Total: " + contFor + ")");

                // B. Usando WHILE
                int contWhile = 0;
                int j = 1;
                System.out.print("Divisores con WHILE: ");
                while (j <= n) {
                    if (n % j == 0) {
                        System.out.print(j + " ");
                        contWhile++;
                    }
                    j++;
                }
                System.out.println("(Total: " + contWhile + ")");

                // C. Usando DO-WHILE
                int contDoWhile = 0;
                int k = 1;
                System.out.print("Divisores con DO-WHILE: ");
                do {
                    if (n % k == 0) {
                        System.out.print(k + " ");
                        contDoWhile++;
                    }
                    k++;
                } while (k <= n);
                System.out.println("(Total: " + contDoWhile + ")");
            }

            System.out.print("¿Deseas evaluar otro número? (si/no): ");
            opcion = scanner.next().toLowerCase().charAt(0);

        } while (opcion == 's');

        System.out.println("¡Programa finalizado!");
    }
}