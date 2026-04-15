package Methods;

class Average{
    public static void main(String[] args) {
        IO.println(getAverage(12, 87, 45));
    }

    public static double getAverage(double x, double y, double z){
        return (x+y+z)/3;
    }

}