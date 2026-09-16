public class swap1 {
    public static void main(String [] args){
        int x=15;
        int y=5;
        System.out.println("X value befroe swap:"+x);
        System.out.println("y value befroe swap:"+y);

        swapwithout(x,y);
        swapwith(x,y);

    }
    static void swapwith(int a,int b){
        int z=a;
        a=b;
        b=z;
        System.out.println("WIth xtra x after swap:"+a);
        System.out.println("WIth xtra y after swap:"+b);
    }
    static void swapwithout(int a,int b){
        b =a+b;
        a=b-a;
        System.out.println("WIthout xtra x after swap:"+a);
        b=b-a;
        System.out.println("WIthout xtra y after swap:"+ b);

    }
}
