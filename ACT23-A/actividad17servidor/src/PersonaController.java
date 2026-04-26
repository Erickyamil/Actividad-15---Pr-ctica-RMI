import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import Interfaces.IPersona;
import Interfaces.IPersonaController;

public class PersonaController extends UnicastRemoteObject implements IPersonaController{

    private List<IPersona> personas;

    protected PersonaController() throws RemoteException {
        personas = new ArrayList<>();
    }

    @Override
    public void add(IPersona persona) throws RemoteException {
        personas.add(persona);
    }

    @Override
    public List<IPersona> list() throws RemoteException {
       return personas;
    }

    @Override
    public void update(IPersona persona) throws RemoteException {
        //Pendiente
    }

    public IPersona newInstance() throws RemoteException{
        return new Persona();
    }
    
}
