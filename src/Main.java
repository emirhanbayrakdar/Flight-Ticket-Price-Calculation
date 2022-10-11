import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance,age,travelType;
        double firstPrice,totalPrice,perKM = 0.10,ageDiscount=0;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance=scanner.nextInt();
        if (distance<1){
            System.out.println("Hatalı bir değer girdiniz.");
        }else {
            System.out.print("Yaşınızı giriniz : ");
        }

        age = scanner.nextInt();


        System.out.print("Yolculuk tipini giriniz(1 => Tek yön, 2 => Gidiş-Dönüş ) : ");
        travelType = scanner.nextInt();



        firstPrice = perKM*distance;
        double discountedPrice;
        switch (travelType){
            case 1:
                if (age>1 && age < 12){
                    discountedPrice = firstPrice*0.50;
                    System.out.println(discountedPrice+" TL");

                } else if (age>=12 && age<25) {
                    discountedPrice=firstPrice*0.9;
                    System.out.println(discountedPrice+" TL");
                } else if (age>65) {
                    discountedPrice=firstPrice*0.7;
                    System.out.println(discountedPrice+" TL");
                }else {
                    discountedPrice=firstPrice;
                    System.out.println(firstPrice+" TL");
                }

                break;
            case 2:
                if (age>1 && age < 12){
                    ageDiscount=0.5;
                    discountedPrice = firstPrice*0.50*0.8;
                    System.out.println(discountedPrice*2+" TL");

                } else if (age>=12 && age<25) {
                    ageDiscount=0.1;
                    discountedPrice=firstPrice*0.9*0.8;
                    System.out.println(discountedPrice*2+" TL");
                } else if (age>65) {
                    ageDiscount=0.3;
                    discountedPrice=firstPrice*0.7*0.8;
                    System.out.println(discountedPrice*2+" TL");
                }else {
                    discountedPrice=firstPrice*0.8;
                    System.out.println(discountedPrice*2+" TL");
                }
                break;
            default:
                System.out.println("Hatalı bir değer girdiniz.");
        }
    }
}

/*
Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */