package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno aluno : alunoSet) {
                if (aluno.getMatricula() == matricula) {
                    alunoParaRemover = aluno;
                    break;
                }
            }
        }
        alunoSet.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatoPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("caio", 65323L, 5.0 );
        gerenciadorAlunos.adicionarAluno("arthur", 75323L, 9.0 );
        gerenciadorAlunos.adicionarAluno("joao", 55323L, 8.0 );
        gerenciadorAlunos.adicionarAluno("jose", 85323L, 10.0 );
        gerenciadorAlunos.adicionarAluno("pedro", 65323L, 4.0 );

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        gerenciadorAlunos.removerAluno(85323L);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
