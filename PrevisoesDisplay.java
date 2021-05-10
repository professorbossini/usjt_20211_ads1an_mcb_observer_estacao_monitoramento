import java.util.Random;

public class PrevisoesDisplay implements Observer{
  public void update (double t, double u, double p){
    // t - 2 <= previsao <= t + 2
    Random gerador = new Random();
    double previsao = (t - 2) + gerador.nextDouble() * 4;
    System.out.printf ("Prev(t): %.2f\u00B0C\n", previsao);
  }
}
