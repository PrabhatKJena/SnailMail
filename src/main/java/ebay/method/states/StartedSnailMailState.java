package com.ebay.method.states;

import com.ebay.method.context.SnailMailMethodContext;

public class StartedSnailMailState extends SnailMailState {
    SnailMailMethodContext context;

    public StartedSnailMailState(SnailMailMethodContext context) {
        this.context = context;
    }

    @Override
    public void resend() {
        //doAction();
        context.setCurrentState(context.getResentState());
    }

    @Override
    public void verify() {
        //doAction
        context.setCurrentState(context.getVerifiedState());
    }
}
