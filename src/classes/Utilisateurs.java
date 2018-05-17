package classes;

public class Utilisateurs
{
    private Utilisateur[] Utilisateur;

    public Utilisateur[] getUtilisateur ()
    {
        return Utilisateur;
    }

    public void setUtilisateur (Utilisateur[] Utilisateur)
    {
        this.Utilisateur = Utilisateur;
    }

    @Override
    public String toString()
    {
        return "Objet : Utilisateur = "+Utilisateur+"";
    }
}
			