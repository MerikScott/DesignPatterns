package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton instanceA = Singleton.getInstance();
        Singleton instanceB = Singleton.getInstance();


        System.out.println(instanceA == instanceB);
        System.out.println(instanceA.equals(instanceB));
    }
}
