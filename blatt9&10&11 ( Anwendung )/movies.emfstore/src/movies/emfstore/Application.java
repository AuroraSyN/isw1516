package movies.emfstore;

import movies.emfstore.server.EMFStoreServer;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	private EMFStoreServer server;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.
	 * IApplicationContext)
	 */
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("EMFStoreServerConnector started...");

		server = new EMFStoreServer();
		server.run();

		return IApplication.EXIT_OK;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
		server.stop();
		System.out.println("EMFStoreServerConnector stopped");
	}
}
