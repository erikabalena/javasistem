package sistemaescolarjava;

import java.util.ArrayList;
import java.util.List;

// Classe Pessoa
class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

// Classe Aluno herdando de Pessoa
class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}

// Classe Professor herdando de Pessoa
class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
}

// Classe Disciplina
class Disciplina {
    private String nome;
    private Professor professor;
    private List<Aluno> alunos;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void adicionarAluno(Aluno aluno) {
        if (alunos.size() < 5) {
            alunos.add(aluno);
        } else {
            System.out.println("Limite máximo de alunos atingido para esta disciplina.");
        }
    }

    public void listarAlunos() {
        System.out.println("Alunos da disciplina " + nome + ":");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
    }
}

// Exemplo de utilização do sistema
public class sistemaescolar {
    public static void main(String[] args) {
        // Criando os professores
        Professor professor1 = new Professor("Wagner", 35, "pw");
        Professor professor2 = new Professor("Edney", 40, "bd");
        Professor professor3 = new Professor("Rogerio", 30, "ptcc");

        // Criando as disciplinas com os respectivos professores
        Disciplina disciplina1 = new Disciplina("pw", professor1);
        Disciplina disciplina2 = new Disciplina("bd", professor2);
        Disciplina disciplina3 = new Disciplina("ptcc", professor3);

        
        Aluno aluno1 = new Aluno("Danilo", 16, "2021001");
        Aluno aluno2 = new Aluno("Erika", 17, "2021002");
        Aluno aluno3 = new Aluno("Ze da manga", 16, "2021003");
        Aluno aluno4 = new Aluno("huguinho", 15, "2021004");
        Aluno aluno5 = new Aluno("fiot", 16, "2021005");

        
        disciplina1.adicionarAluno(aluno1);
        disciplina1.adicionarAluno(aluno2);
        disciplina1.adicionarAluno(aluno3);
        disciplina1.adicionarAluno(aluno4);
        disciplina1.adicionarAluno(aluno5);

        disciplina2.adicionarAluno(aluno1);
        disciplina2.adicionarAluno(aluno2);
        disciplina2.adicionarAluno(aluno3);
        disciplina2.adicionarAluno(aluno4);
        disciplina2.adicionarAluno(aluno5);

        disciplina3.adicionarAluno(aluno1);
        disciplina3.adicionarAluno(aluno2);
        disciplina3.adicionarAluno(aluno3);
        disciplina3.adicionarAluno(aluno4);
        disciplina3.adicionarAluno(aluno5);

        
        System.out.println("Disciplina: " + disciplina1.getNome());
        System.out.println("Professor: " + disciplina1.getProfessor().getNome());
        disciplina1.listarAlunos();
        System.out.println();

        System.out.println("Disciplina: " + disciplina2.getNome());
        System.out.println("Professor: " + disciplina2.getProfessor().getNome());
        disciplina2.listarAlunos();
        System.out.println();

        System.out.println("Disciplina: " + disciplina3.getNome());
        System.out.println("Professor: " + disciplina3.getProfessor().getNome());
        disciplina3.listarAlunos();
    }
}
