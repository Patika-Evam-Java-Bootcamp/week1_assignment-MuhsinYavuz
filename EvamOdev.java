package com.mycompany.evamodev;
import java.util.Scanner;
public class EvamOdev {
 static String str = "code" ;
    public static void main(String[] args) {
     // 1.soruda s1 s2 s3 diye 3 degisken tanimlanmis . String degerinde s1 olustugunda bir obje olusur . s2 , s3 hatta daha fazla 
// degisken tanimlansa dahi 1 objede kalir . Eger new kelimesiyle olusturursak o zaman baska alanda yer acar . 
    String s1 = "Welcome";  
    String s2 = "Welcome";  
    String s3 = "Welcome";      
     //ikinci kısım : 
        Scanner scanner = new Scanner(System.in) ; // Scanner sisteme tanıtıldı.
        String inputStr ; //Kullanıcıdan alıcanak String tanımlandı.
        int size = 5; // Olusturulacak olan dizi boyutu verildi.       
        try {      
        String[] strs  = new String[size]; // Methot içine girecek olan dizi oluşturuldu.
            System.out.println("Diziye 5 elaman ekleyiniz.");     
        for(int i = 0 ; i<size ; i++){       
            System.out.println((i+1) + ". degeri giriniz ");
             inputStr = scanner.nextLine() ;      
            strs[i] = inputStr  ;
        }//dongü ile tüm elemanlara girilen değerler eklendi. Dizi boyutu kadar eleman eklenecek.                                  
        System.out.println(Contents(strs)); // Methot içinde dödürülen değeri ekrana yazıcak.
        }
        catch(Exception e ){
            System.out.println(e.getLocalizedMessage()); // HATA olursa hata mesajı bize vericek.
        }  }        
  // String donduren ve içerisinde String[] dizisi alan bir methot olusturuldu. 
    public static String Contents (String[] strs ){
     
        String temp = "";  // Eğer verilen stringi 'code' içeriyorsa a ya eklenerek içerilen değeri vericek . 
        for(int i = 0 ; i < strs.length ; i++){
            if(strs[i].contains(str)){ // contains ile değeri içerip içermediğine bakıyoruz.
                if(!temp.equals("")){
                   temp = temp + "**"+ strs[i] ; //Eğer birden fazla içeriyorsa a ya eklenerek devam eder.
                }else{
                    temp =  strs[i] ; 
                }              
            }  }                       
         return str + " içeren dizi elemanı : " + temp ; // İçerilen değeri döndürüyor       
    }}
