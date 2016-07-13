import java.util.Random;

public class Second implements Runnable {

    private String name;
    int time;
    Random random = new Random();

    public Second(String name) {
        this.name = name;
        time = random.nextInt(5000);
    }

    @Override
    public void run() {
        try{
            System.out.printf("%s is sleeping for %d ms\n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        }catch (Exception e){
        }
    }
}
