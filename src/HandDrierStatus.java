
//Oppgave 3.2

public interface HandDrierStatus {
    HandDrierStatus sensorChange();
    String getStatus();
}

class HandDrier_OFF implements HandDrierStatus {

    @Override
    public HandDrierStatus sensorChange() {
        return new HandDrier_ON();
    }

    @Override
    public String getStatus() {
        return "OFF";
    }
}

class HandDrier_ON implements HandDrierStatus {

    @Override
    public HandDrierStatus sensorChange() {
        return new HandDrier_OFF();
    }

    @Override
    public String getStatus() {
        return "ON";
    }
}

class HandDrier {

    private HandDrierStatus status = new HandDrier_OFF();

    public void sensorChanging() {
        status = status.sensorChange();
    }

    public void printStatus() {
        System.out.println(status.getStatus());
    }

}
