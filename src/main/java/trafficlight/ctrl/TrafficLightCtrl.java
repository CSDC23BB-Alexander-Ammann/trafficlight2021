package trafficlight.ctrl;

import trafficlight.gui.TrafficLightGui;
import trafficlight.states.*;

public class TrafficLightCtrl {

    private State greenState;

    private State redState;

    private State yellowState;

    private State currentState;

    private State previousState;

    private TrafficLightGui gui;


    public TrafficLightCtrl() {
        super();
        initStates();
        gui = new TrafficLightGui(this);
        gui.setVisible(true);
    }

    private void initStates() {

        //TODO create the states and set current and previous state
        greenState = new StateFactoryMethod().stateFactoryMethod("GREEN");
        yellowState = new StateFactoryMethod().stateFactoryMethod("YELLOW");
        redState = new StateFactoryMethod().stateFactoryMethod("RED");
        currentState = new StateFactoryMethod().stateFactoryMethod("OFF");
        previousState = new StateFactoryMethod().stateFactoryMethod("RED");
    }

    public State getGreenState() {
        return greenState;
    }

    public State getRedState() {
        return redState;
    }

    public State getYellowState() {
        return yellowState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getPreviousState() {
        return previousState;
    }

    public void setPreviousState(State previousState) {
        this.previousState = previousState;
    }

    public void run() {
        gui.run();
    }

    public void nextState() {
        //TODO handle GUi request and update GUI
        getCurrentState().nextState(this);
        gui.setLight(getCurrentState().getState());
    }
}