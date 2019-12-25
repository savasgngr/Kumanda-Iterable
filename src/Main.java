
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("kumanda programına hoşgeldiniz...");
        
        Scanner scanner=new Scanner(System.in);
        
        
        String islemler="1 kanalları göster\n"+"2 kanal ekle\n"+"3 kanal sil\n"+"4 kanal sayısı\n"+"çıkış için q ya basın";
        Kumanda kumanda =new Kumanda();
        
        while (true) { 
            
            System.out.println("İşlem seçiniz...");
            
            System.out.println(islemler);
            String secim= scanner.nextLine();
            
            if (secim.equals("q")) {
                System.out.println("sistemden çıkılıyor...");
                break;
                
            }else if (secim.equals("1")) {
             
                kanallariGoster(kumanda);
 
            }
            else if (secim.equals("2")) {
                System.out.print("eklenecek kanal:");
                String kanal=scanner.nextLine();
                kumanda.kanalEkle(kanal);
                
            }
            else if (secim.equals("3")) {
                
                System.out.print("silinecek kanal:");
                
                String kanalSil=scanner.nextLine();
                
                kumanda.kanalSil(kanalSil);
                
                
            }else if (secim.equals("4")) {
                
                System.out.println("kanal sayısı:"+kumanda.kanalSayısı() );
                
                
            }else{
                
                System.out.println("geçersiz işlem..");
            }
            
            
            
        }
        
    }
    
    public static void kanallariGoster(Kumanda kumanda){
        
        if (kumanda.kanalSayısı()==0) {
            
            System.out.println("şu anda kanalınız bulunmuyor");
        }else{
            
            for (String string : kumanda) {
                
                System.out.println(string);
            }
        }
        
    }
    
}
