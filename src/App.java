import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Reverso do número");
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInforme um número inteiro: ");
        int n = sc.nextInt();
        reverte(n);
    }

    public static void reverte(int n1){
        int n2 = 0;

		while (n1 > 0) {
		n2 *= 10;
		n2 += (n1 % 10);
		n1 /= 10;

		} 

        System.out.println("O numero invertido é: "+n2);
        
    }

}
