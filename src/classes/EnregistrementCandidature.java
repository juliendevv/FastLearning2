package classes;
//

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class EnregistrementCandidature {
	
	private File f;

	public EnregistrementCandidature(String chemin) {
		f = new File(chemin);
		}
	
	public void enregistre(Utilisateur u) {

		//public File f;
		try {
			// ObjectFactory objFactory = new ObjectFactory();
			JAXBContext jaxbContext = JAXBContext.newInstance(Utilisateur.class);
						
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, new Boolean(true));
			
		
			marshaller.marshal(u, f);
		}
		catch (Exception mEx) {
			System.err.println(mEx.getMessage());
		}
	}
}