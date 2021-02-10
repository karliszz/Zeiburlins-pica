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

	}

}
