package com.ebay.method.context;

import com.ebay.method.states.ResentSnailMailState;
import com.ebay.method.states.SnailMailState;
import com.ebay.method.states.StartedSnailMailState;
import com.ebay.method.states.VerifiedSnailMailState;

public class SnailMailMethodContext {
    private SnailMailState currentState = new VerifiedSnailMailState(this);
    private StartedSnailMailState startedState = new StartedSnailMailState(this);
    private ResentSnailMailState resentState = new ResentSnailMailState(this);
    private VerifiedSnailMailState verifiedState = new VerifiedSnailMailState(this);

    public void startMail() {
        currentState.start();
    }

    public void verifyMail()    {
        currentState.verify();
    }

    public void resendMail() {
        currentState.resend();
    }

    public void setCurrentState(SnailMailState currentState) {
        this.currentState = currentState;
    }

    public SnailMailState getCurrentState() {
        return currentState;
    }

    public StartedSnailMailState getStartedState() {
        return startedState;
    }

    public ResentSnailMailState getResentState() {
        return resentState;
    }

    public VerifiedSnailMailState getVerifiedState() {
        return verifiedState;
    }
}
