package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.states.State;


public class YellowState implements State {
    private final TrafficLightCtrl ctrl;
    public YellowState(TrafficLightCtrl ctrl) {
        this.ctrl = ctrl;
    }

    @Override
    public void nextState() {
        ctrl.setCurrentState(ctrl.getGreenState());


    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.YELLOW;
    }
}
