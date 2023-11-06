package Groovy_Programs.CarParkingSystem

class C1_CarParkingSystem{
    def parkingFloorP1 = 20 // Number of available spots on ParkingFloorP1
    def parkingFloorP2 = 20 // Number of available spots on ParkingFloorP2

    def checkAvailability() {
        println("ParkingFloorP1 Available Spots: $parkingFloorP1")
        println("ParkingFloorP2 Available Spots: $parkingFloorP2")
    }

    def parkCar(floorChoice) {
        def parkingFloor
        if (floorChoice == 1) {
            parkingFloor = 'ParkingFloorP1'
        } else if (floorChoice == 2) {
            parkingFloor = 'ParkingFloorP2'
        } else {
            println("Invalid floor choice. Please select 1 or 2.")
            return
        }

        if (parkingFloor == 'ParkingFloorP1' && parkingFloorP1 > 0) {
            println("Driver confirms parking on $parkingFloor.")
            parkingFloorP1--
        } else if (parkingFloor == 'ParkingFloorP2' && parkingFloorP2 > 0) {
            println("Driver confirms parking on $parkingFloor.")
            parkingFloorP2--
        } else {
            println("No available spots on $parkingFloor. Please choose another floor.")
        }
    }

    def leaveCar(floorChoice) {
        def parkingFloor
        if (floorChoice == 1) {
            parkingFloor = 'ParkingFloorP1'
        } else if (floorChoice == 2) {
            parkingFloor = 'ParkingFloorP2'
        } else {
            println("Invalid floor choice. Please select 1 or 2.")
            return
        }

        if (parkingFloor == 'ParkingFloorP1' && parkingFloorP1 < 20) {
            println("Driver confirms leaving $parkingFloor.")
            parkingFloorP1++
        } else if (parkingFloor == 'ParkingFloorP2' && parkingFloorP2 < 20) {
            println("Driver confirms leaving $parkingFloor.")
            parkingFloorP2++
        } else {
            println("No cars to leave on $parkingFloor.")
        }
    }
}
