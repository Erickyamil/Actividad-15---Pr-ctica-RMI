package servidorrmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

import interfaces.IOperaciones;

public class ServidorRMI {
    public static void main(String[] args) throws Exception {
        try {
            LocateRegistry.createRegistry(1099);
            IOperaciones interfaz = new Operaciones();
            Naming.rebind("rmi://localhost/Operaciones", interfaz);
            System.out.println("Escuchando...");
        } catch (RemoteException ex) {
            Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
