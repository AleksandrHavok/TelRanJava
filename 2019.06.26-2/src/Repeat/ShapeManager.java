package Repeat;

public class ShapeManager {
    private IShape[] arr;
    private int count = 0;

    public ShapeManager(){
        //В отличии от абстрктного класса, от интерфейса можно инстанцировать объект
        arr = new IShape[10];
    }

    public boolean add(IShape s){
        if(s==null){
            return false;
        }
        if (count==arr.length){
            IShape[] tmp = new IShape[arr.length*2];
            for(int i=0;i<arr.length;i++){
                tmp[i]=arr[i];
            }
            arr=tmp;
        }
        arr[count++]=s;
        return true;
    }

    public void display(){
        double sumArea = 0;
        double sumPer=0;
        for (int i=0;i<count;i++){
            sumArea+=arr[i].getArea();
            sumPer+=arr[i].getPer();
        }
        System.out.println("Summary perimeter= " + sumPer + " summary area= " + sumArea);
    }
}
