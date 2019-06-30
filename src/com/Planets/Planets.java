package com.Planets;

public enum Planets {
    VENUS(0.949, 	41400000),
    MERCUR(0.383,	91691000),
    MARTE(0.532,78340000),
    JUPITER(11.21,628730000),
    SATURN(9.45, 1275000000),
    URANUS(4.01, 2723950000d),
    NEPTUN(3.88, 	4351400000d);

    double size;
    double distance;

    Planets(double value, double distance) {
        this.size = value;
        this.distance = distance;
    }

    public void print(){
        System.out.println("Planeta "+this.name()+" este "+size*100+" % din Terra si distanta pana la Pamant este de "+ distance+" kilometri.");
    }
}
