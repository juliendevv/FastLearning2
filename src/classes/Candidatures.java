package classes;

public class Candidatures
{
    private Candidature[] candidature;

    public Candidature[] getCandidature ()
    {
        return candidature;
    }

    public void setCandidature (Candidature[] candidature)
    {
        this.candidature = candidature;
    }

    @Override
    public String toString()
    {
        return "Objet candidature = "+candidature+"";
    }
}