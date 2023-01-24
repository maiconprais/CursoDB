package variaveis;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class Exemplo {

    public static void main(String[] args) {
        // inteiros
        short pequeno = 5;
        System.out.println(pequeno);
        int medio = 4000;
        System.out.println(medio);
        long grande = 10000000;
        System.out.println(grande);
        
        //reais
        float fpequeno = (float)5.5;
        System.out.println(fpequeno);
        
        double dmedio = 4000.50002;
        System.out.println(dmedio);
        
        BigDecimal dgrande = new BigDecimal("100000000.100000055555");
        System.out.println(dgrande);
        
        //logico
        boolean bool = true;
        bool = false;
        System.out.println(bool);
        
        //textos
        char letra = 'Y';
        System.out.println(letra);
        
        String frase ="Olá mundo";
        System.out.println(frase);
        
        //Data
        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);
    }

}
