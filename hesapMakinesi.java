import java.util.Scanner;


public class hesapMakinesi {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner imp = new Scanner(System.in);

        System.out.println("İlk sayıyı Giriniz");
        n1 = imp.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        n2 = imp.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçiniz : \n1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz :");
        select = imp.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Fark : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım : " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0){
                    System.out.println("Bir sayı 0'a bölünemez");
                }else{
                    System.out.println("Bölüm : " + (n1 / n2));}
                break;
            default:
                System.out.println("Hatalı işlem!");
        }

    }
}
