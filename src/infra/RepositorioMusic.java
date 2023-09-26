package infra;
import java.util.HashMap;
import java.util.Map;
import models.Music;

public class RepositorioMusic {
    Map<Integer ,Music> MusicList = new HashMap<>();
        public RepositorioMusic(){
        MusicList.put(1,new Music( "Radioactive"));
        MusicList.put(2,new Music( "Believer"));
        MusicList.put(3,new Music( "Demons"));
        }
        // Adicione músicas ao array
        
   public  Map<Integer ,Music> getAllmusic(){
    return MusicList;}
    public String getOneMusic(int id){
     Music music=   MusicList.get(id);
        return music.getNome();
    }
    public int size(){
       return MusicList.size();
    }
}
