class Cylinder{

  int radius;
  int height;
  Cylinder(int radius,int height){
    this.raadius=radius;
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
  
}




