import java.util.ArrayList;

class Professor {
    String nome;

    public Professor(String nome) {
        this.nome = nome;
    }
}

class Escola {
    String nome;
    ArrayList<Professor> professores;

    public Escola(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void exibirProfessores() {
        System.out.println("Professores da escola " + nome + ":");
        for (Professor professor : professores) {
            System.out.println("- " + professor.nome);
        }
    }

    public static void main(String[] args) {
        Escola escola = new Escola("Escola A");
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Maria");

        escola.adicionarProfessor(professor1);
        escola.adicionarProfessor(professor2);
        escola.exibirProfessores();
    }
}

public class Main{
    public static void main(String[] args) {
        Escola escola = new Escola("Escola A");
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Maria");

        escola.adicionarProfessor(professor1);
        escola.adicionarProfessor(professor2);
        escola.exibirProfessores();
    }
}