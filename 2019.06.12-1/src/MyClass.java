public class MyClass {
    int a;
    int a(int a){
        {
            a = 17;
            this.a=18;
        }
        return a;
    }
    int getA(){
        int res=this.a(123);
        return this.a;
    }
}
