package com.ebay.method.states;

import com.ebay.method.exception.InvalidOperationException;

public abstract class SnailMailState {

    public void start() {
        throw new InvalidOperationException();
    }

    public void verify() {
        throw new InvalidOperationException();
    }

    public void resend() {
        throw new InvalidOperationException();
    }

}
