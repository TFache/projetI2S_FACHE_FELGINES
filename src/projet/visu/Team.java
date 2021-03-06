package projet.visu;

import java.io.Serializable;

public class Team implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String link;
	private String pseudo; //Correspond en r�alit� au titre de l'�quipe en question

	public Team() {
		super();
	}

	public Team(int id, String link, String pseudo) {
		super();
		this.id = id;
		this.link = link;
		this.pseudo = pseudo;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return the login
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * @param login the login to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	
	
	
}
