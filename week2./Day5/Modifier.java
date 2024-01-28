class Cylinder{

  int radius;
  int height;
  Cylinder(int radius,int height){
    this.radius=radius;
    this.height=height;
  }
  
    int getRadius(){
    return radius;
  }
  int getHeight(){
    return height;
  }
  
  void setRadius(int radius){
    this.radius=radius;
    
  } 
  void setHeight(int height){
    this.height=height;
  }
    double surfaceArea(int radius,int height){
      return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
   double volume(int radius,int height){
    return Math.PI*radius*radius*height;
  }
  
}

class Rectangle{
     int length;
     int breadth;
  Rectangle(int l,int b){
    this.length=l;
    this.breadth=b;
  }
  int getLength(){
    return length;
  }
  int getBreadth(){
    return breadth;
  }
  void setLength(int l){
    this.length=l;
  }
  void setBreadth(int b){
    this.breadth=b;
  }
  int area(int l,int b){
    return l*b;
  }
}
class Modifier{
  public static void main(String[] args){
    Cylinder c=new Cylinder(2,3);
    Rectangle r=new Rectangle(4,5);
    c.setRadius(5);
    c.setHeight(10);
    System.out.println("volume of Cylinder is:"+c.volume(10,5));
    System.out.println("surface area:"+c.surfaceArea(12,5));
    System.out.println("area of rectangler:"+r.area(10,20));
     System.out.println("area of rectangler:"+r.getBreadth());
  }
}




