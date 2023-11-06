import Groovy_Programs.CarParkingSystem.C1_CarParkingSystem

class C1_MainCarParking {
    static void main(String[] args) {
        C1_CarParkingSystem parkingSystem = new C1_CarParkingSystem()

        // Display initial availability
        parkingSystem.checkAvailability()

        // Driver 1 chooses ParkingFloorP1
        parkingSystem.parkCar(1)

        // Driver 2 chooses ParkingFloorP2
        parkingSystem.parkCar(2)

        // Display updated availability
        parkingSystem.checkAvailability()

        // Driver 1 leaves ParkingFloorP1
        parkingSystem.leaveCar(1)

        // Display updated availability
        parkingSystem.checkAvailability()
    }
}