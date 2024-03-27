public class Refrigerator {
    private boolean hasWorkToDo;



    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Food is being ordered");
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
