import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;

int x;
int y;


void setup() {
  PImage waldo = loadImage("Waldo.jpg"); // Change this to match your file name.
  size(950, 650);
  image(waldo, 0, 0);
  doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch } 
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
      println("x: " + mouseX + " y: " + mouseY); 
      x = mouseX;
      y = mouseY;
      if (mousePressed){
      // If the mouse is on Waldo, print “Waldo found!”
    if (x > 492 && x < 520 && y < 366 && y > 328) {
    println("Waldo was found!");
    playWoohoo();
    }
    else {
    playDoh();  
    }
      }
      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}
