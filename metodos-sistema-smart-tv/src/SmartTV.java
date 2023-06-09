import java.util.Scanner;

public class SmartTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    Scanner lerDados = new Scanner(System.in);

    public void ligar() {

        ligada = true;

    }

    public void desligar() {

        ligada = false;

    }

    public void aumentarVolume() {
        volume++;

    }

    public void diminuirVolume() {
        volume--;

    }

    public void aumentarCanal() {
        canal++;
        
    }

    public void diminuirCanal() {
        canal--;
        
    }

    public void escolherCanal() {
        System.out.println("Qual canal você deseja assistir?");
        canal = lerDados.nextInt();

        
    }

}
