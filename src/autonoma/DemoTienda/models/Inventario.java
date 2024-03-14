package autonoma.DemoTienda.models;

import java.util.ArrayList;
/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-12
 */
public class Inventario 
{    
    private ArrayList<Producto> productos;

    public Inventario() 
    {
        this.productos = new ArrayList<>();
    }
    
    public ArrayList<Producto> getProductos() 
    {
        return productos;
    }
    
    /**
     * Agrega un nuevo producto al inventario.
     * @param producto Objeto de tipo Producto que se va a agregar al inventario.
     * @return verdadero si el producto se agrega exitosamente, falso en caso contrario.
     */
    public boolean agregarProducto(Producto producto)
    { 
        return this.productos.add(producto);
    }
    
    /**
     * Busca un producto en el inventario basándose en un objeto Producto.
     * @param producto Objeto de tipo Producto que se desea buscar en el inventario.
     * @return El objeto Producto encontrado si existe en el inventario, null si no se encuentra.
     */
    public Producto buscarProducto(Producto producto)
    {    
        for(int i=0;i<this.productos.size();i++)
        {
            Producto p = this.productos.get(i);
            if(p.equals(producto))
            {
                return p;
            }
        }
        return null;
    }
    
    /**
     * Busca un producto en el inventario basándose en su ID.
     * @param id ID del producto que se desea buscar en el inventario.
     * @return El objeto Producto encontrado si existe en el inventario, null si no se encuentra.
     */
    public Producto buscarProducto(long id)
    {    
        for(int i=0;i<this.productos.size();i++)
        {
            Producto p = this.productos.get(i);
            if(p.getId() == id)
            {
                return p;
            }
        }
        return null;   
    }
    
    /**
     * Busca un producto en el inventario basándose en su nombre.
     * @param nombre Nombre del producto que se desea buscar en el inventario.
     * @return El objeto Producto encontrado si existe en el inventario, null si no se encuentra.
     */
    public Producto buscarProducto(String nombre)
    {    
        for(int i=0;i<this.productos.size();i++)
        {
            Producto p = this.productos.get(i);
            if(p.getNombre().equals(nombre))
            {
                return p;
            }
        }
        return null;   
    }
    
    /**
     * Busca el índice de un producto en el inventario basándose en su ID.
     * @param id ID del producto que se desea buscar en el inventario.
     * @return El índice del producto encontrado si y solo si existe en el inventario, "-1" si es que no se encuentra.
     */
    private int buscarIndiceProducto(long id)
    {
        for(int i=0;i<this.productos.size();i++)
        {
            Producto p = this.productos.get(i);
            if(p.getId() == id)
            {
                return i;
            }
        }
        return -1;  
    }
    
    /**
     * Actualiza un producto en el inventario basándose en su ID.
     * @param id ID del producto que se desea actualizar en el inventario.
     * @param producto Nuevo objeto de tipo Producto que reemplazará al producto existente.
     * @return El objeto Producto actualizado si se encuentra y actualiza correctamente, null si no se encuentra.
     */
    public Producto actualizarProducto(long id, Producto producto)
    {
        int index = this.buscarIndiceProducto(id);
        if(index>=0)
        {
            return this.productos.set(index, producto);
        }else{
            return null;
        }
    }

    /**
     * Elimina un producto del inventario basándose en su ID.
     * @param id ID del producto que se desea eliminar del inventario.
     * @return El objeto Producto eliminado si se encuentra y se elimina correctamente, null si no se encuentra.
     */
    public Producto eliminarProducto(long id)
    {    
        int index = this.buscarIndiceProducto(id);
        if(index>=0)
        {
            return this.productos.remove(index);
        }else{
            return null;
        }
    }

    /**
     * Devuelve una representación en forma de cadena de todos los productos en el inventario.
     * @return Una cadena que contiene la representación de todos los productos en el inventario, separados por saltos de línea.
     */
    public String mostrarInventario()
    {
        String inventario = "";
        for(int i=0;i<this.productos.size();i++)
        {
            Producto p = this.productos.get(i);
            inventario += p.toString()+"\n";
        }
        return inventario;
    }
}