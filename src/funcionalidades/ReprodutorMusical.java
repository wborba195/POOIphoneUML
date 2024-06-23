package src.funcionalidades;

public interface ReprodutorMusical{

    public default void tocar(){
        //NOSSO CÓDIGO AQUI
        System.out.println("Tocando Música");
      }
    public default void pausar(){
        //NOSSO CÓDIGO AQUI
        System.out.println("Música pausada");
      }
    public default void selecionarMusica(String musica){
        //NOSSO CÓDIGO AQUI
        System.out.println("Selecionando Música");
      }


}