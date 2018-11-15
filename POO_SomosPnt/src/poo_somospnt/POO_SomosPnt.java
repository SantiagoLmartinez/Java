package poo_somospnt;

public class POO_SomosPnt {

    
    public static void main(String[] args) {

        System.out.println("Test [...]");
        Producto gaseosa1 = new Producto();

        gaseosa1.setNombre("Coca-Cola Zero"); 
        gaseosa1.setLitros(1.5);
        gaseosa1.setPrecio(20);

        Producto gaseosa2 = new Producto();
        gaseosa2.setNombre("Coca-Cola");
        gaseosa2.setLitros(1.5);
        gaseosa2.setPrecio(18);

        Producto shampoo = new Producto();

        shampoo.setNombre ("Shampoo Sedal");
        shampoo.setCapacidad(500);
        shampoo.setPrecio(19);

        Producto fruta1 = new Producto();
        fruta1.setNombre("Frutilla");
        fruta1.setPrecio(64);
        fruta1.setUnidadDeVenta("Kilo");

        System.out.println(gaseosa1.toString());
        System.out.println("-------------------");
        System.out.println(gaseosa2.toString());
        System.out.println("-------------------");
        System.out.println(shampoo.toString());
        System.out.println("-------------------");
        System.out.println(fruta1.toString());
        System.out.println("-------------------");
        
//        System.out.println("Producto mas caro :"+ fruta1.nombre);
//        System.out.println("Producto mas barato :"+gaseosa1.nombre);
//        
        System.out.println("-------------------");

        
        System.out.println("Test [ok]");
    }

}
