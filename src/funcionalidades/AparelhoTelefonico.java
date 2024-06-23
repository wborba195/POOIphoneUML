package src.funcionalidades;

public interface AparelhoTelefonico {
    
    public default void atender(){
        //NOSSO CÓDIGO AQUI
        System.out.println("Ligação Atendida");
      }
   
    public default void iniciarCorreioVoz(){
        //NOSSO CÓDIGO AQUI
        System.out.println("Tocando Correio de Voz");
      }
  
    public default void ligar(String numero){
        //NOSSO CÓDIGO AQUI
        System.out.println("Ligando");
      }
}
