package classes;

public class Annonce
{
    private String nombre;

    private String Nom;

    private String date_debut;

    private String niveau;

    private String date_fin;

    private String matiere;

    private String description;

    private String Prenom;

    private String tarif;

    public String getNombre ()
    {
        return nombre;
    }

    public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }

    public String getNom ()
    {
        return Nom;
    }

    public void setNom (String Nom)
    {
        this.Nom = Nom;
    }

    public String getDate_debut ()
    {
        return date_debut;
    }

    public void setDate_debut (String date_debut)
    {
        this.date_debut = date_debut;
    }

    public String getNiveau ()
    {
        return niveau;
    }

    public void setNiveau (String niveau)
    {
        this.niveau = niveau;
    }

    public String getDate_fin ()
    {
        return date_fin;
    }

    public void setDate_fin (String date_fin)
    {
        this.date_fin = date_fin;
    }

    public String getMatiere ()
    {
        return matiere;
    }

    public void setMatiere (String matiere)
    {
        this.matiere = matiere;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getPrenom ()
    {
        return Prenom;
    }

    public void setPrenom (String Prenom)
    {
        this.Prenom = Prenom;
    }

    public String getTarif ()
    {
        return tarif;
    }

    public void setTarif (String tarif)
    {
        this.tarif = tarif;
    }

    @Override
    public String toString()
    {
        return "Objet : nombre = "+nombre+", Nom = "+Nom+", date_debut = "+date_debut+", niveau = "+niveau+", date_fin = "+date_fin+", matiere = "+matiere+", description = "+description+", Prenom = "+Prenom+", tarif = "+tarif+"";
    }
}