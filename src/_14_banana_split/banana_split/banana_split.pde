int tY = 50;

void setup(){
  size (300, 300);
  background(255, 0, 209);
  for (int i = 0; i < 4; i++){
    textSize(50);
    if (i < 3){
      text("ice cream", 30, tY);
    } else{
      text("banana", 30, tY);
    }
    tY = tY + 60;
  }
}
