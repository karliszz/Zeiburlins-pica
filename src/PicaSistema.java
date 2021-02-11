import javax.swing.JOptionPane;

public class PicaSistema {

	public static void main(String[] args) {
		String izvele;
		int izmers;
		String vards;
		String telnr;
		String piegade;
		double pasutijums=0;
		String garnejums;
		
		do {
			izvele = (JOptionPane.showInputDialog("Ievadi kādu picu vēlies: Studentu 5€, Mocarella 3.32€, Hawai 7.22€, Pikanta 6.66€"));
			izvele = izvele.toLowerCase();
			
		}while(!izvele.matches("studentu|mocarella|hawai|pikanta"));
		do {
			izmers = Integer.parseInt(JOptionPane.showInputDialog("Ievadi picas izmēru: 25, 30 2€, vai 50 4€"));
		
			
			
		}while(izmers!=25 && izmers!=30 && izmers!=50);
		do {
			garnejums = (JOptionPane.showInputDialog("Ievadi papildu piedevas picai: siers 1€, peperoni 2.3€, sampinjoni 1.7€, olives 2.7€, skinkis 4€"));
			garnejums = garnejums.toLowerCase();
			
		}while(!garnejums.matches("siers|peperoni|sampinjoni|olives|skinkis"));
		
		vards=(JOptionPane.showInputDialog("Ievadiet pasūtītāja vārdu!"));
		telnr=(JOptionPane.showInputDialog("Ievadiet telefona numuru!"));
		piegade=(JOptionPane.showInputDialog("Sakarā ar pašreizējo situaciju valstī picas varat saņemt tikai ar piegadi uz majām tāpēc norādiet savu ardesi!"));
	
		switch(izvele) {
			case "studentu": pasutijums=5;
			break;
			case "mocarella": pasutijums=3.32;
			break;
			case "hawai": pasutijums=7.22;
			break;
			case "pikanta": pasutijums=6.66;
			break;

	}
			switch(izmers) {
				case 25: pasutijums=pasutijums+0;
				case 30: pasutijums=pasutijums+2;
				case 50: pasutijums=pasutijums+4;
		}
			switch(garnejums) {
				case "siers": pasutijums=pasutijums+1;
				break;
				case "peperoni": pasutijums=pasutijums+2.3;
				break;
				case "sampinjoni": pasutijums=pasutijums+1.7;
				break;
				case "olives": pasutijums=pasutijums+2.7;
				break;
				case "skinkis": pasutijums=pasutijums+4;
				break;
	}
	pasutijums=pasutijums*5;
	
	JOptionPane.showMessageDialog(null,"Esat pasūtijis "+izvele+" kuras diametrs ir "+izmers+" un ar papildus "+garnejums+" kopā jums izmaksas: "+pasutijums);
	JOptionPane.showMessageDialog(null,"Pasūtītāja vārds: "+vards+", telefona numurs: "+telnr+" un piegādes adrese: "+piegade);
}
}


