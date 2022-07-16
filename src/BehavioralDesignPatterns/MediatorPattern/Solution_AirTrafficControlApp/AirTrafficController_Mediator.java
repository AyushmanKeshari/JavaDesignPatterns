package BehavioralDesignPatterns.MediatorPattern.Solution_AirTrafficControlApp;

public class AirTrafficController_Mediator {

    private Plane plane;
    private PlanesOnGround planesOnGround;
    private PlanesInFlight planesInFlight;
    private Runway runway;

    public AirTrafficController_Mediator(int id) {
        plane = new Plane(id);
        planesOnGround = new PlanesOnGround();
        planesInFlight = new PlanesInFlight();
        runway = new Runway();
    }

    public void takeOff() {
        if(!plane.getIsInTheAir() && runway.getIsAvailable()) {
            System.out.println("Plane " + plane.getId() + " is taking off...");
            planesOnGround.removePlane(plane);
            planesInFlight.addPlane(plane);
            runway.setIsAvailable(false);
            plane.setIsInTheAir(true);
        }
    }
}
