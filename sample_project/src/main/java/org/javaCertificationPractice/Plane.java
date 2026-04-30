package org.javaCertificationPractice;

public abstract class Plane {
}

abstract class planet{
    protected void revolve(){

    }
    abstract void rotate();
}
class Earth extends planet{
    public void revolve(){// protected cannot be default

    }
    protected void rotate(){

    }
}