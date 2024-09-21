package br.com.juan;

public class Aluno {
    public static void main(String[] args) {

        aluno();
    }

    private static void aluno() {
        double nota1 = 10;
        double nota2 = 5.5;
        double nota3 = 7.6;
        double nota4 = 3.5;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media >= 6) {
            System.out.println("Media: " + media + " - Aluno aprovado");
        } else {
            System.out.println("Media: " + media + " - Aluno reprovado");
        }

    }
}
