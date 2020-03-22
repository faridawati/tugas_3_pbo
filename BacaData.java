import java.util.Scanner;
/* menunjukkan program dapat menginput*/
public class BacaData {

	public static void main(String[] args) {
	// menunjukkan tipe data yang ada pada nilai a
	int a;
	Scanner masukan;	/* merupakan perintah untuk penginputan data */
	System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");	//menampilkan data
	masukan = new Scanner(System.in);
	//sebuah perintah agar penginputan terbaca
	a = masukan.nextInt(); 
	/* coba ketik : masukan.nextInt(); ; Apa akibatnya ?*/
	System.out.print ("Nilai yang dibaca : "+ a);
	}
}