abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

  abstract class Telephone {
      abstract void dial();
      abstract void lift();
      abstract void disconnected();
  }
  class SmartTelephone extends Telephone {
      void dial() {
          System.out.println("Dialing a smart call");
      }

      void lift() {
          System.out.println("Lifting a smart call");
      }

      void disconnected() {
          System.out.println("Smart call disconnected");
      }
  }
   interface TVRemote {
      void power();
      void volumeUp();
      void volumeDown();
  }
   interface SmartTVRemote extends TVRemote {
      void navigate();
      void voiceControl();
  }
   class TV implements TVRemote {
     @Override
    public  void power() {
          System.out.println("TV power button pressed");
      }

      public void volumeUp() {
          System.out.println("Volume increased");
      }

     public  void volumeDown() {
          System.out.println("Volume decreased");
      }
  }


public class   Method{
    public static void main(String[] args) {
        // Q1 + Q2
        FountainPen pen = new FountainPen();
        pen.changeNib();

        // Q3
        Human harry = new Human();
        harry.sleep();

        // Q5
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        // m1.speak(); --> Cannot use speak method because the reference is monkey which does not have speak method

        BasicAnimal lovish = new Human();
        // lovish.speak(); --> error
        lovish.eat();
        lovish.sleep();

    }
}
