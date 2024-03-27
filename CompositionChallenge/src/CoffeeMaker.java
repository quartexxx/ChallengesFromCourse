public class CoffeeMaker {
    private boolean hasWorkToDo;



    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Coffee is being made");
            hasWorkToDo=false;
        }
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }
}
