package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import client.ChatClientInterface;
import process.PresenceService;
import process.RegistrationInfo;

public class PresenceServiceImpl  implements PresenceService  {

	/**
	 * 
	 */
	

	Vector<RegistrationInfo> clients;
	
	protected PresenceServiceImpl() throws RemoteException {
		super();
		clients = new Vector<RegistrationInfo>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public synchronized boolean register(RegistrationInfo reg) throws RemoteException {
		// TODO Auto-generated method stub
		
		clients.addElement(reg);		
		return true;
	}

	@Override
	public synchronized boolean updateRegistrationInfo(RegistrationInfo reg) throws RemoteException {
		
		
		
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public synchronized void unregister(String userName) throws RemoteException {
		
		clients.removeElement(userName);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public RegistrationInfo lookup(String name) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<RegistrationInfo> listRegisteredUsers() throws RemoteException {
		return clients;
	}

	@Override
	public void broadcastMessage(String message) throws RemoteException {
		
			for(RegistrationInfo info : clients) 
			{
				
				
				
				
			}
							
	}
	
}

