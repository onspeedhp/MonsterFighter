package ObjectModel;

public enum MonsterListKey {
    NAME, HEALTH, DAMAGE, HEAL_AMOUNT, ATTACK, DEFENCE;


    public String toString() {
        return switch (this) {
            case NAME -> "_name";
            case HEALTH -> "_health";
            case DAMAGE -> "_damage";
            case HEAL_AMOUNT -> "_heal_amount";
            case ATTACK -> "_attack";
            case DEFENCE -> "_defence";
        };
    }
}
