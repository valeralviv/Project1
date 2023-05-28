class Fuel{
    double fuel;
    double fuelkm;
    double km;

    public Fuel(double fuel, double fuelkm, double km){
        this.fuel = fuel;
        this.fuelkm = fuelkm;
        this.km = km;
    }

    double needfuel(){
        double res;
        res = fuelkm * km;
        return res;
    }
    public void print(){
        System.out.println("hello");
    }
    double endfuel(){
        double endf;
        endf = fuel - needfuel();
        return endf;
    }
    public double getFuel(){
        return fuel;
    }
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
}

class Breakfuel extends Fuel{
    double breakfuelkm;

    public Breakfuel(double fuel, double fuelkm, double km){
        super(fuel, fuelkm, km);
        this.breakfuelkm = breakfuelkm;
    }

    double mathbfk(){
        double breakfuelkm;
        breakfuelkm =  2 + fuelkm;
        return breakfuelkm;
    }
    double mathneedfuel(){
        double f;
        f = mathbfk() * km;
        return f;
    }
    @Override
    public void print(){
        System.out.println("completed");
    }
}

public class Main {
    public static void main(String[] args) {
        Fuel fuel1 = new Fuel(70,6,100);
        System.out.println("Потрібно палива: " +fuel1.needfuel());
        System.out.println("Залишиться палива: " + fuel1.endfuel());
        fuel1.setFuel(22); // Задав топливо
        System.out.println("Задане топливо = " + fuel1.getFuel());

        Breakfuel breakfuel1 = new Breakfuel(70,6,100);
        breakfuel1.print();  // Override
        System.out.println("Розхід топлива з дирою в баку " + breakfuel1.mathbfk());
        System.out.println("Потрібно топлива з дирою в баку " + breakfuel1.mathneedfuel());
    }
}
