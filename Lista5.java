package treino;

    //import java.util.ArrayList;
    //import java.util.Collections;
    import java.util.Scanner;
    //import java.util.List;

    public class Lista5 {

        public static void main(String[] args) {

            // 01 Escreva um programa que exiba os números de 1 a 100, indicando se cada um é par ou ímpar.
        /*for (int i = 1; i <= 100; i++){
            if (i %2 == 0) {
                System.out.println(i + " é par");
            } else if (i %2 == 1){
                System.out.println(i + " é ímpar");
            }
        }*/


            //02 Solicite 10 números inteiros ao usuário e diga quantos deles são maiores que 100.

        /*Scanner numeros = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("DIGITE UM NUMERO ("+ i + "):");
            int num = numeros.nextInt();
            if (num > 100) {
                cont++;
            }
        }
        System.out.println("tem " + cont + " numeros");*/


            // 03 Leia 5 números inteiros e exiba apenas os números negativos.
        /*Scanner numeros = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("DIGITE UM NUMERO (" + i + "):");
            int num = numeros.nextInt();
            if (num < 0) {
            cont++;}
        }

        System.out.println(" tem " + cont + " números negativos");*/


            // 04 Solicite ao usuário um número positivo n. Em seguida, leia nos números inteiros e conte quantos são múltiplos de 3.
        /*Scanner numeros = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("DIGITE UM NUMERO (" + i + "):");
            int num = numeros.nextInt();
            if (num %3 == 0) {
                cont++;  }
            }
        System.out.println("tem " + cont + " números múltiplos de 3");*/


            // 05 Peça ao usuário um número inteiro e exiba todos os divisores ímpares desse número.
        /* numeros = new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO: ");
        int num = numeros.nextInt();
        for (int i = 1; i <= num; i++) {
        if ((i %2 != 0) && (num % i == 0)) {
                System.out.println(i);
            }
        }*/


            // 06 Leia 10 números reais e conte quantos estão no intervalo [10, 20].
        /*Scanner numeros = new Scanner(System.in);
        int cont = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("DIGITE UM NUMERO (" + i + "):");
            int num = numeros.nextInt();
            if (num > 10 && num < 20) {
                cont++;}
        }
        System.out.println("tem " + cont + " números no intervalo [10, 20]");*/


            // 07 Solicite ao usuário números inteiros até que ele digite um número negativo. Ao final, exiba quantos números pares foram digitados.
            /*List<Integer> numpar = new ArrayList<>();
            Scanner numeros = new Scanner(System.in);
            int contpares = 0;
            int cont = 0;
            for (int i = 1; i >= 0; i++) {
                System.out.println("DIGITE UM NUMERO " + i + ":");
                int num = numeros.nextInt();
                if (num < 0) {
                    break;
                }
                numpar.add(i);
            }
                for (int nu : numpar) {
                    if (nu % 2 == 0) {
                        contpares++;
                        System.out.println("Números pares: " + nu);
                    }
                }*/

            // 08 Escreva um programa que peça a idade de 10 pessoas e conte quantas têm 18 anos ou mais.
            /*Scanner numeros = new Scanner(System.in);
            int cont = 0;
            for (int i = 1; i <= 10; i++) {
            System.out.println("DIGITE A IDADE " + i + ":");
            int num = numeros.nextInt();
            if (num >= 18){
                cont++;
            }
            }
            System.out.println("Têm " + cont + " pessoas com 18 anos ou mais ");*/


            // 09 Leia 10 números inteiros e diga qual foi o menor número par lido.
            /*Scanner numeros = new Scanner(System.in);
            int menor;
            int numpar;
            int cont = Integer.MAX_VALUE;
            for (int i = 1; i <= 10; i++) {
                System.out.println("DIGITE A IDADE " + i + ":");
                int num = numeros.nextInt();
                numpar = menor = num;
                if (num % 2 == 0) {
                    numpar = num;
                } if (num %2 == 0) {
                    if (numpar < cont) {
                        cont = numpar;
                    }
                }
            }
                System.out.println("menor número par: " + cont);*/


            // 10 Peça ao usuário um número inteiro positivo n e exiba os n primeiros números da sequência de Fibonacci.
            /*Scanner numero = new Scanner(System.in);
            System.out.println("DIGITE UM NÚMERO: ");
            int num = numero.nextInt();
            int primeiro = 0, segundo = 1;
            System.out.println("os primeiros " + num + " números da sequência são:");
            for (int i = 0; i < num; i++) {
                System.out.println(primeiro + "");
                int proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }*/


            // 11 Peça ao usuário para digitar 10 números e exiba apenas os que forem primos.
            /*Scanner numeros = new Scanner(System.in);
            List<Integer> numprimo = new ArrayList<>();
            int primo;
            for (int i = 1; i <= 10; i++) {
                System.out.println("DIGITE UM NÚMERO " + i + ":");
                int num = numeros.nextInt();
                boolean ehprimo = true;
                if (num <= 1) {
                    ehprimo = false;
                } else {
                    for (int j = 2; j <= Math.sqrt(num); j++) {
                        if (num % j == 0) {
                            ehprimo = false;
                            break;
                        }
                    }
                }
                if (ehprimo) {
                    primo = num;
                    numprimo.add(primo);
                }
            }
            System.out.println("ESTES SÃO TODOS OS NÚMERO PRIMOS DIGITADOS: " + numprimo);*/


            // 12 Solicite ao usuário um número inteiro n. Em seguida, peça n números e mostre qual foi o maior número par e o menor número ímpar digitados.
            /*Scanner numeros = new Scanner(System.in);
            System.out.println("DIGITE UM NÚMERO:");
            int n = numeros.nextInt();
            int cont1 = Integer.MIN_VALUE;
            int cont2 = Integer.MAX_VALUE;
            int numpar;
            int numimpar;
            for (int i = 1; i <= n; i++) {
                System.out.println("AGORA DIGITE " + i + " NÚMEROS:");
                int num = numeros.nextInt();
                numpar = num;
                numimpar = num;
                if (num % 2 == 0 || num % 2 == 1) {
                    numpar = num;
                    numimpar = num;
                }
                if (num % 2 == 0) {
                    if (numpar > cont1) {
                        cont1 = numpar;
                    }
                }
                if (num % 2 == 1) {
                    if (numimpar < cont2) {
                        cont2 = numimpar;
                    }
                }
            }
            System.out.println("O MAIOR NUMERO PAR FOI: " + cont1);
            System.out.println("O MENOR NUMERO IMPAR FOI: " + cont2);*/

            // 13 Solicite ao usuário a quantidade de alunos em uma sala. Para cada aluno, leia a nota (0 a 10). Informe quantos alunos estão aprovados (nota >= 7), em recuperação (nota >= 5 e < 7) e reprovados (nota < 5).
            Scanner alunos = new Scanner(System.in);
            int aprovados = 0;
            int recuperados = 0;
            int reprovados = 0;
            System.out.println("DIGITE A QUANTIDADE DE ALUNOS: ");
            int num = alunos.nextInt();
            int notas;
            for (int i = 1; i <= num; i++) {
                System.out.println("Coloque a nota do aluno " + i + ": ");
                notas = alunos.nextInt();

                if (notas >= 7) {
                    aprovados++;
                    System.out.println("tem " + aprovados + " alunos aprovados");
                }
                if (notas >= 5 && notas < 7) {
                    recuperados++;
                    System.out.println("tem " + recuperados + " alunos em recuperação");
                }
                if (notas < 5) {
                    reprovados++;
                    System.out.println("tem " + reprovados + " alunos reprovados");
                }
            }
            System.out.println("------------RESULTADOS DOS " + num + " ALUNOS------------");
            System.out.println( aprovados + " alunos aprovados ");
            System.out.println( recuperados + " alunos em recuperação");



        }
    }
