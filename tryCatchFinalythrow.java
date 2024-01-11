import java.util.*;

public class tryCatchFinalythrow {

    public static void verificarIdade(short idade) {
        if (idade >= 18) {
            System.out.println("Acesso garantido!");
        } else {
            throw new ArithmeticException("Idade nao permitida!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scSair = new Scanner(System.in);
        try {
            System.out.println("Digite sua Idade: ");
            short idadeDigitada = sc.nextShort();
            verificarIdade(idadeDigitada);
        } catch (ArithmeticException e) {
            //System.err.println("Erro ao processar a entrada" + e);
            System.err.println(e.getMessage() + "  Pressione enter para sair");
            String sair = scSair.nextLine();
            System.out.println(sair);
        } finally {
            System.out.println("Fim do Programa, Reinicie-o!");
        }
        sc.close();
        scSair.close();
    }
}