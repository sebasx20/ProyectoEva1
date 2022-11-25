package hibernateMysql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sf = buildSessionFromConfig();
	/**
	 * Crear el objeto SessionFactory a partir del fichero xml de configuraci�n
	 * M�todo creado en modo singleton para la variable privada
	 * s�lo se puede recuperar con el m�todo getSessionFactory();
	 * @return objeto creado
	 */
	public static SessionFactory buildSessionFromConfig() {
		  // Crear la configuraci�n a parit del fichero de configuraci�n
		  Configuration config = new Configuration();
		  config.configure();
		  // crear local SessionFactory 
		  SessionFactory sessionFactory = config.buildSessionFactory();
		  //Session session = sessionFactory.getCurrentSession();
		  return sessionFactory;
		}
	/**
	 * M�todo para recuperar el objeto SessionFactory
	 * @return sf : objeto singleton SessionFactoy
	 */
	public static SessionFactory getSessionFactory() {

		return sf;
	}
	public static Session getCurrSession() {
		return sf.getCurrentSession();
	}
}