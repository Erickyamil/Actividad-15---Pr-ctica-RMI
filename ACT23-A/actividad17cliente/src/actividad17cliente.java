import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import Interfaces.IPersonaController;
import Interfaces.IPersona;

public class actividad17cliente {

    public static void imprimirLista(List<IPersona> lista) throws RemoteException {
        System.out.printf("Datos: (%d)\n", lista.size());
        for(IPersona persona : lista){
            System.out.println( persona.getString() );
        }
    }
    public static void main(String[] args) throws Exception {
        try{
            IPersonaController personaController = 
                    (IPersonaController) Naming.lookup("rmi://localhost/PersonaController");
            IPersona persona = personaController.newInstance(); 
            persona.setId(1);
            persona.setNombre("Beto");
            persona.setEmail("beto@mail.com");
            persona.setTelefono("9211231234");
        
            imprimirLista( personaController.list() );
            personaController.add(persona);
            imprimirLista( personaController.list() );
        
        } catch (NotBoundException ex) {
            Logger.getLogger(actividad17cliente.class.getName()).log(Level.SEVERE, null, ex);  
        } catch (RemoteException ex) {
            Logger.getLogger(actividad17cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(actividad17cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}