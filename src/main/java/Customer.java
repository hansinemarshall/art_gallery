import java.util.ArrayList;

public class Customer {

    private String name;

    private double wallet = 0;

    private ArrayList<Artwork> artCollection = new ArrayList<>();

    private Customer(){

    }

    public Customer(String theName){
        this.name = theName;
    }

    public String getName(){
        return this.name;
    }

    public double getWallet(){
        return this.wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public int getArtCollectionSize() {
        return artCollection.size();
    }

    public void buyArtwork(Artwork theArt){
        artCollection.add(theArt);
        double price = theArt.getPrice();
        this.wallet = this.wallet - price;
    }
}
