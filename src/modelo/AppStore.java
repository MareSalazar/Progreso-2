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
        if (j!=null && indice<MAX-1){
            juegos[++indice]=j;
            return true;
        }
        return false;
    }

    public Juego buscarJuego(String nombre){
        if(nombre!=null && !nombre.trim().isEmpty()){
            for(int i =0; i<= indice; i++){
                if(juegos[i].getNombre().equalsIgnoreCase(nombre){
                    return juegos[i];
                }
            }
            return null;
        }
        return null;
    }
    public boolean comprar (String nombre, int cantidad){
        //opcional ya que en buscarJuego y el comprar de juego ya validan
        Juego j= buscarJuego(nombre);
        if(j!=null){
            return j.comprar(cantidad);
        }
        return false;
    }
    public double vender(String nombre, int cantidad){
        if(nombre!=null && !nombre.trim().isEmpty() && cantidad>0){
            Juego j= buscarJuego(nombre);
            if(j!=null){
                if(j.vender(cantidad)){
                    return j.getPrecio()*cantidad;
                }
            }
            return 0;
        }


}
}
