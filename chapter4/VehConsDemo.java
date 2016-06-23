//Add a constructor

class Vehicle {
    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallons

    // This is a constructor for Vehicle.
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    //Return the range
    int range() {
        return mpg * fuelcap;
    }

    // Compute fuel needed for a given distance.
    double fueldneeded(int miles) {
        return (double) miles / mpg;
    }
}

class VehConsDemo {
    public static void main(String args[]) {

        // construct complete Vehicle
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fueldneeded(dist);

        System.out.println("To go " + dist + " miles minivan needs " +
                            gallons + " gallons of fuel.");

        gallons = sportscar.fueldneeded(dist);

        System.out.println("To go " + dist + " miles sportscar needs" +
                            gallons + " gallons of fuel.");

    }
}
