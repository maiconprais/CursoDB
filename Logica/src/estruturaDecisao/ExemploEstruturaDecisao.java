package estruturaDecisao;

public class ExemploEstruturaDecisao {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 2;
        boolean resultado = numero1 >= numero2;
        if (resultado) {
            System.out.println("10 é maior ou igual a 10");
        } else if (numero1 == numero2) {
            System.out.println(numero1+ "É igual A" + numero2);;
        } else {
            System.out.println("Não deu");
        }
    }

}
