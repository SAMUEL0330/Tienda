package autonoma.DemoTienda.main;

import autonoma.DemoTienda.models.Administrador;
import autonoma.DemoTienda.models.Producto;
import autonoma.DemoTienda.models.Tienda;
import autonoma.DemoTienda.views.IniciarSesion;
import autonoma.DemoTienda.views.VentanaPrincipal;

/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-12
 */
public class DemoTienda 
{
    public static void main(String[] args) 
    {
        Tienda tienda = new Tienda("Nuevo Milenio", "Cra 9a #55c-25");
        Administrador admin = new Administrador("samuel059", "1002654068", "Samuel Esteban Herrera Bedoya", "12454153", "Calle 20");
        tienda.setAdministrador(admin);
        
        VentanaPrincipal ventana = new VentanaPrincipal(tienda);
        IniciarSesion login = new IniciarSesion(ventana, true, tienda, ventana);
        login.setVisible(true);
    }
}