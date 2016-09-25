package com.ebay.method.states;

import com.ebay.method.context.SnailMailMethodContext;

public class ResentSnailMailState extends SnailMailState {
    SnailMailMethodContext context;

    public ResentSnailMailState(SnailMailMethodContext context) {
        this.context = context;
    }

    @Override
    public void verify() {
        context.setCurrentState(context.getVerifiedState());
    }

    @Override
    public void resend() {
        context.setCurrentState(context.getResentState());
    }
}
