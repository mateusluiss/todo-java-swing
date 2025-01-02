package Simplificado;


public class Main {
    public static void main(String[] args) {
       Agenda agenda = new Agenda();
       
       agenda.adicionarTarefaSemanal("Reunião", "15:00", 2);
       agenda.mostrarTarefasSemanais();
    }
}
