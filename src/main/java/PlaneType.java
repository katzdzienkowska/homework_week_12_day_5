public enum PlaneType {
    BOEING_747(5, 100),
    BOEING_888(10, 200),
    AIRBUS_111(3, 300);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getTotalWeight(){
        return totalWeight;
    }
}
