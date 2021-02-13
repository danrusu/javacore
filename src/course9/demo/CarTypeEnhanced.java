package course9.demo;

// We need a type that can store the following car types: SUV, SPORT, SEDAN
public enum CarTypeEnhanced {
    SUV(1),  // naming convention Uppercase Snakecase i.e. SUV_SPORT
    SPORT(2),
    SEDAN(3);

    private int id;

    CarTypeEnhanced(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    public int getId() {
        return id;
    }
}
