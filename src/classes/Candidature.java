package classes;

public class Candidature
{
    private String Nom;

    private String Experience;

    private String Description;

    private String PieceJointe;

    private String Email;

    private String Disponibilite;

    private String Prenom;

    private String Matiere;

    private String Tel;

    private String Tarif;

    public String getNom ()
    {
        return Nom;
    }

    public void setNom (String Nom)
    {
        this.Nom = Nom;
    }

    public String getExperience ()
    {
        return Experience;
    }

    public void setExperience (String Experience)
    {
        this.Experience = Experience;
    }

    public String getDescription ()
    {
        return Description;
    }

    public void setDescription (String Description)
    {
        this.Description = Description;
    }

    public String getPieceJointe ()
    {
        return PieceJointe;
    }

    public void setPieceJointe (String PieceJointe)
    {
        this.PieceJointe = PieceJointe;
    }

    public String getEmail ()
    {
        return Email;
    }

    public void setEmail (String Email)
    {
        this.Email = Email;
    }

    public String getDisponibilite ()
    {
        return Disponibilite;
    }

    public void setDisponibilite (String Disponibilite)
    {
        this.Disponibilite = Disponibilite;
    }

    public String getPrenom ()
    {
        return Prenom;
    }

    public void setPrenom (String Prenom)
    {
        this.Prenom = Prenom;
    }

    public String getMatiere ()
    {
        return Matiere;
    }

    public void setMatiere (String Matiere)
    {
        this.Matiere = Matiere;
    }

    public String getTel ()
    {
        return Tel;
    }

    public void setTel (String Tel)
    {
        this.Tel = Tel;
    }

    public String getTarif ()
    {
        return Tarif;
    }

    public void setTarif (String Tarif)
    {
        this.Tarif = Tarif;
    }

    @Override
    public String toString()
    {
        return "Objet: Nom = "+Nom+", Experience = "+Experience+", Description = "+Description+", PieceJointe = "+PieceJointe+", Email = "+Email+", Disponibilite = "+Disponibilite+", Prenom = "+Prenom+", Matiere = "+Matiere+", Tel = "+Tel+", Tarif = "+Tarif+"";
    }
}
