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
	}

}
