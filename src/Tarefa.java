import java.util.Objects;

public class Tarefa {
    private String descricao;
    private Boolean concluida;

    public Tarefa(String descricao, Boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getConcluida() {
        return concluida;
    }

    private void setConcluida(Boolean concluida) {
        this.concluida = concluida;
    }

    public void concluirTarefa(){
        setConcluida(true);
    }

    public void abrirTarefa(){
        setConcluida(false);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
