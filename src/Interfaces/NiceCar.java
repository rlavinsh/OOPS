package Interfaces;

public class NiceCar {
    private Engine engine;
    private Media media;

    public NiceCar() {
        engine = new PowerEngine();
        media = new CDPlayer();
    }

    public NiceCar(Engine engine,Media media) {
        this.engine = engine;
        this.media = media;
    }



    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        media.start();
    }

    public void stopMusic() {
        media.stop();
    }

    public void upgradeCar(){
        this.engine = new ElectricEngine();
    }

}
