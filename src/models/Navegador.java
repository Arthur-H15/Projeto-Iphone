package models;

public class Navegador {

    private String Site;
    private boolean aberto=false;

    public Navegador() {
        abrirPaginaInicial();
        aberto=true;
        
    }

    public void navegarInternet(String url) {
        
        Site=url;
        System.out.println("abrindo pagina: " + url);
    }

    public void abrirPaginaInicial() {
        Site="";
        System.out.println("iniciando pagina Home   "  +Site);
        
        throw new UnsupportedOperationException("Unimplemented method 'abrirPaginaInicial'");
    }

    public void fecharNavegador() {
        aberto=false;
        System.out.println("fechando navegador");
        
        throw new UnsupportedOperationException("Unimplemented method 'fecharNavegador'");
    }

    @Override
    public String toString() {
        return "site: " + Site;
    }

}
