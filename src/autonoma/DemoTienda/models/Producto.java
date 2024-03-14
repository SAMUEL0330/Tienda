package autonoma.DemoTienda.models;

/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-12
 */
public class Producto 
{
    private static int contadorProducto = 1;

    private long id;
    private String nombre;
    private double precio;

    public Producto()
    {
        this.id = Producto.contadorProducto;
        this.nombre = "";
        this.precio = 0;
        contadorProducto++;
    }

    public Producto(String nombre, double precio) 
    {
        this.id = Producto.contadorProducto;
        this.nombre = nombre;
        this.precio = precio;
        contadorProducto++;
    }

    public long getId() 
    {
        return id;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public double getPrecio() 
    {
        return precio;
    }

    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }
    
    @Override
    public String toString()
    {
       return "Producto " +id+ "\n"+
               "  Nombre: "+nombre+"\n"+
               "  Precio: "+precio+"\n";
    }
}