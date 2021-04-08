package trafficlight.states;

public class StateFactoryMethod {
    public State stateFactoryMethod(String stateColour) {
     if (stateColour == "GREEN"){
        return new GreenState();
    }
        else if(stateColour == "YELLOW"){
        return new YellowState();
    }
        else if(stateColour == "RED"){
        return new RedState();
    }
        else{
        return new OffState();
    }
}
}


