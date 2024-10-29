package Persewaan; //nama folder tempat penyimpanan
//subclass
public class CD extends PRODUCT{

    
    private String artist;
    private int totalSong;
    private String label;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTotalSong() {
        return this.totalSong;
    }

    public void setTotalSong(int totalSong) {
        this.totalSong = totalSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CD() {
       number = 0;
       name = "All to well";
       quantity = 0;
       Price = 0.0;
        artist = "bima";
        totalSong = 0;
        label = "pop";


        }


        public void CDprint() {
            System.out.println("number: " + number);
            System.out.println("name: "+ Nama);
            System.out.println("quantity: "+quantity);
            System.out.println("price: "+price);
            System.out.println("price: "+price);
            System.out.println("total song: "+totalSong);
            System.out.println("label: "+label);
    }
    
}