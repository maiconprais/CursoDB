package operadores;

public class Exemplo {
    
    public static void main(String[] args) {
        //Atribuição
        int numero1 = 2;
        System.out.println(numero1);
        
        int numero2 = 1;
        numero2 = numero1;
        System.out.println(numero2);
        
        numero1 = 0;
        System.out.println(numero1);
        System.out.println(numero2);
        
        //operadores aritméticos
        //soma
        int soma = 2 + 2;
        int soma2 = soma + 2;
        int soma3 = soma + soma2;
        System.out.println(soma3);
        
        //subtração
        int sub = 10 - 5;
        int sub2 = sub - 2;
        int sub3 = sub - sub2;
        System.out.println(sub3);
        
        //Multiplicação
        int mult = 3 * 3;
        int mult2 = mult * 3;
        int mult3 = mult * mult2;
        System.out.println(mult3);
        
        //Divisão
        double div = 10 / 4.0;
        System.out.println(div);
        
        //Contenação
        String primeiroNome = "Maicon";
        String sobrenome = "Prais";
        String nome = primeiroNome + " " + sobrenome;
        System.out.println(nome);
        
        //Inclemento/Decremento
        int contador = 1;
        contador++; //contador = contador + 1;
        //System.out.println(++contador);//3
        System.out.println(contador++);//2
        System.out.println(contador);
    
        //Atribuição & aritmética
        int numero3 = 1;
        numero3 += 5;
        System.out.println(numero3);
        
        int numero4 = 10;
        numero3 /= 5;
        System.out.println(numero4);
    
        // comparadores de igualdade/diferença
        int numeroComp1 = 1;
        int numeroComp2 = 2;
        boolean comparacao1 = numeroComp1 == numeroComp2;//True / False
        System.out.println(comparacao1);
        numeroComp2--;
        System.out.println(numeroComp1 == numeroComp2);
        
        String stringComp1 = "azul";
        String stringComp2 = "azul";
        System.out.println(stringComp1 != stringComp2);
           
        // Operadores relacionais
        int numeroComp3 = 2;
        int numeroComp4 = 7;
        boolean comparacao2 = numeroComp3 > numeroComp4;//True / False
        System.out.println(comparacao2);
        numeroComp3 += 5;
        System.out.println(numeroComp3 >= numeroComp4);
        
        //Operadores lógicos
        
        boolean expressao1 = true == false;
        boolean expressao2 = 10 >= 10;
        //System.out.println(expressao1);
        //System.out.println(expressao2);
        boolean expressaoCombinada = expressao1 && expressao2;
        System.out.println(expressaoCombinada);
        boolean expressao4 = !('A' == 'A');
        System.out.println(expressao4);
    }

}
