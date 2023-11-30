public class Example1 {

    public static void main(String[] args){

        int box = 39;
        int box2;
        double co1 = 15.10;
        int co2 = 50;
        int co2pb = 5;
        double boxp1;
        double boxp2;
        double boxpt;
        int box2r;

        boxp1 = box * co1;
        System.out.println("Total price: $" + boxp1);
        box2r = box % co2pb;
        box2 = box - box2r;
        box2 = box / co2pb;
        boxp2 = box2 * co2;
        System.out.println("New price: $" + boxp2);
        boxp1 = box2r * co1;
        boxpt = boxp1 + boxp2;
        System.out.println("Final oprice: $" + boxpt);

    }

}
