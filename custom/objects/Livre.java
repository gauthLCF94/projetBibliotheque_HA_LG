package com.projetbiblio.custom.objects;

public class Livre {
	public int m_id;
	public int m_idAuteur;
	public int m_idTitre;
	public int m_idTheme;
	public int m_idEmplacement;
	public int m_stock;
	
	public int GetID()
	{
		return m_id;
	}
	
	public void SetID(int i)
	{
		m_id = i;
	}
	
	public int GetIDAuteur()
	{
		return m_idAuteur;
	}
	
	public void SetIDAuteur(int i)
	{
		m_idAuteur = i;
	}
	
	public int GetIDTitre(int i)
	{
		return m_idTitre;
	}
	
	public void SetIDTitre(int i)
	{
		m_idTitre = i;
	}
	
	public int GetIDTheme()
	{
		return m_idTheme;
	}
	
	public void SetIDTheme(int i)
	{
		m_idTheme = i;
	}
	
	public int GetIDEmplacement()
	{
		return m_idEmplacement;
	}
	
	public void SetIDEmplacement(int i)
	{
		m_idEmplacement = i;
	}
	
	public int GetStock()
	{
		return m_stock;
	}
	
	public void SetStock(int i)
	{
		m_stock = i;
	}
}
