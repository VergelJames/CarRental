public class Viray_CarRental {
    protected String name;
    protected int zip;
    protected String type;
    protected int days;
    protected double fee;
    protected double Ffee;
    
    public Viray_CarRental(String Name,int Zip,String Type,int Days){
        name=Name;
        zip=Zip;
        days=Days;
        type=Type;
        switch(type){
            case "e":
                fee=29.99;
                type="economy";
                break;
            case "m":
                fee=38.99;
                type="midsize"; 
                break;
            case "f":
                type="full size"; 
                fee=43.50;
                break;
            case "l":
                type="Luxury";
                fee=79.99;
            
    
                       
        }
        Ffee=fee*days;
            
    }
    public void display(){
        System.out.println("Name               >> " + name + "\n" +
                           "Zip Code           >> " + zip  + "\n" +
                           "Type of Car        >> " + type + "\n" +
                           "Daily Fee          >> " + fee  + "\n" +
                           "Days               >> " + days + "\n" +
                           "**Total Rental Fee >> " + Ffee);
    }
        
    
}
