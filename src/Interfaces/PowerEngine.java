package Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stop");

    }

    @Override
    public void acc() {
        System.out.println("power engine accelerate");
    }
}
