package classes;

public class Utilisateur
{
    private String Nom;

    private String Numero_de_tel;

    private String Presentation;

    private String Prenom;

    private String Date_de_naissance;

    private String Mail;

    public String getNom ()
    {
        return Nom;
    }

    public void setNom (String Nom)
    {
        this.Nom = Nom;
    }

    public String getNumero_de_tel ()
    {
        return Numero_de_tel;
    }

    public void setNumero_de_tel (String Numero_de_tel)
    {
        this.Numero_de_tel = Numero_de_tel;
    }

    public String getPresentation ()
    {
        return Presentation;
    }

    public void setPresentation (String Presentation)
    {
        this.Presentation = Presentation;
    }

    public String getPrenom ()
    {
        return Prenom;
    }

    public void setPrenom (String Prenom)
    {
        this.Prenom = Prenom;
    }

    public String getDate_de_naissance ()
    {
        return Date_de_naissance;
    }

    public void setDate_de_naissance (String Date_de_naissance)
    {
        this.Date_de_naissance = Date_de_naissance;
    }

    public String getMail ()
    {
        return Mail;
    }

    public void setMail (String Mail)
    {
        this.Mail = Mail;
    }

    @Override
    public String toString()
    {
        return "Objet : Nom = "+Nom+", Numero_de_tel = "+Numero_de_tel+", Presentation = "+Presentation+", Prenom = "+Prenom+", Date_de_naissance = "+Date_de_naissance+", Mail = "+Mail+"";
    }
}