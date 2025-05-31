package treino;


import java.util.Scanner;



public class Lista3 {
    public static void main(String[] args) {

        /*Scanner nume = new Scanner(System.in);
        System.out.println("diga o numero:");
        int num = nume.nextInt();
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("o numero é múltiplo de 2 e 3");
        } else if (num % 3 == 0) {
            System.out.println("o numero é múltiplo de 3");
        } else if (num % 2 == 0) {
            System.out.println("o numero é múltiplo de 2");
        }*/


        /*String usucorreto = "sammuel";
        String sencorreto = "samuca";
        Scanner usu = new Scanner(System.in);
        System.out.println("diga o usuário:");
        String usuario = usu.nextLine();
        System.out.println("diga a senha:");
        String senha = usu.nextLine();
        if (usuario.equals(usucorreto) && senha.equals(sencorreto)){
            System.out.println("usuário e senha corretos");
        }else{
            System.out.println("usuário ou senha estão incorretos");
        }*/



        /*Scanner nume = new Scanner(System.in);
        System.out.println("diga o numero:");
        int num = nume.nextInt();
        if (num%2 == 0 && num % 5 == 0) {
            System.out.println("o numero é divisível por 2 e 5 ao mesmo tempo");
        }else{
            System.out.println("o numero não é divisivel por 2 e 5 ao mesmo tempo");
        }*/



        /*Scanner id = new Scanner(System.in);
        System.out.println("diga a idade:");
        int idade = id.nextInt();
        if (idade > 18) {
            System.out.println("maior de idade");
        }else{
            System.out.println("menor de idade");
        }*/


        /*Scanner nume = new Scanner(System.in);
        System.out.println("diga o numero:");
        int num = nume.nextInt();
        if (num % 10 == 0) {
            System.out.println("o numero termina em 0");
        }else{
            System.out.println("o numero n termina em 0");
        }*/



        /*Scanner nume = new Scanner(System.in);
        System.out.println("diga o numero:");
        int num1 = nume.nextInt();
        System.out.println("diga o numero:");
        int num2 = nume.nextInt();
        if (num1 > num2) {
            System.out.println("o primeiro numero é maior");
        }else if (num2 > num1) {
            System.out.println("o segundo numero é maior");
        }else{
            System.out.println("ambos os numero tem o mesmo valor");
        }*/


        /*Scanner nume = new Scanner(System.in);
        System.out.println("diga o numero:");
        int num = nume.nextInt();
        if (num % 1 == 0 && num % num == 0 && num % 2 == 1) {
            System.out.println("o numero é primo");
        }else{
            System.out.println("o numero não é primo");
        }*/


        /*Scanner nume = new Scanner(System.in);
        System.out.println("diga o tamanho do lado 1:");
        int num1 = nume.nextInt();
        System.out.println("diga o tamanho do lado 2:");
        int num2 = nume.nextInt();
        System.out.println("diga o tamanho da base:");
        int num3 = nume.nextInt();
        if (num1 == num2 && num3 == num1) {
            System.out.println("é um triangulo equilátero");
        }else if (num1 == num2 && num2 != num3) {
            System.out.println("é um triangulo isósceles");
        }else{
            System.out.println("é um triangulo escaleno");
        }*/



        /*Scanner nume = new Scanner(System.in);
        System.out.println("diga o numero:");
        int num = nume.nextInt();
        if (num > 0 && num < 25) {
            System.out.println("0 a 25");
        }else if (num > 25 && num < 50){
            System.out.println("25 a 50");
        }else if (num > 50 && num < 75){
            System.out.println("50 a 75");
        }else if (num > 75 && num < 100){
            System.out.println("75 a 100");
        }*/


        /*Scanner nume = new Scanner(System.in);
        System.out.println("diga a letra");
        String letra = nume.nextLine();
        if ((letra.equals("a")) || (letra.equals("e")) || (letra.equals("i")) || (letra.equals("o")) || (letra.equals("u"))) {
            System.out.println("a letra é uma vogal");
        }else{
            System.out.println("a letra é uma consoante");
        }*/



        /*Scanner nume = new Scanner(System.in);
        System.out.println("diga um mês de 1 a 12:");
        int num = nume.nextInt();
        if (num >= 1 && num <= 12 && num != 2) {
            System.out.println("o mês tem 30 dias");
        }else if (num == 2){
            System.out.println("o mês tem 28 dias");
        }*/

        /*Scanner nume = new Scanner(System.in);
        System.out.println("diga um numero:");
        int num = nume.nextInt();
        if (num > 1 && num < 99){
            int dezena = num / 10;
            int unidade = num % 10;
        if (dezena == unidade) {
            System.out.println("esse é um numero palíndromo");
        }else{
            System.out.println("esse numero não palíndromo");
        }
        }*/


        Scanner nume = new Scanner(System.in);

        System.out.println("diga um numero:");
        double valor1 = nume.nextDouble();

        System.out.println("diga um numero:");
        double valor2 = nume.nextDouble();
        System.out.println("digite um operador (+,*,-,/)");
        char operador = nume.next().charAt(0);
        double resultado;
        switch (operador) {
            case '+':
                resultado = valor1 + valor2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = valor1 - valor2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = valor1 * valor2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            default:
                System.out.println("Operador inválido.");
        }
    }
}
