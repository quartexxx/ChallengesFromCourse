public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean addWater, boolean pourMilk, boolean loadDishwasher) {
        brewMaster.setHasWorkToDo(addWater);
        iceBox.setHasWorkToDo(pourMilk);
        dishWasher.setHasWorkToDo(loadDishwasher);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();

    }

    private CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    private DishWasher getDishWasher() {
        return dishWasher;
    }

    private Refrigerator getIceBox() {
        return iceBox;
    }
}
