public class Oper3 { 
	public static void main(String[] args) {      
		if (true && true){ System.out.println(true && true); }
		//menampilkan nilai dari logika and(&) diantara semua nilai yang di ambil harus bernilai benar 
		if (true & true) { System.out.println(true & false); }
		/*menampilkan nilai dari logika and(&) diantara semua nilai yang di ambil harus bernilai benar 
		jika salah satu bernilai salah maka akan salah*/    
		if (true)   { System.out.println(true); } 
		if (true || true){ System.out.println(true); }
		if (true|false)  { System.out.println(true|false); }
		/*menampilkan nilai dari logika or(|) diantara salah satu nilai yang di ambil harus bernilai benar 
		jika salah satu bernilai salah maka akan juga akan benar*/     
 
	} 
 
} 
 
