/*Casting menggunakan tipe data primitif*/
public class Casting1 {
	/*Menunjukkan kelas yang di pake adalah umum*/
	public static void main(String[] args) {
	// langsung memasukkan angka atau bilangan dan menampilkannya
		int a=5,b=6;
		float d=2.f,e=3.2f;
		char g='5';
		double k=3.14;
		/* merupakan tipe data setiap variable yang ada */
		System.out.println((float)a); // int <-- float (pembacaan tipe data int ke float)
		System.out.println((double)b); // int <-- double (pembacaan tipe data int ke double)
		System.out.println((int)d); // float <-- int (pembacaan tipe data float ke int )
		System.out.println((double)e); // float <-- double (pembacaan tipe data float ke double)
		System.out.println((int)g); // char <-- int (ASCII) (pembacaan tipe data char ke int)
		System.out.println((float)g); // char <-- float (ASCII) (pembacaan tipe data char ke float)
		System.out.println((double)g); // char <-- double (ASCII) (pembacaan tipe data char ke double)
		System.out.println((int)k); // double <-- int (pembacaan tipe data double ke int) 
		System.out.println((float)k); // double <-- float (pembacaan tipe data double ke float)
	}
}