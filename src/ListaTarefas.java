import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<Tarefa>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;

        for(Tarefa tarefa : tarefasSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover = tarefa;
            }
        }
        tarefasSet.remove(tarefaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefasSet);
    }

    public int contarTarefas(){
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa tarefa : tarefasSet){
            if(tarefa.getConcluida()){
                tarefasConcluidas.add(tarefa);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa tarefa : tarefasSet){
            if(!tarefa.getConcluida()){
                tarefasPendentes.add(tarefa);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa tarefa : tarefasSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.concluirTarefa();
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa tarefa : tarefasSet){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.abrirTarefa();
            }
        }
    }

    public void limparListaTarefas(){
        tarefasSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}
