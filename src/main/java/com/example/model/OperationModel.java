package com.example.model;

public class OperationModel {


    private String operation;

    private int operation1;
    private int operation2;
    private int operation3;

    public OperationModel() {
    }

    public OperationModel(int c) {
        this.operation3 = c;
    }

    public OperationModel(String operation) {
        this.operation = operation;
    }

    public OperationModel(int a, int b) {
        this.operation1 = a;
        this.operation2 = b;
    }


    public int getOperation1() {
        return operation1;
    }

    public void setOperation1(int a) {
        this.operation1 = a;
    }

    public int getOperation2() {
        return operation2;
    }

    public void setOperation2(int b) {
        this.operation2 = b;
    }


    public int getC() {
        return operation3;
    }

    public void setC(int c) {
        this.operation3 = c;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

}