package src.funcionalidades;

public interface NavegadorInternet {
    public default void atualizarPagina(){
        //NOSSO CÓDIGO AQUI
        System.out.println("Atualizando Página");
      }
    public default void adicionarNovaAba(){
        //NOSSO CÓDIGO AQUI
        System.out.println("Adicionando nova aba");
      }
    public default void exibirPagina(String url){
        //NOSSO CÓDIGO AQUI
        System.out.println("Exibindo Página");
      }
}
