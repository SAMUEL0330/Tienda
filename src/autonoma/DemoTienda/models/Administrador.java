package autonoma.DemoTienda.models;

/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 2024-03-12
 */
public class Administrador extends Persona
{
    private String username;
    private String password;

    public Administrador(String username, String password, String nombre, String cedula, String direccion) 
    {
        super(nombre, cedula, direccion);
        this.username = username;
        this.password = password;
    }

    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }
}