import java.util.Scanner;
public class Viray_UseCarRental {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("Enter Name >>");
        String name=k.nextLine();
        System.out.print("Enter Zip Code >> ");
        int zip=k.nextInt();
        k.nextLine();
        System.out.println("Enter Type of Car\ne-economy\nm-midsize\nf-fullsize\nl-luxury\n>> ");
        String type=k.nextLine();
        System.out.println("Enter Days of Rent >>");
        int days=k.nextInt();
        if (type.equals("l")){
            k.nextLine();
            System.out.println("Do you want chauffeur? Y or N");
            String choice=k.nextLine();
            int chaf=0;
            choice=choice.toUpperCase();
            if (choice.equals("Y")){
                chaf=200;
            }
            
            Viray_LuxuryCarRental car = new Viray_LuxuryCarRental(name,zip,type,days,chaf);
            car.display();
        }
        else{
            Viray_CarRental car = new Viray_CarRental(name,zip,type,days);
            car.display();
        }
      
    }
    
}
