PImage donkey;
PImage tail;

void setup() {
  size(700,450);
  donkey = loadImage("donkey.jpg");      //change the file name if you need to
  tail = loadImage("tail.png");          //change the file name if you need to
  tail.resize(100, 100);     //replace width, height with your tail's dimensions
  donkey.resize(700, 450);
}

void draw() {
  background (donkey);
  image(tail, mouseX, mouseY);
}
