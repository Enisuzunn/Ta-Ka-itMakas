
package taşkağıtmakas;

import java.util.Scanner;

public class TaşKağıtMakas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kul_puan = 0;
        int bil_puan = 0;
        System.out.println("TAŞ KAĞIT MAKAS OYUNUNA HOŞGELDİNİZ...");
        String islemler = "1. Taş\n"
                          +"2. Kağıt\n"
                          +"3. Makas";
        System.out.println("****************************");
        System.out.println(islemler);
        System.out.println("****************************");
        while (true) {
            System.out.println("Seçiminiz:");
            int kul_seçim = scanner.nextInt();
            int bil_seçim = (int)(Math.random()*3);
            if (kul_seçim == 1) {
                if (bil_seçim == 1) {
                    System.out.println("Bilgisayarın seçimi = Taş (Berabere) ");
                    System.out.println("Bilgisayarın puanı = " + bil_puan + " Sizin Puanınız = " + kul_puan );
                    
                }
                else if (bil_seçim == 2) {
                    System.out.println("Bilgisayarın seçimi = Kağıt (Kaybettiniz) ");
                    bil_puan++;
                    System.out.println("Bilgisayarın puanı = " + bil_puan + " Sizin Puanınız = " + kul_puan);
                    
                }
                else {
                    System.out.println("Bilgisayarın seçimi = Makas (Kazandınız) ");
                    kul_puan++;
                    System.out.println("Bilgisayarın puanı = " + bil_puan + " Sizin Puanınız = " + kul_puan );

                    
                }
                
            }
            else if (kul_seçim == 2) {
                if (bil_seçim == 1) {
                    System.out.println("Bilgisayarın seçimi = Taş (Kazandınız) ");
                    kul_puan++;
                    System.out.println("Bilgisayarın puanı = " + bil_puan + " Sizin Puanınız = " + kul_puan );
                    
                }
                else if (bil_seçim == 2) {
                    System.out.println("Bilgisayarın seçimi = Kağıt (Berabere) ");
                    System.out.println("Bilgisayarın puanı = " + bil_puan + " Sizin Puanınız = " + kul_puan );

                    
                }
                else  {
                    System.out.println("Bilgisayarın seçimi = Makas (Kaybettiniz) ");
                    bil_puan++;
                    System.out.println("Bilgisayarın puanı = " + bil_puan + " Sizin Puanınız = " + kul_puan );
 
                    
                }
                
            }
            else if (kul_seçim == 3) {
                if (bil_seçim == 1) {
                    System.out.println("Bilgisayarın seçimi = Taş (Kaybettiniz) ");
                    bil_puan++;
                    System.out.println("Bilgisayarın puanı = " + bil_puan + " Sizin Puanınız = " + kul_puan );

           
                
            }
                else if (bil_seçim == 2) {
                    System.out.println("Bilgisayarın seçimi = Kağıt (Kazandınız) ");
                    kul_puan++;
                    System.out.println("Bilgisayarın puanı = " + bil_puan + " Sizin Puanınız = " + kul_puan );

                }
                else {
                    System.out.println("Bilgisayarın seçimi = Makas (Berabere) ");
                    System.out.println("Bilgisayarın puanı = " + bil_puan + " Sizin Puanınız = " + kul_puan );

                    
                }
                    
                }
            else{
                System.out.println("Hatalı giriş yaptınız lütfen tekrar deneyiniz...");
                continue;
            }
            if (kul_puan == 3) {
                System.out.println("Oyunu "+kul_puan+"-"+bil_puan+" Kazandınız");
                break;
                
                
            }
            else if (bil_puan == 3) {
                System.out.println("Oyunu "+kul_puan+"-"+bil_puan+" Kaybettiniz");
                break;
                
            }
            
           
                    
            
        }

        
            

    }
    
}
