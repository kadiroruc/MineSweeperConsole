import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		MineSweeper mineSweeper=new MineSweeper();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("Oyun Zorluk Seviyesini Giriniz:\n\nKolay (4-4) -->1\nOrta (7-7) -->2\nZor (9-9) -->3\nUzman (12-12) -->4");
			int zorluk=scanner.nextInt();
			
			switch (zorluk) {
			case 1: 
				mineSweeper.setSatir_sayisi(4);
				mineSweeper.setSutun_sayisi(4);
				break;
			case 2:
				mineSweeper.setSatir_sayisi(7);
				mineSweeper.setSutun_sayisi(7);
				break;
			case 3:
				mineSweeper.setSatir_sayisi(9);
				mineSweeper.setSutun_sayisi(9);
				break;
			case 4:
				mineSweeper.setSatir_sayisi(12);
				mineSweeper.setSutun_sayisi(12);
				break;
			
			default:
				System.out.println("Hatalý Giriþ Yaptýnýz:");
				continue;
			}
			break;
			
			
		}
		
		mineSweeper.run();
	}
}
