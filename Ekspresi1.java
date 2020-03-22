public class Ekspresi1 { 
 
	public static void main(String[] args) {   
		int x = 1; 
		int y = 2; 
		float fx; 
		float fy; 
 		//merupakan deksripsi tipe data dan pemberian nilai setiap tipe data
		System.out.print ("x/y (format integer) = "+ x/y);
		//menampilkan hasil pembagian dari nilai x dan y dalam tipe data integer namun masih menampilkan nilai yang int x/y   
		System.out.print ("\nx/y (format float) = "+ x/y);
		//menampilkan hasil pembagian dari nilai x dan y dalam tipe data float namun masih menampilkan nilai yang int x/y    
		fx=x;   
		fy=y; 
 
 		System.out.print ("\nx/y (format integer) = "+ fx/fy);    
		System.out.print ("\nx/y (format float)   = "+ fx/fy);
		//menampilkan hasil pembagian dari nilai x dan y dalam tipe data int dan float namun sudah berubah nilai yang float x/y   
 
 		System.out.print ("\nfloat(x)/float(y) (format integer) = "+ (float)x/(float)y);    
		System.out.print ("\nfloat(x)/float(y) (format float)   = "+ (float)x/(float)y);
		//menampilkan hasil pembagian dari nilai x dan y dalam tipe data int dan float namun sudah berubah nilai yang float x/y 
 		x = 10; 
		y = 3; 
 
		System.out.print ("\nx/y (format integer) = "+ x/y);    
		System.out.print ("\nx/y (format float)   = "+ x/y);
		//menampilkan hasil pembagian dari nilai x dan y dalam tipe data int dan float namun sudah berubah nilai x=10 dan y=3    
	} 
 
} 
