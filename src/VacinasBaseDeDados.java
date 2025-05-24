import java.util.ArrayList;
import java.util.List;

public class VacinasBaseDeDados {
   private List<Vacina> vacinas = new ArrayList<>();

   public void adicionarVacinas(List<Vacina> novasVacinas){
       vacinas.addAll(novasVacinas);
   }

   public void listarVacinas(){
       for (Vacina vacina : vacinas) {
           System.out.println("Nome: " + vacina.getNome());
           System.out.println("Descrição: " + vacina.getDescricao());
           System.out.println("Idade Ideal: " + vacina.getIdadeIdeal() + " meses");
           System.out.println("-------------");
       }
   }
}
