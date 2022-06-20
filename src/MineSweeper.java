import java.util.Random;
import java.util.Scanner;
public class MineSweeper {
	private int satir_sayisi;
	private int sutun_sayisi;
	private char[][] map;
 	
	public MineSweeper (int satir_sayisi, int sutun_sayisi) {
		this.satir_sayisi=satir_sayisi;
		this.sutun_sayisi=sutun_sayisi;
	}
	
	public MineSweeper () {
		
	}
	
	public void setSatir_sayisi(int satir_sayisi) {
		this.satir_sayisi=satir_sayisi;
	}
	
	public void setSutun_sayisi(int sutun_sayisi) {
		this.sutun_sayisi=sutun_sayisi;
	}
	
	public void run() {
		map=new char[satir_sayisi][sutun_sayisi];
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("=======MAYIN TARLASI OYUNU BAÞLADI=======\n\n");
		
		for(int i=0;i<satir_sayisi;i++) {
			for(int j=0;j<sutun_sayisi;j++) {
				int temp=random.nextInt(4);
				if(temp==2) {
					map[i][j]='*';
					
				}
				else {
					map[i][j]='-';
				}
			}
		}
		char[][] map2=map;
		
		for(int i=0;i<satir_sayisi;i++){
			for(int j=0;j<sutun_sayisi;j++) {
				if(map2[i][j]=='*') {
					System.out.print(" -");
					continue;
				}
				System.out.print(" "+map2[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		while(true) {
			int satir;
			while(true) {
				System.out.println("\n\nSatýr Giriniz:");
				satir=sc.nextInt();
				if(satir<0||satir>satir_sayisi-1) {
					System.out.println("Hatalý Ýndis Girdiniz:");
					continue;
				}
				else {
					break;
				}
			}

			
			int sutun;
			while(true) {
				System.out.println("Sütun Giriniz:");
				sutun=sc.nextInt();
				if(sutun<0||sutun>sutun_sayisi-1) {
					System.out.println("Hatalý Ýndis Girdiniz:");
					continue;
				}
				else {
					break;
				}
			}
			System.out.println("=================================");
			
			if(map2[satir][sutun]=='-') {
				int temp=0;
				
				for(int i=(satir-1);i<=(satir+1);i++) {
					for(int j=(sutun-1);j<=(sutun+1);j++) {
						if(i<0||i>(satir_sayisi-1)) {
							continue;
						}
						if(j<0||j>(sutun_sayisi-1)) {
							continue;
						}
						if(map2[i][j]=='*') {
							temp++;
						}
						
					}
					
				}
				
				map2[satir][sutun]=(char)(48+temp);
				
			}
			else if(map2[satir][sutun]=='*'){
				System.out.println("Mayýna Bastýnýz :(");
				for(int i=0;i<satir_sayisi;i++) {
					for(int j=0;j<sutun_sayisi;j++) {
						System.out.print(" "+map[i][j]);
					}
					System.out.print("\n");
				}
				System.out.println("=================================");
				System.exit(1);
				
			}
			else {
				System.out.println("Burayý Daha Önce Açtýnýz!");
				System.out.println("=================================");
				continue;
			}
			
			for(int i=0;i<satir_sayisi;i++){
				for(int j=0;j<sutun_sayisi;j++) {
					if(map2[i][j]=='*') {
						System.out.print(" -");
						continue;
					}
					System.out.print(" "+map2[i][j]);
				}
				System.out.println();
			}
			
			
			
			System.out.println("=================================");
			
			int temp2=0;
			for(int i=0;i<satir_sayisi;i++){
				for(int j=0;j<sutun_sayisi;j++) {
					if(map2[i][j]!='-') {
						temp2++;
					}
				}
					
			}
			if(temp2==(satir_sayisi*sutun_sayisi)) {
				System.out.println("Tebrikler Kazandýnýz!!");
				for(int i=0;i<satir_sayisi;i++) {
					for(int j=0;j<sutun_sayisi;j++) {
						System.out.print(" "+map[i][j]);
					}
					System.out.print("\n");
				}
				System.exit(0);
			}
			
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
