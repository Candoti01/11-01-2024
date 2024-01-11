import java.util.*;

public class DoWhile {
    public static void main(String[] args) {
        List<String> ussersLogged = new ArrayList<>();
        int usersLimit = 2;
        Scanner scnInput = new Scanner(System.in);
        String usuario;
        try {
            while (ussersLogged.size() < usersLimit) {
                System.out.println("Digite seu Usuario e/ou Tecle enter para gerar um nome de usuario aleatorio.");
                usuario = scnInput.nextLine();
                if (usuario != "") {
                    ussersLogged.add(usuario);
                } else {
                    ussersLogged.add("user" + Math.random());
                }
                Thread.sleep(1000);
            }
            System.out.println("Limite de usuarios atingido\nUsuarios registrados " + ussersLogged.size() + "\n1º Usuario [" + ussersLogged.get(0) + "]\n2º Usuario [" + ussersLogged.get(1) + "]");
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu um erro" + e.getMessage());
        }
        scnInput.close();
    }

}