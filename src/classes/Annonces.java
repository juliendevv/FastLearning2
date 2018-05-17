package classes;

public class Annonces
{
    private Annonce[] Annonce;

    public Annonce[] getAnnonce ()
    {
        return Annonce;
    }

    public void setAnnonce (Annonce[] Annonce)
    {
        this.Annonce = Annonce;
    }

    @Override
    public String toString()
    {
        return "Objet : Annonce = "+Annonce+"";
    }
}