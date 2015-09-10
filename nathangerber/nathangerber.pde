void setup() {
  size(1230, 1100);
}

void draw() {
  if (mousePressed) {
    fill(0);
  } else {
    float y = random(255);
    float red = random(255);
    float blue = random(255);
    float green = random (255);
    fill(red,blue,green);
  }
  float x = random(500);
  float y = random(500);
  
  float xx = random(1230);
  float yy = random(1100);
  
  float tl = random(50);
  float tr = random(50);
  float br = random(50);
  float bl = random(50);
  
  rect(xx, yy, x, y, tl, tr, br, bl);
}