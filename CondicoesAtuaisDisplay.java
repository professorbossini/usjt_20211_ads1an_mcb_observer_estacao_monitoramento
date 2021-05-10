public class CondicoesAtuaisDisplay implements Observer{
  
  public void update (double t, double u, double p){
    System.out.println ("Condições Atuais:");
    System.out.printf ("t:%.2f\u00B0C u:%d%% p: %.2f\n", t, (int)(u * 100), p);
  }
}
