class calculator {

    int num1;
    int num2;

    int addition() {
        return (num1+num2);
    }

   int sub() {
        return (num1-num2);
    }

    int multi () {
        return (num1*num2);
    }
    int div () {
        return (num1/num2);
    }
    int modulus () {
        return (num1%num2);
    }
}


public class Demo {

    public static void main(String[] args) {

        calculator t = new calculator();

        t.num1 = 12;
        t.num2 = 5;

        int add = t.addition();
        int sub = t.sub();
        int mul = t.multi();
        int div = t.div();
        int mod= t.modulus();

        System.out.println("Addition is: " + add);
        System.out.println("Substration is: " + sub);
        System.out.println("Multiplication is: " + mul);
         System.out.println("Division is: " + div);
          System.out.println("Modulous is: " + mod);
    }
}

