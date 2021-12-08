public class Viray_LuxuryCarRental extends Viray_CarRental {
    private int chaf;
    private String choice;
    public Viray_LuxuryCarRental(String Name,int Zip,String Type,int Days,int Chaf){
        super(Name,Zip,Type,Days);
        switch(type){
            case "l":
                type="Luxury";
                fee=79.99;
            default:
                System.out.println("Not on the choices");
            
        }
        chaf=Chaf*days;
        Ffee=Ffee+chaf;
        
        
                
        
        
               
    }
    @Override
    public void display(){
        System.out.println("Name               >> " + name + "\n" +
                           "Zip Code           >> " + zip  + "\n" +
                           "Type of Car        >> " + type + "\n" +
                           "Daily Fee          >> " + fee  + "\n" + 
                           "Days               >> " + days + "\n" +
                           "**Total Rental Fee >> " + Ffee);
    }
    
}
