package Repeat;

public class Transport {
    private String sn;
    private String model;
    private String manufacture;
    private int year;

    public String getSn(){
        return sn;
    }
    public void setSn(String sn){
        this.sn=sn;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getManufacture(){
        return manufacture;
    }
    public void setManufacture(){
        this.manufacture=manufacture;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }

    public Transport(String sn, String model, String manufacture, int year){
        this.sn=sn;
        this.model=model;
        this.manufacture=manufacture;
        this.year=year;
    }

    public String transportInfo(){
        return sn+ " "+model+" "+ manufacture+ " "+ year;
    }
}
