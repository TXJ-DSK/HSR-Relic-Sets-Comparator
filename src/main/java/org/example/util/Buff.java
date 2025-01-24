package org.example.util;

public class Buff {
    BuffType type;
    Double value;
    Double coverage;
    String description;

    public Buff(BuffType type, Double value, Double coverage, String description) {
        this.type = type;
        this.value = value;
        this.coverage = coverage;
        this.description = description;
    }

    public Buff(BuffType type, Double value, Double coverage) {
        this.type = type;
        this.value = value;
        this.coverage = coverage;
        this.description = "";
    }

    public Buff(BuffType type, Double value, String description) {
        this.type = type;
        this.value = value;
        this.coverage = 1.0;
        this.description = description;
    }

    public Buff(BuffType type, Double value) {
        this.type = type;
        this.value = value;
        this.coverage = 1.0;
        this.description = "";
    }

    private Buff() {}

    @Override
    public String toString() {
        return "Buff{" +
                "type=" + type +
                ", value=" + value +
                ", coverage=" + coverage +
                ", description='" + description + '\'' +
                '}';
    }
}
