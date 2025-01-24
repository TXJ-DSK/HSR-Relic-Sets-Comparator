package org.example.util;

public class Buff {
    private final BuffType type;
    private final Double value;
    private final Double coverage;
    private String description;

    public Buff(BuffType type, Double value) {
        this(type, value, 1.0, "");
    }

    public Buff(BuffType type, Double value, Double coverage) {
        this(type, value, coverage, ""); // Default description
    }

    public Buff(BuffType type, Double value, String description) {
        this(type, value, 1.0, description); // Default description
    }

    public Buff(BuffType type, Double value, Double coverage, String description) {
        validateParameters(type, value, coverage, description); // Validate parameters
        this.type = type;
        this.value = value;
        this.coverage = coverage;
        this.description = description;
    }

    // Private constructor with validation logic
    private void validateParameters(BuffType type, Double value, Double coverage, String description) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null.");
        }
        if (value == null) {
            throw new IllegalArgumentException("Buff value cannot be null.");
        }
        if (coverage == null || coverage < 0.0 || coverage > 1.0) {
            throw new IllegalArgumentException("Coverage must be between 0.0 and 1.0.");
        }
        if (description != null && description.length() > 100) {
            throw new IllegalArgumentException("Description cannot be longer than 100 characters.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Buff{");
        sb.append("type=").append(type)
                .append(", value=").append(value);

        if (coverage != 1.0) {
            sb.append(", coverage=").append(coverage);
        }

        if (description != null && !description.isEmpty()) {
            sb.append(", description='").append(description).append('\'');
        }

        sb.append('}');
        return sb.toString();
    }

    public BuffType getType() {
        return type;
    }

    public Double getValue() {
        return value;
    }

    public Double getCoverage() {
        return coverage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
