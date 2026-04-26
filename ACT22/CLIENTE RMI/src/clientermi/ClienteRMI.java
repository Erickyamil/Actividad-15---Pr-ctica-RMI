package clientermi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

import interfaces.IOperaciones;

public class ClienteRMI {
    public static void main(String[] args) throws Exception {
        try {
            IOperaciones objetoRemoto = (IOperaciones) Naming.lookup("rmi://Localhost/Operaciones");
            double resultado = objetoRemoto.sumar(10, 20);
            System.out.println(resultado);
            double resultado2 = objetoRemoto.restar(20, 10);
            System.out.println(resultado2);
        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex)
        {
            Logger.getLogger(ClienteRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
