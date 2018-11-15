package poo_somospnt;


public class Producto {
    
    private double litros;
    private int capacidad;
    private int precio;
    private String unidadDeVenta;    
    
    private String nombre ;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }


   
    public String toString()
            
    {
      return "Nombre :"+ nombre +"///"+"Litros :"+ litros + "///"
             +"Precio :"+"$" + precio  ;

    }
    
    
}
