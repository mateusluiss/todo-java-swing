package Simplificado;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<ArrayList<Object>> listaTarefasSemanais = new ArrayList<>();
    private ArrayList<ArrayList<Object>> listaTarefasDiarias = new ArrayList<>();
    private ArrayList<ArrayList<Object>> listaTarefasMensais = new ArrayList<>();
    private ArrayList<Object> listaTemp = new ArrayList<>();
    private ArrayList<String> diasSemana = new ArrayList<>();
    
    public void adicionarTarefaSemanal(String nome, String horario, int qtdDias) {
        if(qtdDias > 1){
            for(int i = 0; i<qtdDias; i++){
                System.out.print("Insira o dia "+i+": ");
                String diaS = scanner.next();
                diasSemana.add(diaS);
            }
            
            listaTemp.add(nome);
            listaTemp.add(horario);
            listaTemp.add(diasSemana);
            
            listaTarefasSemanais.add(listaTemp);
        }
        else{
            System.out.print("Insira o dia da semana: ");
            String dia = scanner.next();
            listaTemp.add(nome);
            listaTemp.add(horario);
            listaTemp.add(dia);
            
            listaTarefasSemanais.add(listaTemp);
            
        }
    }
    
    public void mostrarTarefasSemanais(){
        System.out.println(listaTarefasSemanais);
    }
    
    public void adicionarTarefaDiaria(String nome, String horario, String diaSemana){
        listaTemp.add(nome);
        listaTemp.add(horario);
        listaTemp.add(diaSemana);
        
        listaTarefasDiarias.add(listaTemp);
    }
    
    public void mostrarTarefasDiarias(){
        System.out.println(listaTarefasDiarias);
    }
    
    public void adicionarTarefaMensal(String nome, String horario, String diaMes){
        listaTemp.add(nome);
        listaTemp.add(horario);
        listaTemp.add(diaMes);
        
        listaTarefasMensais.add(listaTemp);
    }
    
    public void mostrarTarefasMensais(){
        System.out.println(listaTarefasMensais);
    }
    
    
    
}
