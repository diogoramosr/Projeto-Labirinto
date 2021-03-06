import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TesteMain {
    public static void main(String[] args) {
        try {
            System.out.println("Qual o nome do Arquivo?");
            String arquivo = Teclado.getUmString();

            Labirinto lab = new Labirinto(arquivo);
            System.out.println(lab);

            lab.testLab();
            System.out.println("LabirintoResolvido: \n" + lab);
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
