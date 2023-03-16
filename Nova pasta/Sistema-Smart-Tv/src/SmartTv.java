/*Exercitando
Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
Ela tenha as características: ligada (boolean), canal (int) e volume (int)
Nossa TV poderá ligar e desligar e assim mudar o estado ligada
Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente
*/
public class SmartTv {

    boolean ligada = true;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;

    }
    public void diminuirCanal(){
        canal--;

    }
    
  
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
        
    }
    public void diminuirVolume (){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar (){
        ligada = true;
    }
    public void desligar (){
        ligada  = false;
    }
}