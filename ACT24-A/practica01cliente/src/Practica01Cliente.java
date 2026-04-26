import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.print.attribute.standard.PresentationDirection;

import Interfaces.IPersona;
import Interfaces.IPersonaController;

public class Practica01Cliente {
    public static void main(String[] args) throws Exception {
        try {
            IPersonaController personaController = 
                (IPersonaController) Naming.lookup("rmi://localhost/PersonaController");

            // Bloque a editar
            IPersona persona = personaController.newInstance();
            persona.setNombre("Javier");
            
            List<IPersona> lista = personaController.find(persona);
            for ( IPersona personaTemp : lista ){
                System.out.println( personaTemp.getString() );
            }
            // Fin del bloque a editar
        } catch (NotBoundException ex) {
            Logger.getLogger(Practica01Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Practica01Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Practica01Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
