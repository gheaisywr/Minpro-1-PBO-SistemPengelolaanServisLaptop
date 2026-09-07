package model;

public class Laptop {

    private String idLaptop;
    private String merk;
    private String tipe;
    private String kerusakan;

    // Constructor
    public Laptop(String idLaptop, String merk, String tipe, String kerusakan) {
        this.idLaptop = idLaptop;
        this.merk = merk;
        this.tipe = tipe;
        this.kerusakan = kerusakan;
    }

    // Getter dan Setter
    public String getIdLaptop() {
        return idLaptop;
    }

    public void setIdLaptop(String idLaptop) {
        this.idLaptop = idLaptop;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }
}