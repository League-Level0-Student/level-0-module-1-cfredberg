PImage mushroom;
PImage meatball;
import ddf.minim.*;
Minim minim;
AudioPlayer sound;
void setup() {
    size(900, 900);
    mushroom = loadImage("mushroom.png");
    mushroom.resize(50, 50);
    meatball = loadImage("meatball.png");
    meatball.resize(50, 50);
    minim = new Minim(this);
    sound = minim.loadFile("plop.wav");
    noStroke();
    fill(255, 216, 152);
    ellipse(450, 450, 900, 900);
    fill(255,0,0);
    ellipse(450, 450, 850, 850);
    fill(255, 250, 191);
    ellipse(450, 450, 800, 800);
}
void draw() {
  if (mousePressed && (mouseButton == LEFT)){
  image(mushroom, mouseX, mouseY);
  sound.play();
  sound.rewind();
  }
  if (mousePressed && (mouseButton == RIGHT)){
  image(meatball, mouseX, mouseY);
  sound.play();
  sound.rewind();
  }
}
