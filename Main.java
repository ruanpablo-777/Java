public class Main {

    public class Filme {
        private String nome;
        private int ano;

        public Filme(String nome, int ano) {
            this.nome = nome;
            this.ano = ano;

        }
    }

    public class Alunos {
        private String nome;
        private int idade;

        public Alunos(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

    }

    public  void apresentar() {
        Filme filme = new Filme("Batman" , 2008);
        Filme filme2 = new Filme("Homem de Ferro" , 2008);
        Alunos aluno = new Alunos("Ruan Pablo", 18);
        Alunos aluno2 = new Alunos("Bernado", 20);

        System.out.println("O nome do filme é: " + filme.nome + " e o ano de lançamento é: " + filme.ano);
        System.out.println("O nome do filme é: " + filme2.nome + " e o ano de lançamento é: " + filme2.ano);
        System.out.println("Olá, meu nome é " + aluno2.nome + " e tenho " + aluno2.idade + " anos");

    }
    

    public static void main(String[] args) {
        Main main = new Main();
        main.apresentar();
    }
}