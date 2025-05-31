package treino;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Lista4 {
    public static void main(String[] args) {

        // 01 Crie uma tupla com 5 nomes de frutas e exiba todos os elementos.
        /*String[] frutas = {"maça","uva","banana","pêra","kiwi"};
        System.out.println(frutas[0]);
        System.out.println(frutas[1]);
        System.out.println(frutas[2]);
        System.out.println(frutas[3]);
        System.out.println(frutas[4]);*/

        // 02 Peça ao usuário 3 números e armazene-os em uma tupla. Depois, mostre a tupla.
        /*Scanner numeros = new Scanner(System.in);
        System.out.println("digite numero 1");
        int nu1 = numeros.nextInt();
        System.out.println("digite numero 2");
        int nu2 = numeros.nextInt();
        System.out.println("digite numero 3");
        int nu3 = numeros.nextInt();
        int[] mynum = {nu1,nu2,nu3};
        System.out.println(mynum[0]);
        System.out.println(mynum[1]);
        System.out.println(mynum[2]);*/

        // 03 Crie uma lista com 4 nomes de alunos e exiba o segundo e o último nome da lista.
        /*List <String> nomes = new ArrayList <> ();
        nomes.add("sammuel");
        nomes.add("pedro");
        nomes.add("maria");
        nomes.add("paula");
        System.out.println("segundo aluno: " + nomes.get(1));
        System.out.println("útilmo aluno: " + nomes.get(3));*/

        // 04 Peça 5 números ao usuário e armazene-os em uma lista. Em seguida, exiba a soma desses números.
        /*Scanner soma = new Scanner(System.in);
        System.out.println("DIGITE O NUMERO");
        int num1 = soma.nextInt();
        System.out.println("DIGITE O NUMERO");
        int num2 = soma.nextInt();
        System.out.println("DIGITE O NUMERO");
        int num3 = soma.nextInt();
        System.out.println("DIGITE O NUMERO");
        int num4 = soma.nextInt();
        System.out.println("DIGITE O NUMERO");
        int num5 = soma.nextInt();
        List <Integer> numeros = new ArrayList <> ();
        numeros.add(num1);
        numeros.add(num2);
        numeros.add(num3);
        numeros.add(num4);
        numeros.add(num5);
        int resul = (numeros.get(0) + numeros.get(1) + numeros.get(2) + numeros.get(3) + numeros.get(4));
        System.out.println("a soma da lista é: " + resul);*/


        // 05 Crie um dicionário com 3 pares de chave e valor representando nome e idade de pessoas. Mostre todas as idades.
        /*HashMap<String, Integer> pessoas = new HashMap<String, Integer>();
        pessoas.put("pedro", 20);
        pessoas.put("maria", 18);
        pessoas.put("roberto", 43);
        for (String chave : pessoas.keySet()) {
            System.out.println("idade das pessoas: " + pessoas.get(chave));*/


        // 06 Peça 4 notas ao usuário e armazene em uma lista. Depois, calcule a média e exiba.
        /*Scanner media = new Scanner(System.in);
        System.out.println("DIGITE O NUMERO");
        int num1 = media.nextInt();
        System.out.println("DIGITE O NUMERO");
        int num2 = media.nextInt();
        System.out.println("DIGITE O NUMERO");
        int num3 = media.nextInt();
        System.out.println("DIGITE O NUMERO");
        int num4 = media.nextInt();
        List <Integer> numeros = new ArrayList<>();
        numeros.add(num1);
        numeros.add(num2);
        numeros.add(num3);
        numeros.add(num4);
        double resul = (num1 + num2 + num3 + num4)/4;
        System.out.println("a media da lista de notas é: " + resul);*/

        // 07 Peça o nome de 3 produtos e seus respectivos preços e armazene em um dicionário. Mostre os produtos mais caros.
        /*Scanner valor = new Scanner(System.in);
        Map<String, Double> produtos = new HashMap<>();

        for (int i = 1; i <= 3; i++) {
         System.out.println("DIGITE O NOME DO PRODUTO" + i + ": ");
         String nome = valor.nextLine();

         System.out.println("DIGITE O PREÇO DO PRODUTO" + i + "R$ ");
         double preco = valor.nextDouble();
         valor.nextLine();

         produtos.put(nome, preco);
        }

        double maiorpreco = Collections.max(produtos.values());

        System.out.println("\nProduto(s) mais caro(s):");
        for (Map.Entry<String, Double> entry : produtos.entrySet()) {
            if (entry.getValue() == maiorpreco) {
                System.out.printf("%s - R$ %.2f\n", entry.getKey(), entry.getValue());
            }
        }*/


        // 08 Peça uma lista de 5 números e diga qual é o maior, o menor e a soma total.
         /*Scanner scan = new Scanner(System.in);
        System.out.println("DIGITE O NUMERO");
        int num1 = scan.nextInt();
        System.out.println("DIGITE O NUMERO");
        int num2 = scan.nextInt();
        System.out.println("DIGITE O NUMERO");
        int num3 = scan.nextInt();
        System.out.println("DIGITE O NUMERO");
        int num4 = scan.nextInt();
        System.out.println("DIGITE O NUMERO");
        int num5 = scan.nextInt();
         List<Integer> numeros = Arrays.asList(num1, num2, num3, num4, num5);
        int maior = Collections.max(numeros);
        int menor = Collections.min(numeros);
        int resul = (numeros.get(0) + numeros.get(1) + numeros.get(2) + numeros.get(3) + numeros.get(4));
        System.out.println("o maior valor foi: " + maior);
        System.out.println("o menor valor foi: " + menor);
        System.out.println("a soma da lista é: " + resul);*/

        // 09 Crie uma tupla com 5 números e verifique se um número digitado pelo usuário está na tupla.
        /*Scanner scan = new Scanner(System.in);
        Integer[] numeros = {1, 2, 3, 4, 4, 5};
        System.out.println("digite um numero: ");
        int numero = scan.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]) {
                System.out.println("seu numero está na lista! " + numeros[i]);
            }
        }*/

        // 10 Crie um dicionário com 4 nomes e notas de alunos. Calcule e mostre a média geral da turma.

        /*Map<String, Double> alunos = new HashMap<>();
        alunos.put("pedro", 4.0);
        alunos.put("maria", 10.0);
        alunos.put("roberto", 8.0);
        alunos.put("marta", 6.0);
        double soma = 0;
        for (double nota : alunos.values()) {
            soma += nota;
        }
        double media = soma / alunos.size();
        System.out.printf("A média geral da turma é: %.2f\n", media);*/


        // 11 Crie uma lista de 10 números inteiros e remova todos os pares.
        /*List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
        numeros.add(i);}
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            int numero = iterator.next();
            if (numero % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("a lista sem números pares: " + numeros);*/


        // 12 Solicite ao usuário 3 pares de chave e valor e crie um dicionário a partir dessas entradas.
        /*Scanner pares = new Scanner(System.in);
        Map<String, Integer> dici = new HashMap<>();
        System.out.println("digite a chave1");
        String chave1 = pares.nextLine();
        System.out.println("digite a chave2");
        String chave2 = pares.nextLine();
        System.out.println("digite a chave3");
        String chave3 = pares.nextLine();
        System.out.println("digite o valor1");
        int valor1 = pares.nextInt();
        System.out.println("digite o valor2");
        int valor2 = pares.nextInt();
        System.out.println("digite o valor3");
        int valor3 = pares.nextInt();
        dici.put(chave1, valor1);
        dici.put(chave2, valor2);
        dici.put(chave3, valor3);

        for (Map.Entry<String, Integer> entrada : dici.entrySet()) {
            System.out.println(entrada.getKey() + " => " + entrada.getValue());
        }*/


        // 13 Crie uma tupla com os dias da semana e mostre apenas os dias úteis.
        /*ArrayList<String> tupla = new ArrayList<>();
        tupla.add("domingo");
        tupla.add("segunda");
        tupla.add("terça");
        tupla.add("quarta");
        tupla.add("quinta");
        tupla.add("sexta");
        tupla.add("sábado");

        tupla.remove("domingo");
        tupla.remove("sábado");

        System.out.println("DIAS ÚTEIS: " + tupla);*/

        // 14 Dada uma lista com 5 nomes, peça ao usuário um nome e verifique se está presente na lista.
        /*Scanner lista = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        nomes.add("pedro");
        nomes.add("paulo");
        nomes.add("maria");
        nomes.add("carla");
        nomes.add("lucas");
        System.out.println("digite um nome:");
        String nome = lista.nextLine();
        if (nomes.contains(nome)) {
            System.out.println("o nome está na lista!");
        } else {
            System.out.println("o nome não está na lista!");
        }*/


        // 15 Dado um dicionário com nomes e idades, exiba todos os nomes de pessoas com mais de 18 anos.
        /*Map<String, Integer> dici = new HashMap<>();
        dici.put("pedro", 20);
        dici.put("paula", 26);
        dici.put("lucas", 14);
        dici.put("maria", 50);
        System.out.println("pessoas com mais de 18 anos: ");
        for (Map.Entry<String, Integer> entrada : dici.entrySet()) {
            if (entrada.getValue() > 18) {
                System.out.println(entrada.getKey());
            }
        }*/


        // 16 Crie duas listas: uma com nomes e outra com idades. Junte essas listas em um dicionário.
        List<String> nomes = new ArrayList<>();
        nomes.add("pedro");
        nomes.add("vitor");
        nomes.add("maria");
        List<Integer> idades = new ArrayList<>();
        idades.add(20);
        idades.add(25);
        idades.add(30);
        Map<String, Integer> dici = new HashMap<>();
        for (int i = 0; i < nomes.size(); i++) {
        dici.put(nomes.get(i), idades.get(i));
        }
        System.out.println("Dicionário de nomes e idades:");
        for (Map.Entry<String, Integer> entrada : dici.entrySet()) {
            System.out.println(entrada.getKey() + " => " + entrada.getValue());
        }
    }
}