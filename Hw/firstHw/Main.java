class Main {
  public static void main(String[] args) {
    //create a new GamePad object
    GamePad gamePad = new GamePad();

    //pass the GamePad object as an argument through the DriveTrain Constructor 
  DriveTrain driveTrain = new DriveTrain(gamePad);
  Intake intake = new Intake();
  CarouselWheel carouselWheel = new CarouselWheel();

    startSystems(driveTrain, intake, carouselWheel);
  }

  public static void startSystems(DriveTrain driveTrain, Intake intake, CarouselWheel carouselWheel){
      driveTrain.init();
      intake.init();
      carouselWheel.init();
      driveTrain.update();
      intake.update();
      carouselWheel.update();
  }

}