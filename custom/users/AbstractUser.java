package com.projetbiblio.custom.users;


public abstract class AbstractUser {
	
	public enum Droits { Bibliothequaire, Collaborateur, Adherent };
	
	protected Droits m_droits;
	protected int m_ID;
	protected String m_nom;
	protected String m_prenom;
	protected String m_adresse;
	protected String m_telephone;
	protected String m_mdp;
	
	public int getID()
	{
		return m_ID;
	}
	
	public void setID(int id)
	{
		m_ID = id;
	}
	
	public String getNom()
	{
		return m_nom;
	}
	
	public void setNom(String nom)
	{
		m_nom = nom;
	}
	
	public String getPrenom()
	{
		return m_prenom;
	}
	
	public void setPrenom(String prenom)
	{
		m_prenom = prenom;
	}
	
	public String getAdresse()
	{
		return m_adresse;
	}
	
	public void setAdresse(String adresse)
	{
		m_adresse = adresse;
	}
	
	public String getMdp()
	{
		return m_mdp;
	}
	
	public void setMdp(String mdp)
	{
		m_mdp = mdp;
	}
	
	protected Boolean Connect()						// Method partagée par tout les users pour se connecter à l'application
	{
		if (0 < 1)									// TODO: Condition à modifier
			return true;
		else
			return false;
	}
	
	public void ShowCatalogue()						// Method partagée par tout les users pour voir le catalogue des livres disponibles (et indisponibles ?)
	{
		// TODO : afficher tout les livres (redirection ?) 
	}
}
