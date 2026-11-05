package interfaz.Main;

private String nombre;
private String categoria;
private int size;
private double precio;
private int licenciasDisponible;
private int licenciasVendidas;

//usamos constructor por "este juego debe permitir manejar 4 juegos"

public Juego(String nombre, String categoria, int size, double precio, int licenciasDisponible){


    this.nombre=nombre;
    this.categoria=categoria;
    this.size=size;
    this.precio=precio;
    this.licenciasDisponible=licenciasDisponible;
    this.licenciasVendidas=0;

}
//  //MÉTODOS SETTER : RECUERDA: MOSTRAR -> visualizar la información de cada juego
public String getNombre(){

    return nombre;
}

public double getPrecio(){

    return precio;
}

public int getCantidadDisponible(){

    return licenciasDisponible;
}


public String getCategoria(){

    return categoria;
}

public int getSize(){

    return size;
}

public int getCantidadVendidas(){

    return licenciasVendidas;
}



//MÉTODOS SETTER : RECUERDA: MODIFICAR


public void setNombre(String nombre) {

    if(nombre != null && !nombre.trim().isBlank())
        this.nombre=nombre;

}

public void setCategoria(String categoria) {
    if(categoria != null && !categoria.trim().isBlank())
        this.categoria = categoria;

}

public void setSize(int size) {
    if(size > 0)
        this.size=size;

}

public void setPrecio(double precio) {
    if(precio > 0)
        this.precio=precio;

}

//EMPEZAMOS CON LOS MÉTODOS
/*
    public void comprar(int cantidad){
        if(cantidad > 0){
            licenciasDisponible+=cantidad ;
            return true;

        }
        return false;
    }

    */



public boolean comprar(int cantidad){
    if(cantidad > 0){
        licenciasDisponible+=cantidad ;
        return true;

    }
    return false;
}

public boolean vender(int cantidad)
{ if(cantidad >0 && cantidad <= licenciasDisponible){

    licenciasDisponible -=cantidad;
    licenciasVendidas+= cantidad;
    return true;
}
    return false;

}


//GENERAR TO STRING: transforma una variable a un string -> el principio del to string: mostrar sólo los atributos del objeto


@Override
public String toString() {
    return "Juego{" +
            "nombre='" + nombre + '\'' +
            ", categoria='" + categoria + '\'' +
            ", size=" + size +
            ", precio=" + precio +
            ", licenciasDisponible=" + licenciasDisponible +
            ", licenciasVendidas=" + licenciasVendidas +
            '}';
}
