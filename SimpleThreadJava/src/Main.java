public class Main {

    public static void main(String[] args) {

        Thread threadOne = new Thread(new Second("thread one"));
        Thread threadTwo = new Thread(new Second("thread two"));
        Thread threadThree = new Thread(new Second("thread three"));
        Thread threadFour = new Thread(new Second("thread four"));

        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
    }
}
