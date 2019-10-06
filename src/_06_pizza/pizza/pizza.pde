PImage mushroom;
PImage meatball;
void setup() {
    size(900, 900);
    mushroom = loadImage("mushroom.png");
    mushroom.resize(50, 50);
    meatball = loadImage("meatball.png");
    meatball.resize(50, 50);
    noStroke();
    fill(255, 216, 152);
    ellipse(450, 450, 900, 900);
    fill(255,0,0);
    ellipse(450, 450, 850, 850);
    fill(255, 250, 191);
    ellipse(450, 450, 800, 800);
}
void draw() {
    image(mushroom, 600, 300);
    image(mushroom, 300, 600);
    image(mushroom, 600, 600);
    image(mushroom, 300, 300);
    image(meatball, 450, 500);
}
