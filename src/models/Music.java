package models;

public class Music {
    
    
        private String nome;
    
        public Music( String nome) {
           
            this.nome = nome;
        }
    
        public String getNome() {
            return nome;
        }
    
        @Override
        public String toString() {
            return  "Nome: " + nome;
        }
    
}
