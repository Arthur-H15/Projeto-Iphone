package models;

import infra.RepositorioMusic;
import intefaces.ReprodutorMusical;

public class Iphone  implements ReprodutorMusical{
RepositorioMusic music;
int idmusic=-1;
public Iphone(){
   music= new RepositorioMusic();
   
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
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'avancarMusica'");
    }

    @Override
    public void voltarMusica() {
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'voltarMusica'");
       if(idmusic>1) {
        idmusic -= 1;
    
    }
            System.out.println("musica Anterior");


        this.reproduzirMusica();
    }
    
}
