package net.ddns.djeezuss.enums;

public enum InfectionTypeEnum {
    ;


    private String name;

    InfectionTypeEnum(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " card";
    }
}
