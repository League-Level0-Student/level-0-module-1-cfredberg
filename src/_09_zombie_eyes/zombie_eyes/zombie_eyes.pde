PImage me;
void setup() {
  fullScreen();
  me = loadImage("me.jpg");
}
void draw() {
 background(255, 0, 0);
 image(me, 500, 200);
 noStroke();
 if (mouseX > width/2) {
   fill(0, 255, 0);
 }
 ellipse(910, 505, 100, 100);
 ellipse(1062, 500, 100, 100);
 fill(0);
 ellipse(910, 505, 30, 30);
 ellipse(1062, 500, 30, 30);
}
