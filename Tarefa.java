public class Tarefa {
    private String descricao;
    private boolean concluida = false;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public  String toString() {
        return (concluida ? "[X] " : "[ ] ") + descricao;
    }

}
