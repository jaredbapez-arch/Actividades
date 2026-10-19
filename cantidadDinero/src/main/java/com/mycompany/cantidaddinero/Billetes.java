package com.mycompany.cantidaddinero;


public class Billetes {
    private int billetes;

    public Billetes(int billetes) {
        this.billetes = billetes;
    }

    public int getBilletes() {
        return billetes;
    }

    public void setBilletes(int billetes) {
        this.billetes = billetes;
    }

    @Override
    public String toString() {
        return "Billetes{" + "billetes=" + billetes + '}';
    }
    
}
