package Repeat;

public class Car extends Transport {
    private boolean isAuto;//проверка на тип трансмиссии

    public boolean isAuto(){
        return isAuto;
    }

    public void setAuto(boolean auto){
        isAuto=auto;
    }

    public Car(String sn, String model, String manufacture, int year, boolean isAuto){
        super(sn,model,manufacture,year);
        this.isAuto=isAuto;

    }

    @Override
    public String transportInfo(){
        String transmission=isAuto? "Auto":"Manual";
        return super.transportInfo()+transmission;

    }
}
