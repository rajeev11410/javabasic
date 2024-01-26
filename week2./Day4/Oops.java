//ALL TODAY QUESTION HAVE DONE IN THIS FILE.
class Employee{
     String name;
     int salary;
    public int getSalary(){
      return salary;
    }
  public String getName(){
    return name;
  }
  public void setName(String n){
    name=n;
  }
}
  class  CellPhone{
        public void ring(){
          System.out.println("ringing...");
        }
    public void vibrate(){
      System.out.println("vibrating...");
    }
    
    
  }

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

  class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
   public class  Oops{
  public  static void main(String[] args){
    System.out.println("Question1");
    Employee e1=new Employee();
    e1.name="harry";
    e1.salary=34;
    e1.setName("my name is rajeev");
    System.out.println(e1.getSalary()+" "+e1.getName());
  
    // Problem 2
     System.out.println("question2");
  
    CellPhone asus = new CellPhone();
    asus.ring();
    asus.vibrate();
    //asus.ring();


    // Problem 3
    System.out.println("question3");
    Square sq = new Square();
    sq.side = 3;
    System.out.println(sq.area());
    System.out.println(sq.perimeter());
     

    // Problem 5
    System.out.println("question4");
    Tommy player1 = new Tommy();
    player1.fire();
    player1.run();
    player1.hit();

  }
  
}
