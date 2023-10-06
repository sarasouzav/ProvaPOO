package questao2;

public class Main {
    public static void main(String[] args) {

    Professor professor = new Professor("Justin Bieber","justinbieber@newtonpaiva.br", "esqueciasenha", 1000, 30);

    Aluno aluno = new Aluno("Sara", "saradesouzav@hotmail.com", "esuqeciasenha", 3, 8);

    System.out.printf(professor.mostraProfessor());
    System.out.println(aluno.mostraAluno());
    }
}
