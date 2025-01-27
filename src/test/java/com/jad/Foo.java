package com.jad;

import java.util.ArrayList;

public class Foo implements IFoo {
    private IBaz baz;
    private ArrayList<IBar> bars;
    private IQux qux;
    private ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
        this.bars = new ArrayList<>();
        this.qux = qux;

    }

    public IBaz getBaz() {
        return this.baz;
    }

    public void setBaz(IBaz baz) {
        this.baz = baz;
    }

    public ArrayList<IBar> getBars() {
        return this.bars;
    }

    public void setBars(ArrayList<IBar> bars) {
        this.bars = bars;
    }

    public IQux getQux() {
        return this.qux;
    }

    public void setQux(IQux qux) {
        this.qux = qux;
    }

    public ICorge getCorge() {
        return this.corge;
    }

    public void setCorge(ICorge corge) {
        this.corge = corge;
    }

    public void addBar(IBar bar) {

    }
}
