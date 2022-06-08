import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("João", 15, 43));
        pessoas.add(new Pessoa("Maria", 13, 47));
        pessoas.add(new Pessoa("Pedro", 30, 78));
        pessoas.add(new Pessoa("Simone", 25, 65));
        pessoas.add(new Pessoa("Edson", 45, 120));
        pessoas.add(new Pessoa("Francieli", 50, 80));

        //foreach
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        //ordenar a lista
        Collections.sort(pessoas);

        System.out.println("\n----------ORDENAÇÃO----------\n");
        //foreach
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
