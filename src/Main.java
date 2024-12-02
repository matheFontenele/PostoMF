import com.postofm.models.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bomba bomba1 = new Bomba();
        bomba1.setID(1);
        bomba1.setTipo(Tipo.GASOLINA);
        bomba1.setMetragemInical(80000L);
        bomba1.setMetragemFinal(90000L);

        Bomba bomba2 = new Bomba();
        bomba2.setID(2);
        bomba2.setTipo(Tipo.ETANOL);
        bomba2.setMetragemInical(50000L);
        bomba2.setMetragemFinal(55000L);

        Funcionario funcionario1 = new Funcionario("Carlos", Turno.MANHA);
        Funcionario funcionario2 = new Funcionario("Pedro", Turno.MANHA);

        Relatorio relatorio1 = new Relatorio();
        relatorio1.adicionarBomba(bomba1);
        relatorio1.adicionarBomba(bomba2);

        relatorio1.setData(LocalDate.now());
        relatorio1.adicionarFuncioanrio(funcionario1);
        relatorio1.adicionarFuncioanrio(funcionario2);

        relatorio1.gerarRelatorio();

        RelatorioTXT.gerarRelatorioTXT(relatorio1);
    }
}