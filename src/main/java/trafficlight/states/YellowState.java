package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.states.State;


public class YellowState implements State {

    @Override
    public void nextState(TrafficLightCtrl ctrl) {

        if (ctrl.getPreviousState().equals(ctrl.getRedState())) {
            ctrl.setCurrentState(ctrl.getGreenState());
            ctrl.setPreviousState(this);
        }
        else {
            ctrl.setCurrentState(ctrl.getRedState());
            ctrl.setPreviousState(this);

        }


    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.YELLOW;
    }
}
