package org.example.util;

import java.util.Objects;

public class ConvertBuff {
    public enum Type {
        HP,
        ATK,
        CRIT_DMG
    }
    private final Type type;
    private final Double convertRatio;
    private final Double flat;
    private final String description;
    public ConvertBuff(Type type, Double convertRatio, Double flat, String description) {
        this.type = type;
        this.convertRatio = convertRatio;
        this.flat = flat;
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public Double getConvertRatio() {
        return convertRatio;
    }

    public Double getFlat() {
        return flat;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "ConvertBuff{" +
                "type=" + type +
                ", convertRatio=" + convertRatio +
                ", flat=" + flat +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ConvertBuff that)) return false;
        return getType() == that.getType() && Objects.equals(getConvertRatio(), that.getConvertRatio()) && Objects.equals(getFlat(), that.getFlat()) && Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getConvertRatio(), getFlat(), getDescription());
    }
}
