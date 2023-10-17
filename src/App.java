import models.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
      Iphone iphone=  new Iphone();
      iphone.reproduzirMusica();
      iphone.avancarMusica();
      iphone.pausarMusica();
      iphone.voltarMusica();
    }
}
