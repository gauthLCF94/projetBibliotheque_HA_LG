package com.projetbiblio.custom.users;

import com.projetbiblio.custom.objects.*;

public class Adherent extends AbstractUser {

	protected int m_nbLivreEmprunte;
	protected int m_nbMaxLivreEmprunte;
	protected int m_nbJourPeriodicite;
	
	public int GetNbLivreEmprunte()
	{
		return m_nbLivreEmprunte;
	}
	
	public void SetNbLivreEmprunte(int i)
	{
		m_nbLivreEmprunte = i;
	}
	
	public int GetNbMaxLivreEmprunte()
	{
		return m_nbMaxLivreEmprunte;
	}
	
	public void SetNbMaxLivreEmprunte(int i)
	{
		m_nbMaxLivreEmprunte = i;
	}
	
	public int GetNbJourPeriodicite()
	{
		return m_nbJourPeriodicite;
	}
	
	public void SetNbJourPeriodicite(int i)
	{
		m_nbJourPeriodicite = i;
	}
	
	Adherent(String nom, String prenom, String adresse, String telephone, String mdp)
	{
		// m_ID = ???;					TODO: method d'application d'un nouvel id.
		m_droits = Droits.Adherent;
		m_nom = nom;
		m_prenom = prenom;
		m_adresse = adresse;
		m_telephone = telephone;
		m_mdp = mdp;
		m_nbLivreEmprunte = 0;
		m_nbMaxLivreEmprunte = 5;
		m_nbJourPeriodicite = 14;
	}
	
	public Boolean Emprunter(Livre livreEmprunt)
	{
		if (m_nbLivreEmprunte +1 <= 5 || livreEmprunt.GetStock() > 0)
		{
			m_nbLivreEmprunte++;
			livreEmprunt.SetStock(livreEmprunt.GetStock()-1);
			return true;
		}
		else
			return false;
	}
	
}
