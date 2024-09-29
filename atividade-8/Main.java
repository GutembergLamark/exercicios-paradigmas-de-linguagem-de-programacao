import java.util.ArrayList;

class Empregado {
    String nome;
    String cargo;
    double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
}

class Empresa {
    String nome;
    ArrayList<Empregado> empregados;

    public Empresa(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void exibirEmpregados() {
        System.out.println("Empregados da empresa " + nome + ":");
        for (Empregado empregado : empregados) {
            System.out.println("- " + empregado.nome + ", " + empregado.cargo + ", Salário: " + empregado.salario);
        }
    }

    
}

public class Main{
    public static void main(String[] args) {
        Empresa empresa = new Empresa("TechCorp");
        Empregado empregado1 = new Empregado("Ana", "Desenvolvedora", 5000);
        Empregado empregado2 = new Empregado("Carlos", "Designer", 4000);

        empresa.adicionarEmpregado(empregado1);
        empresa.adicionarEmpregado(empregado2);
        empresa.exibirEmpregados();
    }
}