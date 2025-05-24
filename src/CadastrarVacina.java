import java.util.ArrayList;
import java.util.List;

public class CadastrarVacina {
    public List<Vacina> criarVacinasPadrao(){
        List<Vacina> vacinas = new ArrayList<>();

        vacinas.add(new Vacina("BCG", "Protege contra formas graves de tuberculose", 0));
        vacinas.add(new Vacina("Hepatite B", "Protege contra hepatite B", 0));
        vacinas.add(new Vacina("Tetravalente (DTP + Hib)", "Difteria, tétano, coqueluche, meningite", 2));
        vacinas.add(new Vacina("VOP", "Protege contra poliomielite", 2));

        return vacinas;
    }
}
