package com.ebay.method.states;

import com.ebay.method.context.SnailMailMethodContext;

public class VerifiedSnailMailState extends SnailMailState {
    SnailMailMethodContext context;

    public VerifiedSnailMailState(SnailMailMethodContext context) {
        this.context = context;
    }

    @Override
    public void start() {
        //doAction();
        context.setCurrentState(context.getStartedState());
    }

}
