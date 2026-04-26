import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Actividad16 {
    public static void main(String[] args) {
    try {
            LocateRegistry.createRegistry(1099);
            Persona personal = new Persona(1, "Alex", "alex@mail.com", "9211231234");
            Naming.rebind("rmi://localhost/Persona", personal);
            System.out.println("Escuchando...");
        } catch (RemoteException ex) {
            Logger.getLogger(Actividad16.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Actividad16.class.getName()).log(Level.SEVERE, null, ex);
        }         
    }
}
