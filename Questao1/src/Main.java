import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Aluno aln = new Aluno();

        System.out.println("Qual seu nome? ");
        aln.setNome(sc.nextLine());

        System.out.println("Digite sua primeira nota: ");
        aln.setNota1(sc.nextDouble());

        System.out.println("Digite sua segunda nota: ");
        aln.setNota2(sc.nextDouble());

        aln.calcularMedia();

        aln.situacao();

        sc.close();
    }
}