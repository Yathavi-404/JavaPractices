public class Cast1 {
    public static void main(String []args){
        int x=5;
        double y=10.5;
        Cast1 c=new Cast1();
        c.dc(x);
        c.lc(x,y);
        c.fc(x);
        c.ic(y);
    }
    void dc(int x){
        System.out.println((double)x);
    }
    void lc(int x,double y){
        System.out.println((long)x);
        System.out.println((long)y);
    }
    void fc(int x){
        System.out.println((float)x);
    }
    void ic(double y){
        int res=(int)y;
        System.out.println(res);
    }
}
