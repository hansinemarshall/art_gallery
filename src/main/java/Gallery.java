import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till = 0;
    private ArrayList<Artwork> stock = new ArrayList<Artwork>();

    private Gallery(){
    }

    public Gallery(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getTill(){
        return till;
    }

    public void addToTill(double amount){
        this.till = this.till + amount;
    }

    public void addToStock(Artwork theArtwork){
        stock.add(theArtwork);
    }

    // return value of -1 means a failure to find object passed in
    // any other value is a success (the index value represents the artwork that is sold)
    public int sellStock(Artwork art){
        int index = -1;
        for(Artwork artwork: stock){
            if(artwork.getTitle() == art.getTitle()){
                index = stock.indexOf(artwork);
                this.till = this.till + art.getPrice();
            }
        }
        if(index > -1){
            stock.remove(index);
        }
        return index;
    }

    public double stock_take(){
        double total = 0;
        for(Artwork artwork: stock){
            double value = artwork.getPrice();
            total = total + value;
        }
        return total;
    }
}
