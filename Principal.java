public class Principal {
  public static void main(String[] args) {
    WeatherData estacao = new WeatherData();
    estacao.registrarObservador(
      new CondicoesAtuaisDisplay()
    );

    estacao.registrarObservador(
      new PrevisoesDisplay()
    );

    estacao.registrarObservador(
      new EstatisticaDisplay()
    );

    estacao.iniciar();
  }
  
}
