// ExemploFor.java
public class ExemploFor {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "ANA", "MARCOS" };

        // Utilizando for
        /*
         * for (int x=0; x<alunos.length; x++) {
         * System.out.println("O aluno no indice x=" + x + " eh " + alunos[x]);
         * }
         */
        // Utilizando for each
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é : " + aluno);
        }

    }
}
