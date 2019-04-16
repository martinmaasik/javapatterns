public class BridgePatternTest {
    public static void main(String[] args) {
        Vehicle car = new Car(new Diesel());
        car.tankUp();

        Vehicle motorCycle = new MotorCycle(new Petrol());
        motorCycle.tankUp();
    }
}
