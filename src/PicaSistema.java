import javax.swing.JOptionPane;

public class PicaSistema {

	public static void main(String[] args) {
		String izvele;
		int izmers;
		String vards;
		String telnr;
		String piegade;
		do {
			izvele = (JOptionPane.showInputDialog("Ievadi kādu picu vēlies: Studentu, Mocarella, Hawai, Pikanta"));
			izvele = izvele.toLowerCase();
			
		}while(!izvele.matches("studentu | mocarella | hawai | pikanta"));
		do {
			izmers = Integer.parseInt(JOptionPane.showInputDialog("Ievadi picas izmēru: 25, 30, vai 50"));
			
			
		}while(izmers!=25 && izmers!=30 && izmers!=50);
		vards=(JOptionPane.showInputDialog("Ievadiet pasūtītāja vārdu!"));
		telnr=(JOptionPane.showInputDialog("Ievadiet telefona numuru!"));
		piegade=(JOptionPane.showInputDialog("Sakarā ar pašreizējo situaciju valstī picas varat saņemt tikai ar piegadi uz majām tāpēc norādiet savu ardesi!"));
	}

}
