package models;

import infra.RepositorioMusic;
import intefaces.AparelhoTelefonico;
import intefaces.NavegadorInternet;
import intefaces.ReprodutorMusical;

public class Iphone  implements ReprodutorMusical ,AparelhoTelefonico,NavegadorInternet {
RepositorioMusic music;
int idmusic=-1;
Navegador navegador;
boolean emLigacao = false;
public Iphone(){
   music= new RepositorioMusic();
   navegador = new Navegador();
   
}
    @Override
    public void reproduzirMusica() {
        if(music.size()==0) {System.out.println("Não Existe Musicas Para Reproduzir");};
        int idDefaulth = 1;
        boolean musicRunning=idmusic>0 ;
        int currentMusicId =  idmusic ;
        if(!musicRunning){
            idmusic = idDefaulth;
            currentMusicId = idDefaulth;
        }
        String currentMusic= music.getOneMusic(currentMusicId);
        System.out.println("Reposduzindo : " + currentMusic);
    }

    @Override
    public void pausarMusica() {
        boolean musicRunning=idmusic>0 ;
        if(!musicRunning)  System.out.println("Nao Pode Pausar Nenhuma Musica Sendo execultada No momento");
        
        System.out.println(" pausando : " + music.getOneMusic(idmusic));
    }

    @Override
    public void avancarMusica() {
        idmusic += 1;
        System.out.println("proxima musica");
        this.reproduzirMusica();
        
        // throw new UnsupportedOperationException("Unimplemented method 'avancarMusica'");
    }

    @Override
    public void voltarMusica() {
        // 
        // throw new UnsupportedOperationException("Unimplemented method 'voltarMusica'");
       if(idmusic>1) {
        idmusic -= 1;
    
    }
            System.out.println("musica Anterior");


        this.reproduzirMusica();
    }
    @Override
    public void navegarInternet(String url) {
        
        navegador.navegarInternet(url);
    }
    @Override
    public void abrirPaginaInicial() {
        
       navegador.abrirPaginaInicial();
    }
    @Override
    public void fecharNavegador() {
        
        navegador.fecharNavegador();
    }
    @Override
    public void fazerLigacao(String numero) {
        if(emLigacao) System.out.println("ja esta em ligacao");
        else{
            emLigacao=true;
            System.out.println("ligando para " + numero);

        
        }
        
    }
    @Override
    public void receberLigacao(String numero) {
        
                System.out.println("recebendo ligacão do  " + numero);

    }
    @Override
    public void encerrarLigacao() {
        emLigacao=false;
        System.out.println("encerrando ligacão");
        
    }
    
}
