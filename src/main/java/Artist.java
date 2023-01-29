public class Artist {

    private String name;

    private Artist(){
    } // private Artist constructor denies construction of unnamed artist

    public Artist(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
