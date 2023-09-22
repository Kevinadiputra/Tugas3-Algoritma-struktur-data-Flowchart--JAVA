import java.util.*;

public class Kevin_09011282328115_SK1A_03{
	public static void main(String[] args) {
		// No. 1
		/*
		System.out.println("Nomor 1.)");
		// input bilangan
		Scanner inputbilangan = new Scanner(System.in);
		System.out.println("Masukkan bilangan: ");

		int Bilangan = inputbilangan.nextInt();
		System.out.println("bilangan: " + Bilangan);

		// kondisi pertama
		if (Bilangan >0){
			System.out.println("Bilangan positif");
			// kondisi kedua
			if(Bilangan%4==0){
				System.out.println("Bilangan kelipatan 4");
			}else{
				System.out.println("Bukan kelipatan 4");
			}
		}else {
			System.out.println("Bukan Bilangan positif");
		} */

		// No. 2

		/*
		System.out.println("Nomor 2.)");
		// input total belanja
		Scanner inputtot_belanja = new Scanner(System.in);
		System.out.println("Masukkan total belanja:Rp  ");

		double n_tot_belanja = inputtot_belanja.nextDouble();
		System.out.println("Total Belanja:Rp " + n_tot_belanja);

		double Diskon = 0;
		double n_belanja_diskon=0;

		if(n_tot_belanja>100000){
			Diskon = 10.1*n_tot_belanja; 
			System.out.println("Diskon:Rp " + Diskon);
			n_belanja_diskon = n_tot_belanja - Diskon;
			System.out.println("Harga Setelah Diskon:Rp " + n_belanja_diskon);
		}else {
			System.out.println("Harga Total Belanja:Rp "+n_tot_belanja);
		} */

		// No. 3

		/*
		System.out.println("Nomor 3.)");
		// input bilangan a,b,c
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan nilai a: ");
		int a = input.nextInt();

		System.out.println("Masukan nilai b: ");
		int b = input.nextInt();

		System.out.println("Masukan nilai c: ");
		int c = input.nextInt();
		

		// kondisi 1
		if(a <= b && a<=c){
			if(b<=c){
				System.out.println(a +","+ b +","+ c);
			}else{
				System.out.println(a +","+ c +","+ b);
			}
		}else if (b<=a && b<=c){
			if(a<=c){
				System.out.println(b +","+ a +","+ c);
			}else{
				System.out.println(b +","+ c +","+ a);
			}
		}else{
			if(a<=b){
				System.out.println(c +","+ a +","+ b);
			}else{
				System.out.println(c +","+ b +","+ a);
			}
		}*/

		// No. 4

		/*
		System.out.println("Nomor 4.)");
		// input sisi 
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan sisi a: ");
		int a = input.nextInt();

		System.out.println("Masukan sisi b: ");
		int b = input.nextInt();

		System.out.println("Masukan sisi c: ");
		int c = input.nextInt();

		double s_ab = (Math.pow(b,2)) + (Math.pow(b,2));

		if(s_ab< (Math.pow(c,2))){
			System.out.println("Segitiga tumpul");
		}else if(s_ab>(Math.pow(c,2))){
			System.out.println("Segitiga lancip");
		}else if (s_ab ==(Math.pow(c,2))){
			System.out.println("Segitiga siku-siku");
		} */

		// No. 5 

		/*
		System.out.println("Nomor 5.A)");
		// input char
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan char: " );
		int chr = input.nextInt();

		int nilai;

		if ( chr == 0){
			nilai = 0;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 1){
			nilai = 1;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 2){
			nilai = 2;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 3){
			nilai = 3;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 4){
			nilai = 4;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 5){
			nilai = 5;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 6){
			nilai = 6;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 7){
			nilai = 7;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 8){
			nilai = 8;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 9){
			nilai = 9;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else{
			System.out.println("Diluar rentang '1'-'9'");
		}*/

		/*
		System.out.println("Nomor 5.B)");
		// input char
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan char: " );
		int chr = input.nextInt();

		int nilai;

		if ( chr == '0'){
			nilai = 0;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 1){
			nilai = 1;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 2){
			nilai = 2;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 3){
			nilai = 3;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 4){
			nilai = 4;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 5){
			nilai = 5;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 6){
			nilai = 6;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 7){
			nilai = 7;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 8){
			nilai = 8;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else if ( chr == 9){
			nilai = 9;
			System.out.println("Nilai dari digit '"+chr+"' adalah: " + nilai);
		}else{
			System.out.println("Bukan nilai Digit");
		}*/

		// No 6

		/*
		System.out.println("Nomor 6.)");
		// input belanja
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan nilai_belanja: " );
		double n_belanja = input.nextDouble();

		double sisa = n_belanja%25;

		double nilai = n_belanja - sisa;

		System.out.println("Hasil dari pembulatan terkecil: "+ nilai);*/

		// No. 7

		/*
		System.out.println("Nomor 7.A)");
		// input bilangan
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan Bilangan: " );
		int blg = input.nextInt();

		if( blg>=1 && blg <= 10){
			String[] romawi = {"I","II","III",
								"IV","V","VI",
								"VII","VIII","IX",
								"X"};
			String a_romawi = romawi[blg - 1];
			System.out.println("Hasil :"+ a_romawi );					
		}else {
			System.out.println("Bilangan tidak dalam rentang yang valid (1-10)");
		} */

		/*
		System.out.println("Nomor 7.B)");
		// input bilangan
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan Bilangan: " );
		int blg = input.nextInt();

		if (blg >= 1){
			String a_romawi = k_roman(blg);
			System.out.println("Angka romawi: " + a_romawi);
		}else{
			System.out.println("Bilangan harus lebih dari 0!!");
		}
	}

	public static String k_roman(int num){
		int[] nilai = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] romawi = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

		StringBuilder hasil = new StringBuilder();

		int indeks =0;
		while(num > 0){
			int x = num /nilai[indeks];
			for (int i =0; i < x; i++){
				hasil.append(romawi[indeks]);
				num -= nilai[indeks];
			}
			indeks++;
		}

		return hasil.toString();*/

		// No. 8

		/*
		System.out.println("Nomor 8.)");
		// input nilai yang ingin diclip
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan Nilai hasil operasi: " );
		int h_operasi = input.nextInt();

		int h_clip = clip_v(h_operasi);

		System.out.println("Hasil Operasi: " + h_operasi);
		System.out.println("Hasil clipping: "+h_clip);
	}

	public static int clip_v(int nilai){
		if(nilai<0){
			return 0;
		}else if(nilai>255){
			return 255;
		}else{
			return nilai;
		}*/
	

	// No.9

	// gagal, karena penggunaan rumus penghitungan berat yang salah, selain itu pada bagian decision 
	// juga terdapat kesalahan yaitu penggunaan perbandingan yang tidak tepat. sehingga 
	// fungsinya tidak berjalan 

	// No.10

	// Gagal, fungsi eror


	// No. 11
	// gagal, fungsi tidak berjalan semestinya.

	// No. 12

	/*
	System.out.println("Nomor 12.)");
		// input nilai yang ingin diclip
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan umur anda: " );
		int umur = input.nextInt();

		if(0<umur&&umur<=5){
			System.out.println("Anda masih Balita");
		}else if(6<=umur&&umur<=12){
			System.out.println("Anda masih Anak-anak");
		}else if(13<=umur&&umur<=20){
			System.out.println("Anda sudah Remaja");
		}else if(21<=umur&&umur<=60){
			System.out.println("Anda sudah Dewasa");
		}else {
			System.out.println("Anda sudah Tua");
		}*/

		// No.13

		// Gagal, karena Fungsi yang tidak berjalan semestinya
	}
}