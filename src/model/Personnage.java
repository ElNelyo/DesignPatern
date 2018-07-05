package model;

import java.util.List;

/**
 * @author Guillaume
 *
 */
public interface Personnage {
	
	/**
	 * @return the nom
	 */
	public String getNom();
	
	/**
	 * @return the vie
	 */
	public int getVie();
	
	/**
	 * @return the objets
	 */
	public List<Objet> getObjets();
	
}
