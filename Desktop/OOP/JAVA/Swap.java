public class Swap {
    public static void main(String[] args) {
        int x=15;
        int y=5;
        int z;
        System.err.println("X value before swap:"+x);
        System.err.println("y value before swap:"+y);
        z=x;
        x=y;
        y=z;
        System.err.println("X value after swap:"+x);
        System.err.println("Y value after swap:"+y);
        x = 15;
        y = 5;
        System.out.println("WITHOUT USING THIRD VARIBALE");
        x = x + y;  
        y = x - y;  
        x = x - y;
        System.err.println("X value after swap:"+x);
        System.err.println("Y value after swap:"+y);
    }
    
}
