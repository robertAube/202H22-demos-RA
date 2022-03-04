package file;//Robert Aubé
//Objectifs :
//- Savoir mettre en oeuvre les structures de données

public class Noeud
{
	private Object data;
	private Noeud suivant;
	
	public Noeud(Object pObj, Noeud pNext)
	{	data = pObj;
		suivant = pNext;
	}

	public Object getData()
	{	return (data);
	}

	public Noeud getSuivant()
	{	return (suivant);
	}

	public void setSuivant(Noeud pNext)
	{	suivant = pNext;
	}
}
