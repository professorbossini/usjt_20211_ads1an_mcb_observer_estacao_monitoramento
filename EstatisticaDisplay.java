import java.util.ArrayList;
import java.util.List;

public class EstatisticaDisplay implements Observer{
  private List <Double> temperaturas = new ArrayList <>();
  public void update (double t, double u, double p){
    temperaturas.add(t);
    double media = 0;
    for (Double d : temperaturas){
      media += d;
    }
    media /= temperaturas.size();
    System.out.printf("Média(t): %.2f\u00B0C\n", media);
  }  
}
