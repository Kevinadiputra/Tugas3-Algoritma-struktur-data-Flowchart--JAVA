import java.util.*;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Tugas_3_Algoritma_struktur_data{
	public static void main(String[] args) {
		// 1. Buatlah algoritma / flowchart yang membaca sebuah bilangan bulat positif lalu 
		// menentukan apakah bilangan tersebut merupakan kelipatan 4.

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
		} 
	}*/

		// 2. Pasar swalayan X memberikan diskon harga bagi pembeli yang nilai total belanjanya 
		// lebih dari RP100.000. Tulislah algoritma / flowchart untuk menentukan nilai belanja 
		// setelah dikurangi diskon. Data masukan adalah nilai total belanja pembeli, sedangkan 
		// keluarannya adalah diskon harga dan nilai belanja setelah dikurangi diskon. 

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
			Diskon = 0.1 *n_tot_belanja; 
			System.out.println("Diskon:Rp " + Diskon);
			n_belanja_diskon = n_tot_belanja - Diskon;
			System.out.println("Harga Setelah Diskon:Rp " + n_belanja_diskon);
		}else {
			System.out.println("Harga Total Belanja:Rp "+n_tot_belanja);
		} 
	}*/

		// 3. Tulislah algoritma / flowchart yang membaca tiga buah bilangan bulat, lalu 
		// mengurutkan tiga buah bilangan tersebut dari nilai yang kecil ke nilai yang besar. 
		// Keluaran adalah tiga buah bilangan yang terurut.

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
		}
	}*/

		// 4. Tulislah algoritma / flowchart yang membaca panjang (interger) tiga buah sisi 
		// sebuah segitiga a, b, dan c, yang dalam hal ini a < b < c, lalu menentukan apakah ketiga 
		// sisi tersebut membentuk segitiga siku-siku, segitiga lancip, atau segitiga tumpul 
		// (petunjuk: gunakan hukum phytagoras).

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
		} 
	}*/

		// 5. Tulislah algoritma / flowchart yang membaca sebuah karakter digit ('0'..'9') lalu
		// mengonversinya menjadi nilai integer (0..9). Misalnya, jika dibaca
		// karakter '5', maka nilai konversinya ke integer adalah 5. Buatlah masing-masing algoritma / flowchart untuk dua keadaan berikut:
		// (a) karakter digit yang dibaca diasumsikan sudah benar terletak dalam
		// rentang '0'..'9'
		// (b) karakter yang dibaca mungkin bukan digit '0'..9'. Jika karakter yang
		// dibaca bukan karakter digit, maka hasil konversinya diasumsikan bernilai —1.

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
		}
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
		}
	}*/


		// 6. Jika kita berbelanja di pasar swalayan/supermarket, nilai total belanja kita seringkali bukan kelipatan pecahan rupiah yang berlaku. Misalnya,
		// nilai total belanja adalah Rp19.212,-. Andaikan saat ini pecahan rupiah
		// yang berlaku paling kecil Rp25,-. Selain itu, juga ada pecahan Rp50,-
		// dan Rp100,-. Umumnya kasir pasar swalayan membulatkan nilai belanja
		// ke pecahan yang terbesar. Jadi Rp19.212,- dibulatkan menjadi
		// Rp19.225,-. Hal ini jelas merugikan konsumen. Misalkan Anda memiliki
		// pasar swalayan yang jujur dan tidak merugikan pembeli, sehingga jika
		// ada nilai belanja yang bukan kelipatan pecahan yang ada, maka nilai
		// belanja itu dibulatkan ke pecahan terendah. Jadi, Rp19.212,- dibulatkan
		// menjadi Rp19.200. Tulislah algoritma / flowchart yang membaca nilai belanja
		// (integer) lalu membulatkannya ke nilai uang dengan pecahan terendah.

		/*
		System.out.println("Nomor 6.)");
		// input belanja
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan nilai_belanja: " );
		double n_belanja = input.next();

		double sisa = n_belanja%25;

		double nilai = n_belanja - sisa;

		System.out.println("Hasil dari pembulatan terkecil: "+ nilai);
	}*/


		// 7. (a) Tulislah algoritma / flowchart yang membaca bilangan bulat positif dalam 
		// rentan 1 sampai 10, lalu mengonversinya ke dalam angka romawi.
		// (b) Kembangkan algoritma / flowchart (a) diatas sehingga dapat mengonversi bilangan 
		// ulat posititf sembarang ke dalam angka romawinya.

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
		} 
	}*/

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

		return hasil.toString();
	}*/	
	

		// 8. Dalam bidang pengolahan  citra (image processing), elemen gambar terkecil disebut 
		// pixel (picture element). Nilai pixel untuk gambar 256 warna adalah dari 0 sampai 255. 
		// Operasi - operasi terhadap pixel seringkali berada diluar rentang nilai ini. Jika ini 
		// kasusnya, maka nilai hasil operasi harus dipotong (clipping) sehingga tetap berada di 
		// alam interval [0..25]. Jika nilai hasil operasi lebih besar dari 255, maka nilai tersebut 
		// dipotong menjadi 255, dan bila negatif maka dipotong menjadi 0. Dibaca sebuah nilai hasil 
		// operasi pengolahan citra, buatlah algoritma / flowchart untuk melakukan clipping tersebut.

		
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
		}
	}*/ 

	// 9. Tinjau kembali soal latihan Bab 6 nomor 6 untuk menentukan berat badan ideal. 
	// Dibaca berat badan dan tinggi badan seseorang. Tulislah pesan "ideal" jika berat badan 
	// orang tersebut hanya berselisih +- 2 kg dari berat badan ideal, atau pesan "tidak ideal" 
	// jika tidak berselisih +- 2 kg dari berat badan ideal. Tulislah algoritma / flowchartnya.

	/*
	System.out.println("Nomor 9.)");
		// input nilai yang ingin diclip
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan berat badan anda: " );
		double berat = input.nextDouble();

		System.out.println("Masukan tinggi badan anda: " );
		double tinggi = input.nextDouble();

		double berat_ideal =(tinggi-100)-((tinggi-100)*0.1);
		double toleransi = 2;

		if(berat >= berat_ideal -toleransi && berat<=berat_ideal +toleransi){
			System.out.println("Berat badan anda ideal !!");
		}else {
			System.out.println("Berat badan Anda tidak ideal.");
		}
	}*/	

		// 10. Dibaca dua buah hari, hari pertama dan hari kedua. Tulislah algortima untuk 
		// menghitung durasi (selisih) kedua hari tersebut. Misalnya, hari pertama kamis dan hari 
		// kedua Senin, maka dari Kamis ke Senin durasinya 5 hari.

		/*
		System.out.println("Nomor 10.)");
		// input nilai yang ingin diclip
		Scanner input = new Scanner(System.in);

		System.out.println("Masukan Hari pertama: " );
		String n_hari_1 = input.nextLine();

		System.out.println("Masukan Hari kedua: " );
		String n_hari_2 = input.nextLine();

		int hari_1 = k_harikeangka(n_hari_1);
		int hari_2 = k_harikeangka(n_hari_2);

		if (hari_1 !=-1 && hari_2!=-1) {
			int durasi = h_durasi(hari_1,hari_2);
			System.out.println("Durasi hari antara hari pertama dan kedua adalah: " + durasi+"hari");
		}else{
			System.out.println("Hari yang anda masukkan tidak valid");
		}
	}

	public static int k_harikeangka(String namaHari){
		switch (namaHari.toLowerCase()){
		case "minggu":
			return 0;
		case "senin":
			return 1;
		case "selasa":
			return 2;
		case "rabu":
			return 3;
		case "kamis":
			return 4;
		case "jumat":
			return 5;
		case "sabtu":
			return 6;
		default:
			return -1;							
		}
	}

	public static int h_durasi(int hari_1, int hari_2){
		int durasi = (hari_2-hari_1 +7)%7;
		return durasi;
	}

	// 11. (Versi lebih kompleks dari soal latihan nomor 3 Bab 6) Dibaca dua buah tanggal 
	// (dd-mm-yy). Tulislah algoritma / flowchart untuk menghitung durasi hari antara kedua 
	// tanggal tersebut. Sebagai contoh, tanggal 20-1-2015 dan 2-2-2015 durasinya 13 hari. Di 
	// dalam  algoritma / flowchart ini, anda harus memperhatikan tahun kabisat dab jumlah hari 
	// yang berbeda pada setiap bulan.

	/*
		System.out.println("Nomor 11.)");
		// input nilai yang ingin diclip
		Scanner input = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		System.out.println("Masukan tanggal pertama(dd-MM-yyyy): " );
		String tanggal_1_Str = input.nextLine();
		LocalDate tanggal_1 = LocalDate.parse(tanggal_1_Str, formatter);

		System.out.println("Masukan tanggal kedua (dd-MM-yyyy): " );
		String tanggal_2_Str = input.nextLine();
		LocalDate tanggal_2 = LocalDate.parse(tanggal_2_Str, formatter);

		Period durasi = hitungDurasiTanggal(tanggal_1, tanggal_2);

		int tahun = durasi.getYears();
		int bulan = durasi.getMonths();
		int hari = durasi.getDays();

		System.out.println("Durasi antara Kedua tanggal tersebut adalah: ");
		System.out.println(tahun+" tahun "+bulan+" bulan, dan "+hari+" hari");
	}

	public static Period hitungDurasiTanggal(LocalDate tanggal_1,LocalDate tanggal_2){
		return Period.between(tanggal_1,tanggal_2);
	}*/

	// 12. Tulislah algoritma / flowchart yang membaca umur seseorang, lalu menentukan apakah
	// umur termasuk kategori balita (0-5), anak - anak (5-12), remaja (12-20), dewasa (20-60), 
	// atau tua (60 keatas).

	
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
		}
	}*/


		// 13. Di sebuah maskapai penerbangan, anak - anak yang berumur 12 tahun ke bawah 
		// mendapat diskon tiket sebesar 25%. Di baca kota keberangkatan, kota tujuan, nama 
		// penumpang, tanggal lahir, dan tanggal keberangkatan. Harga tiket normal adalah x 
		// rupiah. Tentukan berapa harga tiket pesawat yang harus dibayar dengan memperhatikan 
		// diskon jika calon penumpang berumur dibawah 12 tahun (dihitung berdasarkan tanggal 
		// lahir dan tanggal keberangkatan)

		/*
		System.out.println("Nomor 13.)");
		// input 
		Scanner input = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		System.out.println("Masukan Kota Keberangkatan: " );
		String k_keberangkatan = input.nextLine();

		System.out.println("Masukan kota tujuan: " );
		String k_tujuan = input.nextLine();

		System.out.println("Masukan Nama penumpang: " );
		String n_penumpang = input.nextLine();

		System.out.println("Masukan tanggal lahir penumpang(dd-MM-yyyy): " );
		String tanggal_lhr_Str = input.nextLine();
		LocalDate tanggal_lhr = LocalDate.parse(tanggal_lhr_Str, formatter);

		System.out.println("Masukan tanggal keberangkatan(dd-MM-yyyy): " );
		String tanggal_kgn_Str = input.nextLine();
		LocalDate tanggal_kgn = LocalDate.parse(tanggal_kgn_Str, formatter);

		System.out.println("Masukan Harga tiket normal(dalam Rp): " );
		double h_t_normal = input.nextDouble();

		double h_t_diskon = hitungHargaTiket(h_t_normal,tanggal_lhr,tanggal_kgn);

		System.out.println("Harga tiket pesawat untuk "+ n_penumpang + " dari " + k_keberangkatan + " ke " + k_tujuan + " adalah: "+ h_t_diskon + " Rupiah.");

	}
	// Perhitungan harga tiket
	public static double hitungHargaTiket(double h_t_normal,LocalDate tanggal_lhr, LocalDate tanggal_kgn){
		int umur = hitungUmur(tanggal_lhr,tanggal_kgn);
		if(umur <=12){
			return h_t_normal*0.75;
		}else{
			return h_t_normal;
		}
	}
	// Hitung umur
	public static int hitungUmur(LocalDate tanggal_lhr,LocalDate tanggal_kgn){
		Period selisih = Period.between(tanggal_lhr,tanggal_kgn);
		return selisih.getYears();
	}*/	
}

