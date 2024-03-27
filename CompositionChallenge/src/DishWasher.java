public class DishWasher {
    private boolean hasWorkToDo;



    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Dishes are being made");
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
