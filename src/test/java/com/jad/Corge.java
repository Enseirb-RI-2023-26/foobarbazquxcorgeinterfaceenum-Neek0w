package com.jad;

public abstract class Corge implements ICorge {
    private IFoo foo;


    public Corge(IFoo foo) {

    }

    public IFoo getFoo() {
        return this.foo;
    }

    public void setFoo(IFoo foo) {
        this.foo = foo;
    }
}
