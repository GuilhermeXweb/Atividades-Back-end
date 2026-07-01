public class Aluno {

    private final String nome;
    private final int idade;
    private final String matricula;
    private final double nota1;
    private final double nota2;

    public Aluno(String nome, int idade, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getMatricula() {
        return matricula;
    }
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }
    public String getNome() {
        return nome;
    }

    public void exibirAluno() {
        System.out.println("\n=== Dados do Aluno ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
    }
}
