 PImage creeper;     //at the top of your program
 int x = 1210;
 int y = 240;
void setup() {
  size (1800, 900); //in setup method
  PImage Grass = loadImage("Grass.jpg");     //in setup method
  Grass.resize(1800, 900);          //in setup method
  background(Grass);          //in setup method
  
  creeper=loadImage("creeper.png");     //in setup method
  creeper.resize(10, 10);          //in setup method
}

void draw() {
  image(creeper, x, y);     //in draw method
}
