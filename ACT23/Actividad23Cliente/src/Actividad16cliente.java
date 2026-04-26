import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;

import Interfaces.Ipersona;

public class Actividad16cliente {
    public static void main (String[] args) {
        try {
            Ipersona persona = (Ipersona) Naming.lookup("rmi://localhost:1099/Persona");

            System.out.println( persona.getString() );

        } catch (RemoteException ex) {
            Logger.getLogger(Actividad16cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Actividad16cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(Actividad16cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}