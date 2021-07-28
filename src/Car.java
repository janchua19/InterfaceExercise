public class Car implements TrasportationInterface{
    @Override
    public void modeOfTranspo() {
        System.out.print("Car.\n");
    }
    int cost;
    public int cost(int cost){
        cost = 500;
        return cost;
    }
}
