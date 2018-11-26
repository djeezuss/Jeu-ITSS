package net.ddns.djeezuss.enums;

public enum CardTypeEnum {
    INFECTION("infection"),
    VACCINE("vaccine"),
    ANTICONDOM("anticondom"),
    CONDOM("condom"),
    SWINGER("swinger"),
    AGAR("agar");


    private String name;

    CardTypeEnum(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " card";
    }
}
