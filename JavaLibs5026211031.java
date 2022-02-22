import java.util.Scanner;

public class JavaLibs5026211031 {
    
public static void main(String[] args) {
        
Scanner input = new Scanner(System.in);

System.out.print("Masukkan nama anda : ");
String nama = input.next();
System.out.print("Masukkan nama pacar impian : ");
String pacar = input.next();
System.out.print("Masukkan umur anda : ");
int umur = input.nextInt();
System.out.print("Masukkan umur pacar impian anda : ");
int umurp = input.nextInt();
System.out.print("Uang kencan anda ($) : ");
double uang = input.nextDouble();
System.out.print("Uang kencan pacar impian ($) : ");
double uangp = input.nextDouble();
double jumlahUang = uang + uangp;
System.out.print("Di mana tempat kencan anda ? ");
String tempat = input.next(); 
System.out.print("Apa yang akan anda berikan untuk pacar impian ? ");
String hadiah = input.next();
System.out.print("Berapa Jumlahnya ? ");
int jhadiah = input.nextInt();
System.out.print("Apa yang akan pacar impian anda berikan kepada anda ? ");
String hadiahp = input.next();       
System.out.print("Berapa Jumlahnya ? ");
int jhadiahp = input.nextInt();       
int total = jhadiah + jhadiahp; 
System.out.print("\n");
System.out.print("\n");
System.out.println("Ini adalah kisahku");
System.out.print("\n");        
System.out.print("Hari ini adalah hari valentine. ");
System.out.print("Namaku " + nama +". " );
System.out.print("Aku mempunyai seorang pacar yang bernama " + pacar +". ");
System.out.print("Ia merupakan seseorang yang telah aku impikan. ");
System.out.print("Aku berusia " + umur +" tahun, dan pacarku berusia " + umurp +" tahun. ");
System.out.print("Saat ini kami berada di " + tempat+". ");
System.out.print("Uang yang kami bawa hanya berjumlah $" + jumlahUang+". ");
System.out.print("Meskipun hal ini terlihat sederhana, namun kami merasa bahagia. ");
System.out.print("Kami membeli " + total +" benda yang kami anggap spesial untuk kami berikan satu sama lain. ");
System.out.print("Aku membeli " + hadiah+", dan pacarku membeli " + hadiahp+". ");
System.out.print("\n");
System.out.print("\n");
System.out.println("Sekian kisah dariku");
System.out.println("Aku berharap dapat bertemu dengannya");       
    
}    
}
