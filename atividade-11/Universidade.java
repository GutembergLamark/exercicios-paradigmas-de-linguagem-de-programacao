class Universidade {
    String nome;

    public Universidade(String nome) {
        this.nome = nome;
    }

    class Departamento {
        String nomeDep;

        public Departamento(String nomeDep) {
            this.nomeDep = nomeDep;
        }

        public void exibirNome() {
            System.out.println("Departamento: " + nomeDep);
        }
    }
    
    public static void main(String[] args) {
        Universidade universidade = new Universidade("Universidade XYZ");
        Departamento departamento = universidade.new Departamento("Ciências da Computação");
        departamento.exibirNome(); 
    }

    
}

