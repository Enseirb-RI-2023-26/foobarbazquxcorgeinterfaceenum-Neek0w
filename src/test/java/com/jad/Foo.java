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

    public void addBar(IBar bar) {

    }
}
