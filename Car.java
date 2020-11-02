public class Car {

    private int mpg;
    private int fuel = 0;

    public Car (int mpg, int fuel) {
        this.mpg = mpg;
        this.fuel = fuel;
        }

    public void drive (int miles) {
        fuel = fuel - (mpg/miles);
        }

    public int getGasinTank (){
        return fuel;
        }

    public void addGas (int gas) {
        fuel = fuel + gas;
        }
}
