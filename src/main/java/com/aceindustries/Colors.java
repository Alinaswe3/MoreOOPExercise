package com.aceindustries;

public enum Colors {

    WHITE("White"),
    BLACK("Black");

    private String value;

    Colors(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
