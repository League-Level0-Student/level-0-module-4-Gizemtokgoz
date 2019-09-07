PImage donkey;
PImage tail;
int x;
int y;

boolean clicked = false;

void setup() {
  size(700,450);
  donkey = loadImage("donkey.jpg");      //change the file name if you need to
  tail = loadImage("tail.png");          //change the file name if you need to
  tail.resize(100, 100);     //replace width, height with your tail's dimensions
  donkey.resize(700, 450);
}

void draw() {
  
  if (mousePressed) {
    clicked = true;
  }
 
  
  background (donkey);
  rect(0, 0, 30, 30);
  rect(590, 100, 40, 40);
  
  if (dist(0, 0, mouseX, mouseY) < 30) {
    background(donkey);
  }
  else if (dist(590, 100, x, y) < 30 && clicked) {
    background(donkey);
    println("You WON!!!");
  }
  else {
   background(#BDE0FC);
  }
  
  if(!clicked){
    x = mouseX;
    y = mouseY;
  }
   else {
     background (donkey);
   }
  
  image(tail, x, y);
}
