import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import Interfaces.Ipersona;

public class Persona extends UnicastRemoteObject implements Ipersona{

    private int id;
    private String nombre;
    private String email;
    private String telefono;

    protected Persona(int id, String nombre, String email, String telefono) throws RemoteException {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public int getId() throws RemoteException{
        return id;
    }

    public void setId(int id) throws RemoteException{
        this.id = id;
    }

    public String getNombre() throws RemoteException{
        return nombre;
    }

    public void setNombre(String nombre) throws RemoteException{
        this.nombre = nombre;
    }

    public String getEmail() throws RemoteException{
        return email;
    }

    public void setEmail(String email) throws RemoteException{
        this.email = email;
    }

    public String getTelefono() throws RemoteException{
        return telefono;
    }

    public void setTelefono(String telefono) throws RemoteException{
        this.telefono = telefono;
    }

    public String getString() {
        return String.format("Id: %d,  Nombre: %s, Email: %s, Teléfono: %s",
            id, nombre, email, telefono);
    }
}
