package autonoma.DemoTienda.models;

import java.util.ArrayList;

/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-12
 */
public class Tienda 
{
    private String nombre;
    private String direccion;
    private Inventario inventario;
    private Administrador administrador;

    public Tienda(String nombre, String direccion) 
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.inventario = new Inventario();
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getDireccion() 
    {
        return direccion;
    }

    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }

    public Inventario getInventario()
    {
        return inventario;
    }

    public Administrador getAdministrador() 
    {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) 
    {
        this.administrador = administrador;
    }
    /**
     * 
     * @return 
     */
    public ArrayList<Producto> obtenerProductos()
    {
        return this.inventario.getProductos();
    }
    /**
     * 
     * @param producto
     * @return 
     */
    public boolean agregarProducto(Producto producto)
    {
        return this.inventario.agregarProducto(producto);
    }
    /**
     * 
     * @param producto
     * @return 
     */
    public Producto buscarProducto(Producto producto)
    {  
        return this.inventario.buscarProducto(producto);
    }
    /**
     * 
     * @param id
     * @return 
     */
    public Producto buscarProducto(long id)
    {
        return this.inventario.buscarProducto(id);
    }
    /**
     * 
     * @param nombre
     * @return 
     */
    public Producto buscarProducto(String nombre)
    {
        return this.inventario.buscarProducto(nombre);
    }
    /**
     * 
     * @param id
     * @param producto
     * @return 
     */
    public Producto actualizarProducto(long id, Producto producto)
    {
        return this.inventario.actualizarProducto(id, producto);
    }
    /**
     * 
     * @param id
     * @return 
     */
    public Producto eliminarProducto(long id)
    {
        return this.inventario.eliminarProducto(id);
    }
    /**
     * 
     * @return 
     */
    public String mostrarInventario()
    {
        return this.inventario.mostrarInventario();
    }
    /**
     * 
     * @param user
     * @param password
     * @return 
     */
    public boolean iniciarSesion(String user, String password)
    {
        return this.administrador.getUsername().equals(user) && this.administrador.getPassword().equals(password);
    }
}