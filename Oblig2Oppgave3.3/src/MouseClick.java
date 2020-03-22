import java.util.LinkedList;
import java.util.List;

public class MouseClick {

    private boolean isClicked = false;

    //Oppretter en liste med observatører, som kan få melding når museklikk skjer
    private List<Observer> observers = new LinkedList<>();

    public boolean isClicked() {
        return isClicked;
    }

    public void setClicked(boolean clicked) {
        isClicked = clicked;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //sjekker om musen klikkes, gjør den det så sendes det melding til alle observatører
    public void detectMouseClicked() {
        System.out.println("Is mouse clicked: " + isClicked);
        //sjekker om musen er klikket
        if (isClicked) {
            notifyObservers();
        }
    }

    //Sender melding til alle observatører i listen
    private void notifyObservers() {
        for(Observer o : observers) {
            o.update();
        }
    }


}
