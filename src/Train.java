public class Train extends TextObject implements TrainStatus{
    private final String name;
    private boolean isOnStation;
    private Towns destination;
    public Train(String name, Towns destination, boolean onStation) {
        super(name);
        this.name = name;
        isOnStation=onStation;
        this.destination =destination;
    }
    public static class Carriage extends Item {
        private boolean isManyPeople;
        private boolean  isFreePlace;

        public Carriage (String name, boolean manyPeople, boolean freePlace){
            super(name);
            this.name = name;
            isManyPeople = manyPeople;
            isFreePlace = freePlace;

        }

        public static class Bench extends Item{
            public Bench(String name){
                super(name);
                this.name = name;

            }
        }

        public boolean getIsFreePlace() {
            return isFreePlace;
        }
        public void setFreePlace(boolean freePlace) {
            isFreePlace = freePlace;
        }

        public boolean getIsManyPeople() {
            return isManyPeople;
        }

        public void setManyPeople(boolean manyPeople) {
            isManyPeople = manyPeople;
        }
    }

    public boolean isOnStation() {
        return isOnStation;
    }

    public void arrived() {
        System.out.println(name + " arrived to railway station");
        isOnStation=true;
    }

    public void departed() {
        System.out.println(name + " departed from railway station");
        isOnStation=false;
    }


}
