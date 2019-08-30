int x;
int y;
int a;
int b;
void setup() {
  PImage face = loadImage("peppa.jpg");
    size (800,800);
    face.resize(width,height);
    background(face);
}

void draw() {
    x = mouseX;
    y = mouseY;
    a = mouseX;
    b = mouseY;
    if (x > 410){
     x=410; 
    }
    if (x < 350){
     x=350; 
    }
    if (y < 180){
     y=180; 
    }
    if (y > 240){
     y=240; 
    }
    
    if (a > 500){
     a=500; 
    }
    if (a < 460){
     a=460; 
    }
    if (b < 160){
     b=160; 
    }
    if (b > 220){
     b=220; 
    }
    
    fill(#FFFFFF);
    ellipse(380,210,100,100);
    ellipse(470,190,100,100);
    fill(#030303);
    ellipse(x,y,15,15); //right pupil
    
    ellipse(a,b,15,15); //left pupil
    
}
