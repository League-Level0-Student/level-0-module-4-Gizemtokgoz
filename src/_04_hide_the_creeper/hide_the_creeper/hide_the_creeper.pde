 PImage creeper;     //at the top of your program
 int x = 450;
 int y = 450;
  
void setup() {
  size (1800, 900); //in setup method
  PImage Grass = loadImage("Grass.jpg");     //in setup method
  Grass.resize(1800, 900);          //in setup method
  background(Grass);          //in setup method
  
  creeper=loadImage("creeper.png");     //in setup method
  creeper.resize(20, 20);          //in setup method
}

void draw() {

  image(creeper, x, y);     //in draw method
  if (mousePressed) {
    if (dist(x + 10, y + 10, mouseX, mouseY) < 30) {
      fill (#8FF0A4);
      ellipse(mouseX,mouseY,25,25);
      println ("You found the creeper!");
    }
    else {
    fill (#F26464);
    ellipse(mouseX,mouseY,25,25);
    }
  }
}
