package Repeat;

public class Bike extends Transport{
    private String type;

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }

    public Bike(String sn,String model,String manufacture, int year, String type){
        super(sn,model,manufacture,year);
        this.type=type;
    }
    @Override
    public String transportInfo(){
        return super.transportInfo()+" "+ type;
    }
}
