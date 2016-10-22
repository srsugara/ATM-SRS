package ATM;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

//import readwrite_file.Mahasiswa;
public class objek {
	private static ObjectInputStream ois;
	static  ObjectOutputStream oos;
	static Scanner sc=new Scanner(System.in);
	static int i,j;
	static String lanjut;
	static long uang,temp;
	static nasabah[] nsb=new nasabah[5];
	static objek o=new objek();
	public static void main(String[] args) {
		  try {
			  
			  File f=new File("D:\\ATM.dat");
			  
			  if(f.exists()){
	            FileInputStream fin = new FileInputStream("D:\\ATM.dat");
	            ois = new ObjectInputStream(fin);
	           
	         
	            
	            nasabah[] nasabahs=(nasabah[]) ois.readObject();
	            
	            if(nasabahs==null){
		            	
		            nasabah syauqi=new nasabah();
		    			syauqi.norek="001";
		    			syauqi.nama="SYAUQI RAHMAT SUGARA";
		    			syauqi.nopin="1234";
		    			syauqi.saldo=10000000;
		    		nasabah rian=new nasabah();
		    			rian.norek="002";
		    			rian.nama="RIAN NURYADIN";
		    			rian.nopin="1235";
		    			rian.saldo=9000000;
		    		nasabah ray=new nasabah();
		    			ray.norek="003";
		    			ray.nama="M.RAY NAUFAL";
		    			ray.nopin="1236";
		    			ray.saldo=8000000;
		    		nasabah faisyal=new nasabah();
		    			faisyal.norek="004";
		    			faisyal.nama="FAISYAL NURROCHMAN Z";
		    			faisyal.nopin="1237";
		    			faisyal.saldo=7000000;
		    		nasabah hisam=new nasabah();
		    			hisam.norek="005";
		    			hisam.nama="HISAM F";
		    			hisam.nopin="1238";
		    			hisam.saldo=6000000;
	    	
	    		nsb[0]=syauqi;
	    		nsb[1]=rian;
	    		nsb[2]=ray;
	    		nsb[3]=faisyal;
	    		nsb[4]=hisam;
	            	   try {
	                       FileOutputStream fout = new FileOutputStream("D:\\ATM.dat");
	                       oos = new ObjectOutputStream(fout);
	                       oos.writeObject(nsb);
	                       oos.flush();
	                       oos.close();
	                     
	                   } catch (Exception e) {
	                       System.out.println("error : "+e.getMessage());
	                   }
	            }else{
	            	
	            
	            	int i=0;
	            	for (nasabah nasabah2 : nasabahs) {
						nsb[i]=nasabah2;
						i++;
					}
	            	
	            	for (int j = 0; j < nsb.length; j++) {
						System.out.println(nsb[j]);
					}
	            }
	           
	                      
	            ois.close();
			  }else{
				  
				nasabah syauqi=new nasabah();
	    			syauqi.norek="001";
	    			syauqi.nama="SYAUQI RAHMAT SUGARA";
	    			syauqi.nopin="1234";
	    			syauqi.saldo=10000000;
	    		nasabah rian=new nasabah();
	    			rian.norek="002";
	    			rian.nama="RIAN NURYADIN";
	    			rian.nopin="1235";
	    			rian.saldo=9000000;
	    		nasabah ray=new nasabah();
	    			ray.norek="003";
	    			ray.nama="M.RAY NAUFAL";
	    			ray.nopin="1236";
	    			ray.saldo=8000000;
	    		nasabah faisyal=new nasabah();
	    			faisyal.norek="004";
	    			faisyal.nama="FAISYAL NURROCHMAN Z";
	    			faisyal.nopin="1237";
	    			faisyal.saldo=7000000;
	    		nasabah hisam=new nasabah();
	    			hisam.norek="005";
	    			hisam.nama="HISAM F";
	    			hisam.nopin="1238";
	    			hisam.saldo=6000000;
	    	
	    		nsb[0]=syauqi;
	    		nsb[1]=rian;
	    		nsb[2]=ray;
	    		nsb[3]=faisyal;
	    		nsb[4]=hisam;
	            	   try {
	                       FileOutputStream fout = new FileOutputStream("D:\\ATM.dat");
	                      oos = new ObjectOutputStream(fout);
	                       oos.writeObject(nsb);
	                       oos.flush();
	                       oos.close();
	                     
	                   } catch (Exception e) {
	                       System.out.println("error : "+e.getMessage());
	                   }
			  }
			  
	        } catch (Exception e) {
	        	System.out.println("error : "+e.getLocalizedMessage());
	        }
		  
		
	
		System.out.println("  SELAMAT DATANG PELANGGAN SETIA");
		System.out.println("  *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("  SEBELUM MENGGUNAKAN ATM");
		System.out.println("  PERHATIKAN LANGKAH-LANGKAH BERIKUT : ");
		System.out.println("   1. MASUKKAN NOMOR REKENING");
		System.out.println("   2. MASUKKAN NOMOR PIN");
		System.out.println("   3. PASTIKAN TIDAK ADA YANG MENGINTIP");
		System.out.println("   4. KEMUDIAN PILIHLAH TRANSAKSI YANG DIINGINKAN");
		System.out.println("   5. JIKA TRANSAKSI SELESAI, PILIHLAH MENU KELUAR");
		System.out.println("   6. SELESAI");
		objek o=new objek();
		o.program();
	
	}
	
	void program(){
	boolean ketemurek=false;
	while(ketemurek==false){
		System.out.println("\n\n\n\n**************************************************");
		System.out.println("+-+-+-+-+ ATM BANK THE NEW JAMES GOSLING +-+-+-+-+");
		System.out.println("**************************************************\n");
		System.out.println("==================================================");
		System.out.print("--> MASUKKAN NOMOR REKENING : ");
		String rekening=sc.next();
		for(i=0;i<nsb.length;i++){	
			if(rekening.equals(nsb[i].norek)){
				System.out.println("    NOMOR REKENING VALID");
				System.out.println("==================================================");
				loginPIN();	
				ketemurek=true;
				break;
			}
		}
		if(ketemurek==false){
		System.out.println("    NOMOR REKENING TIDAK VALID !");
		System.out.println("==================================================");
		}
	}
	}
	void loginPIN(){
		boolean ketemupin=false;
		while(ketemupin==false){
			System.out.println("\n\n\n\n**************************************************");
			System.out.print("+-+-+-+-+ ATM BANK THE NEW JAMES GOSLING +-+-+-+-+\n");
			System.out.println("**************************************************\n");
			System.out.println("==================================================");
			System.out.print("--> MASUKKAN NOMOR PIN : ");
			String pin=sc.next();
			if(pin.equals(nsb[i].nopin)){
				System.out.println("==================================================");
				System.out.println("\n\n\n\n**************************************************");
				System.out.print("+-+-+-+-+ ATM BANK THE NEW JAMES GOSLING +-+-+-+-+\n");
				System.out.println("**************************************************\n");
				System.out.println("==================================================");
				System.out.println("\tHAI "+nsb[i].nama);
				System.out.println("==================================================");
				System.out.println("NAMA        : "+nsb[i].nama);
				System.out.println("NO REKENING : "+nsb[i].norek);
				loginMENU();
				ketemupin=true;
				break;
			}
			System.out.println("    PIN TIDAK VALID !");
			System.out.println("==================================================\n\n");
			o.program();
			break;
		}
	}
	
	void loginMENU(){
	System.out.print("--> LANJUT KE MENU ?(y/n) : ");
	lanjut=sc.next();
		if(lanjut.equalsIgnoreCase("y")){
			System.out.println("==================================================");
			o.menu();
		}
		else if(lanjut.equalsIgnoreCase("n")){
			masuklagi();
		}
		else{
			System.out.println("    ULANGI LAGI KEYWORD YANG ANDA MASUKKAN SALAH");
			loginMENU();
		}
	}
	
	void menu(){
		System.out.println("\n\n\n\n**************************************************");
		System.out.print("+-+-+-+-+ ATM BANK THE NEW JAMES GOSLING +-+-+-+-+\n");
		System.out.println("**************************************************");
		System.out.println(" ________________________");
		System.out.println("|<<====================>>|");
		System.out.println("| ~~~ ~~ ~ Menu ~ ~~ ~~~ |");
		System.out.println("|<<====================>>|");
		System.out.println("|                        |");
		System.out.println("| --> 1. PENARIKAN       |");
		System.out.println("| --> 2. TRANSFER        |");
		System.out.println("| --> 3. PEMBAYARAN      |");
		System.out.println("| --> 4. SETOR TUNAI     |");
		System.out.println("| --> 5. CEK SALDO       |");
		System.out.println("| --> 6. GANTI PIN       |");
		System.out.println("| --> 7. KELUAR          |");
		System.out.println("|                        |");
		System.out.println("|<<====================>>|");
		System.out.println("|________________________|");
		System.out.println("==================================================");
		pilmenu();
	}
	
	static void pilmenu(){
		String pil;
			System.out.print("--> MASUKKAN PILIHAN MENU : ");
			pil=sc.next();
			System.out.println("==================================================");
			System.out.println("\n\n\n\n**************************************************");
			System.out.println("+-+-+-+-+ ATM BANK THE NEW JAMES GOSLING +-+-+-+-+");
			System.out.println("**************************************************\n");
			if(pil.equals("1")){
				System.out.println("==================================================");
				o.penarikan();
			}
			else if(pil.equals("2")){
				System.out.println("==================================================");
				o.transfer();
			}
			else if(pil.equals("3")){
				System.out.println("==================================================");
				o.pembayaran();
			}
			else if(pil.equals("4")){
				System.out.println("==================================================");
				o.setortunai();
			}
			else if(pil.equals("5")){
				System.out.println("==================================================");
				o.ceksaldo();
			}
			else if(pil.equals("6")){
				System.out.println("==================================================");
				o.ubahpin();
			}
			else if(pil.equals("7")){
				System.out.println("==================================================");
				System.out.println("--> ANDA TELAH KELUAR");
				o.masuklagi();
			}
			else{
				System.out.println("--> PILIHAN SALAH");
				System.out.println("==================================================");
				o.menu();
			}
			
		
	}
	
	void penarikan(){
		System.out.println("\t\t PENARIKAN");
		System.out.println("==================================================");
		System.out.println("--> JUMLAH PENARIKAN\n 1. 50000\n 2. 100000\n 3. 500000\n 4. 1000000\n 5. LAINNYA");
		System.out.print("--> PILIH : ");
		String pil=sc.next();
		if(pil.equals("1")){
			uang=50000;
			if(nsb[i].saldo>(uang+50000)){
				temp=nsb[i].saldo-uang;
				nsb[i].saldo=temp;
				System.out.println("    TRANSAKSI SEJUMLAH Rp 50000 BERHASIL");
				}
			else{
				System.out.println("    SALDO ANDA TIDAK MENCUKUPI");
				}
		}
		else if(pil.equals("2")){
			uang=100000;
			if(nsb[i].saldo>(uang+50000)){
				temp=nsb[i].saldo-uang;
				nsb[i].saldo=temp;
				System.out.println("    TRANSAKSI SEJUMLAH Rp 100000 BERHASIL");
				}
			else{
				System.out.println("    SALDO ANDA TIDAK MENCUKUPI");
				}
		}
		else if(pil.equals("3")){
			uang=500000;
			if(nsb[i].saldo>(uang+50000)){
				temp=nsb[i].saldo-500000;
				nsb[i].saldo=temp;
				System.out.println("    TRANSAKSI SEJUMLAH Rp 500000 BERHASIL");
				}
			else{
				System.out.println("    SALDO ANDA TIDAK MENCUKUPI");
				}
		}
		else if(pil.equals("4")){
			uang=1000000;
			if(nsb[i].saldo>(uang+50000)){
				temp=nsb[i].saldo-uang;
				nsb[i].saldo=temp;
				System.out.println("    TRANSAKSI SEJUMLAH Rp 1000000 BERHASIL");
				}
			else{
				System.out.println("    SALDO ANDA TIDAK MENCUKUPI");
				}
		}
		else if(pil.equals("5")){
			System.out.print("--> MASUKKAN JUMLAH UANG : ");
			uang=sc.nextLong();
			if(nsb[i].saldo>(uang+50000)){
				if(uang % 50000==0){
					temp=nsb[i].saldo-uang;
					nsb[i].saldo=temp;
					System.out.println("    TRANSAKSI SEJUMLAH Rp "+uang+" BERHASIL");
					}
				else{
					System.out.println("    TRANSAKSI GAGAL");
					System.out.println("    PENARIKAN HARUS KELIPATAN Rp 50000");
				}
			}
			else{
				System.out.println("    SALDO ANDA TIDAK MENCUKUPI");
			}
		}
		else{
			System.out.println("    PILIHAN YANG ANDA MASUKKAN SALAH");
		}
		
		System.out.println("==================================================");
		o.menu();
		 try {
             FileOutputStream fout = new FileOutputStream("D:\\ATM.dat");
            oos = new ObjectOutputStream(fout);
             oos.writeObject(nsb);
             oos.flush();
             oos.close();
           
         } catch (Exception e) {
             System.out.println("error : "+e.getMessage());
         }
	}
	
	void transfer(){
		boolean ketemu=false;
		System.out.println("\t\t TRANSFER UANG");
		System.out.println("==================================================");
		System.out.print("--> MASUKKAN JUMLAH UANG : ");
		uang=sc.nextLong();
		if(uang>0){
			if(nsb[i].saldo>(uang+50000)){
				System.out.print("--> MASUKKAN NO REKENING TUJUAN : ");
				String rekening=sc.next();
				for(int j=0;j<nsb.length;j++){
					if(rekening.equals(nsb[j].norek) && nsb[i].norek!=nsb[j].norek){
						System.out.println("--> TRANSFER TUJUAN :");
						System.out.println("    NOMOR REKENING : "+nsb[j].norek);
						System.out.println("    NAMA : "+nsb[j].nama);
						System.out.print("--> LANJUTKAN ? (y/n) : ");
						lanjut=sc.next();
						if(lanjut.equalsIgnoreCase("y")){
							temp=nsb[i].saldo-uang;
							nsb[i].saldo=temp;
							long temp2=nsb[j].saldo+uang;
							nsb[j].saldo=temp2;
							System.out.println("    TRANSAKSI BERHASIL");
						}
						else if(lanjut.equalsIgnoreCase("n")){
							System.out.println("    TRANSAKSI DIBATALKAN");
						}
						else{
							System.out.println("    KEYWORD YANG ANDA MASUKKAN SALAH");
						}
						ketemu=true;
						break;
					}
				}
				if(ketemu==false){
					System.out.println("    NOMOR REKENING TUJUAN TIDAK VALID");
				}
			}
			else{
				System.out.println("    SALDO TIDAK MENCUKUPI");
			}
		}
		else{
			System.out.println("    TRANSAKSI HARUS MELEBIHI Rp 0");
		}
		System.out.println("==================================================");
		o.menu();
		
		 try {
             FileOutputStream fout = new FileOutputStream("D:\\ATM.dat");
            oos = new ObjectOutputStream(fout);
             oos.writeObject(nsb);
             oos.flush();
             oos.close();
           
         } catch (Exception e) {
             System.out.println("error : "+e.getMessage());
         }
	}
	
	void pembayaran(){
		System.out.println("\t\t PEMBAYARAN");
		System.out.println("==================================================");
		System.out.println("--> JENIS PEMBAYARAN\n    1. PEMBAYARAN LISTRIK\n    2. PEMBAYARAN AIR");
		System.out.print("--> PILIH : ");
		String pil=sc.next();
		if(pil.equals("1")){
			System.out.println("--> PEMBAYARAN LISTRIK");
			System.out.print("--> MASUKKAN JUMLAH UANG : ");
			uang=sc.nextLong();
			if(nsb[i].saldo>(uang+50000)){
				if(uang>0){
					temp=nsb[i].saldo-uang;
					nsb[i].saldo=temp;
					System.out.println("    TRANSAKSI SEJUMLAH Rp "+uang+" BERHASIL");
					}
				else{
					System.out.println("    TRANSAKSI HARUS MELEBIHI Rp 0");
				}
			}
			else{
				System.out.println("    SALDO TIDAK MENCUKUPI");
			}
		}
		else if(pil.equals("2")){
			System.out.println("--> PEMBAYARAN AIR");
			System.out.print("--> MASUKKAN JUMLAH UANG : ");
			uang=sc.nextLong();
			if(nsb[i].saldo>(uang+50000)){
				if(uang>0){
					temp=nsb[i].saldo-uang;
					nsb[i].saldo=temp;
					System.out.println("    TRANSAKSI SEJUMLAH Rp "+uang+" BERHASIL");
				}
				else{
					System.out.println("    TRANSAKSI HARUS MELEBIHI Rp 0");
				}
			}
			else{
				System.out.println("    SALDO TIDAK MENCUKUPI");
			}
		}
		else{
			System.out.println("    PILIHAN YANG ANDA MASUKKAN SALAH");
		}
		System.out.println("==================================================");
		o.menu();
		
		 try {
             FileOutputStream fout = new FileOutputStream("D:\\ATM.dat");
            oos = new ObjectOutputStream(fout);
             oos.writeObject(nsb);
             oos.flush();
             oos.close();
           
         } catch (Exception e) {
             System.out.println("error : "+e.getMessage());
         }
	}
	
	void setortunai(){
		System.out.println("\t\t SETOR TUNAI");
		System.out.println("==================================================");
		System.out.print("--> MASUKKAN JUMLAH UANG : ");
		uang=sc.nextInt();
		if(uang>0 && uang % 50000==0){
			temp=nsb[i].saldo+uang;
			nsb[i].saldo=temp;
			System.out.println("    TRANSAKSI SEJUMLAH Rp "+uang+" BERHASIL");
		}
		else{
			System.out.println("    TRANSAKSI HARUS KELIPATAN Rp 50000");
		}
		System.out.println("==================================================");
		o.menu();
		
		 try {
             FileOutputStream fout = new FileOutputStream("D:\\ATM.dat");
            oos = new ObjectOutputStream(fout);
             oos.writeObject(nsb);
             oos.flush();
             oos.close();
           
         } catch (Exception e) {
             System.out.println("error : "+e.getMessage());
         }
	}
	
	void ceksaldo(){
		System.out.println("\t\t CEK SALDO");
		System.out.println("==================================================");
		System.out.println("--> JUMLAH SALDO ANDA : "+nsb[i].saldo); 
		System.out.println("==================================================");
		o.menu();
		
		 try {
             FileOutputStream fout = new FileOutputStream("D:\\ATM.dat");
            oos = new ObjectOutputStream(fout);
             oos.writeObject(nsb);
             oos.flush();
             oos.close();
           
         } catch (Exception e) {
             System.out.println("error : "+e.getMessage());
         }
	}
	
	void ubahpin(){
		System.out.println("\t\t GANTI PIN");
		System.out.println("==================================================");
		System.out.print("--> MASUKKAN PIN AWAL : ");
		String pin=sc.next();
		if(pin.equals(nsb[i].nopin)){
			System.out.print("--> MASUKKAN PIN BARU : ");
			String pinbaru=sc.next();
			nsb[i].nopin=pinbaru;
			System.out.println("--> PIN BERHASIL DIGANTI"); 
		}
		else{
			System.out.println("    PIN TIDAK VALID");
		}
		System.out.println("==================================================");
		o.menu();
		
		 try {
             FileOutputStream fout = new FileOutputStream("D:\\ATM.dat");
            oos = new ObjectOutputStream(fout);
             oos.writeObject(nsb);
             oos.flush();
             oos.close();
           
         } catch (Exception e) {
             System.out.println("error : "+e.getMessage());
         }
	}
	
	void masuklagi(){
		System.out.print("--> APAKAH ANDA INGIN MASUK LAGI ? (y/n) : ");
		lanjut=sc.next();
		if(lanjut.equalsIgnoreCase("y")){
			System.out.println("==================================================");
			o.program();
		}
		else if(lanjut.equalsIgnoreCase("n")){
			System.out.println("==================================================");
			System.out.println("\n\n\n\n**************************************************");
			System.out.println("+-+-+-+-+ ATM BANK THE NEW JAMES GOSLING +-+-+-+-+");
			System.out.println("**************************************************\n");
			System.out.println("                   TERIMA KASIH                   ");
			System.out.println("==================================================");
		}
		else{
			System.out.println("    ULANGI KEYWORD YANG ANDA MASUKKAN SALAH");
			masuklagi();
		}
	}
	
}