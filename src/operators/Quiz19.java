package operators;

public class Quiz19 {
    //    What is the output of the following code snippet?
    public static void main(String[] args) {
        boolean canine = true, wolf = true;
        int teeth = 20;
        canine = (teeth != 10) ^ (wolf = false);
        System.out.println(canine + ", " + teeth + ", " + wolf);    //true 20 false
    }
}
