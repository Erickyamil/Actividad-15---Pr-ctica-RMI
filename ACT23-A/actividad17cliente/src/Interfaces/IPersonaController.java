package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IPersonaController extends Remote{
    IPersona newInstance() throws RemoteException;
    void add(IPersona persona) throws RemoteException;
    List<IPersona> list() throws RemoteException;
    void update(IPersona persona) throws RemoteException;
}
