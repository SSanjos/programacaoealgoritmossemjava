package arrays;
//Programa para receber as notas dos alunos de uma turma depois informar a média e situação.
import java.util.Scanner;

class ArrayMatrizV2 {


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos alunos tem na turma? ");
        int alunosTurma = teclado.nextInt();

        System.out.print("Quantas notas por aluno? ");
        int notasAlunos = teclado.nextInt();
        
        System.out.println();

        double[][] matriz = preencherMatriz(alunosTurma, notasAlunos);
        montarTabela(matriz, notasAlunos, alunosTurma);
        
        teclado.close();
    }

    private static String situacaoAluno(double media) {

        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        }
        return "Reprovado";
    }

    private static double[][] preencherMatriz(int alunosTurma, int notasAlunos) {

        Scanner teclado = new Scanner(System.in);
        double[][] matriz = new double[alunosTurma][notasAlunos];
        int aluno, nota = 0;
        for (aluno = 0; aluno < matriz.length; aluno++) {
            for (nota = 0; nota < matriz[aluno].length; nota++) {
                System.out.print("Informe a " + (nota + 1) + "ª nota do aluno " + (aluno + 1) + ": ");
                matriz[aluno][nota] = teclado.nextDouble();
            }
            System.out.println();
        }

        teclado.close();

        return matriz;
    }


    private static void montarTabela(double[][]matriz, int notasAlunos, int alunosTurma) {

        montarCabecalho(notasAlunos);

        int somarNotas = realizarSoma(matriz);

        double totalNotas = 0.0;
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%s%d%s", "Aluno ", (i + 1), ":");
            totalNotas = 0.0;
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("    %.2f        ", matriz[i][j]);
                totalNotas += matriz[i][j];
            }
            double media = totalNotas / notasAlunos;
            System.out.printf("%7.2f%15s", media, situacaoAluno(media));
            System.out.println();
        }

        double mediaTurma = somarNotas / (alunosTurma * notasAlunos);

        System.out.println();
        System.out.printf("%s%.2f", "A média da turma é ", mediaTurma);

    }

    private static int realizarSoma(double[][]matriz){

        int aluno, nota, somarNotas = 0;
        for (aluno = 0; aluno < matriz.length; aluno++) {
            for (nota = 0; nota < matriz[aluno].length; nota++) {
                somarNotas += matriz[aluno][nota];
            }
        }
        return somarNotas;
    }

    private static void montarCabecalho(int notasAlunos) {

        for (int i = 0; i < notasAlunos; i++) {
            System.out.printf("%15s%d", "Nota ", (i + 1));
        }
        System.out.printf("%15s%15s", "Média", "Situação");
        System.out.println();
    }


}

