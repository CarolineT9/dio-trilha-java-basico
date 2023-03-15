import javax.lang.model.util.ElementScanner6;

public class TiposOperadores {
    /*
     * Operadores
     * == igual
     * != diferente
     * < menor
     * > maior
     * <= menor igual
     * >= maior igual
     * 
     * Operador de atribuição é representado pelo simbolo de =
       operador de atribuição é utilizado para definir o valor inicial ou
     * sobrescrever o valor de uma variável
      
     * Operadores aritméticos: perador aritmético é utilizado
       para realizar operações matemáticas entre valores numéricos, podendo se
     * tornar ou não uma expressão mais complexa.
     
     * Operadores Unários: realizam trabalhos como incrementar, decrementar,
       inverter valores numéricos e booleanos.
     * (+) Operador unário de valor positivo – números são positivos sem esse
       operador explicitamente;
     * (-) Operador unário de valor negativo – nega um número ou expressão
       aritmética;
     * (++) Operador unário de incremento de valor – incrementa o valor em 1
       unidade;
     * (--) Operador unário de decremento de valor – decrementa o valor em 1
       unidade;
     * (!) Operador unário lógico de negação – nega o valor de uma expressão
       booleana;
     
     * O Operador de Condição Ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores.
     * O operador ternário é representado pelos símbolos ?: utilizados na seguinte estrutura de sintaxe:
        
     <Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>
     
      
     * public static void main(String[] args) {
     * String nomeCompleto = "LINGUAGEM" + "JAVA";
     * System.out.println(nomeCompleto);
     * }
     */
    /**
     * @param args
     * 
     *             public static void main(String[] args) {
     *             String concatenacao ="?";
     * 
     *             concatenacao = 1+1+1+"1";
     *             System.out.println(concatenacao);
     * 
     *             concatenacao = 1+"1"+1+1;
     *             System.out.println(concatenacao);
     * 
     *             concatenacao = 1+"1"+1+"1";
     *             System.out.println(concatenacao);
     * 
     *             concatenacao = "1"+1+1+1;
     *             System.out.println(concatenacao);
     * 
     *             concatenacao = "1"+(1+1+1);
     *             System.out.println(concatenacao);
     *             }
     */
    /*
     * public static void main(String[] args) {
     * int numero = 5;
     * numero = - numero;
     * 
     * System.out.println(numero);
     * 
     * numero = numero * -1; /* nesse caso para tornar o número positivo é preciso
     * multiplicar por -1
     * 
     * System.out.println(numero);
     * }
     * 
     * 
     * public static void main(String[] args) {
     * //x repetição
     * int numero = 5;
     * // numero = numero + 1;
     * //numero ++;
     * System.out.println(numero ++);
     * System.out.println(numero);
     * //negação
     * boolean variavel = true;
     * 
     * System.out.println(!variavel);
     * System.out.println(variavel);
     * }
     * 
     */
    public static void main(String[] args) {
        // operador ternário

        int a, b;
        
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : " falso";
        
        System.out.println(resultado);

        //int resultado = a==b ? 1 : 0;

        // System.out.println(resultado);
    }
}
