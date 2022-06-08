
// 1.soruda s1 s2 s3 diye 3 degisken tanimlanmis . String degerinde s1 olustugunda bir obje olusur . s2 , s3 hatta daha fazla 
// degisken tanimlansa dahi 1 objede kalir . Eger new kelimesiyle olusturursak o zaman baska alanda yer acar . 

package com.mycompany.evamodev;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class EvamOdev {
 static String str = "code" ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String inputStr ;
        int size = 5;
           
        
        
        try {
      
       
        String[] strs  = new String[size];
            System.out.println("Diziye 5 elaman ekleyiniz.");
        
        for(int i = 0 ; i<size ; i++){
            
            System.out.println((i+1) + ". degeri giriniz ");
             inputStr = scanner.nextLine() ;
           
            strs[i] = inputStr  ;
        }
            
            
            
        
        System.out.println(Contents(strs));
        Contents(strs);
       
        }
        catch(Exception e ){
            System.out.println(e.getLocalizedMessage());
        }
        
   
    
    }

 
    public static String Contents (String[] strs ){
        String a = ""; 
        for(int i = 0 ; i < strs.length ; i++){
            if(strs[i].contains(str)){
                if(!a.equals("")){
                   a = a + "**"+ strs[i] ; 
                }else{
                    a =  strs[i] ; 
                }
                
            }
           
          
        }
        
         return str + " içeren dizi elemanı : " + a ; 
        
    }
}
