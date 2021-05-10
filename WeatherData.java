import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherData implements Subject{

  /*private CondicoesAtuaisDisplay condicoesAtuaisDisplay;
  private PrevisoesDisplay previsoesDisplay;
  private EstatisticaDisplay estatisticaDisplay;*/

  private List <Observer> observers = new ArrayList<>();

  private double temperatura;
  private double umidade;
  private double pressao;
  private Random gerador = new Random();

  public double getTemperatura(){
    return temperatura;
  }
  public double getUmidade(){
    return umidade;
  }
  public double getPressao(){
    return pressao;
  }
  public void alteracoesDetectadas (){
    notificarObservadores();
    /*condicoesAtuaisDisplay.atualizar(getTemperatura(), getUmidade(), getPressao());
    previsoesDisplay.atualizar(getTemperatura(), getUmidade(), getPressao());
    estatisticaDisplay.atualizar(getTemperatura(), getUmidade(),getPressao());*/
  }

  public void iniciar () {
    while (true){
      temperatura = gerador.nextDouble() * 15 + 20;
      umidade = gerador.nextDouble();
      pressao = 100 + gerador.nextDouble() * 600;
      alteracoesDetectadas();
      System.out.println("===============================");
      try{
        Thread.sleep(5000); 
      }
      catch (InterruptedException e){

      }
    }
  }
  @Override
  public void registrarObservador(Observer o) {
    this.observers.add(o);
    
  }
  @Override
  public void removerObservador(Observer o) {
    this.observers.remove(o);
    
  }
  @Override
  public void notificarObservadores() {
   for (Observer o : observers){
      o.update(getTemperatura(), getUmidade(), getPressao());
    }    
  }


}