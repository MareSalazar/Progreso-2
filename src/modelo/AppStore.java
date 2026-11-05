package arreglos.tienda.modelo

import modelo.Juego;

public class AppStore {
        private static final int MAX =4;
        private Juego juegos[];
        private int indice;

        public AppStore(){ //constructor
            juegos= new Juego[MAX];
            indice= -1;
        }

    public Juego[] getJuegos() {
        return juegos;
    }

   /* NO SE NECESITA EL SET PORQUE LOS DATOS SE INGRESAN UNO A UNO
   public void setJuegos(Juego juegos[]) {
        this.juegos = juegos;
    }
    */
    public boolean adicionarJuego(Juego j){
        if (j!=null && indice<MAX){
            juegos[++indice]=j;
            return true;
        }
        return false;
    }


}
