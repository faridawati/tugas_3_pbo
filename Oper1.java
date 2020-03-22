public class Oper1 { 
	public static void main(String[] args) {   
		int n = 10; /* 10 */ 
		int x = 1; 
		int y = 2;  
		//merupakan tipe data yang diberi nilai pada variabelnya
 
  		System.out.println ("n = "+ n); 
 		//menampilkan nilai n
  		System.out.println ("x = "+ x); 
 		//menampilkan nilai x
  		System.out.println ("y = "+ y); 
 		//menampilkan nilai y
  		System.out.println ("n & 8 = "+ (n & 8)); 
 		//menampilkan nilai dari logika and(&) diantara salah satu nilai yang di ambil
  		System.out.println ("x & ~ 8 = "+ (x & ~8)); 
 		//menampilkan nilai dari logika negasi(~) diantara salah satu nilai dan nilai yang bukan 8 yang di ambil yang x=1
  		System.out.println ("y << 2 = "+ (y << 2));  
 		//menampilkan nilai dari logika penggeseran bit ke kiri(<<) sebanyak 2 kali penggeseran
  		System.out.println ("y >> 3 = "+ (y >>3)); 
 		//menampilkan nilai dari logika penggeseran bit ke kanan(>>) sebanyak 3 kali penggeseran
	} 
}