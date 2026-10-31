
class Car {
    int position;
    int speed;

    Car(int position, int speed) {
        this.position = position;
        this.speed = speed;
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        int n = position.length;

        Car[] cars = new Car[n];

  
        for (int i = 0; i < n; i++) {
            cars[i] = new Car(position[i], speed[i]);
        }

        Arrays.sort(cars, (a, b) -> b.position - a.position);

        int fleets = 0;
        double previousTime = 0;

     
        for (int i = 0; i < n; i++) {

            double currentTime = (double) (target - cars[i].position) / cars[i].speed;


            if (currentTime > previousTime) {
                fleets++;
                previousTime = currentTime;
            }
        }

        return fleets;
    }
}
