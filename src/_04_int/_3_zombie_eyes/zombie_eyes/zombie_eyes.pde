
void setup() {
size(600,600);
}
void draw() {
PImage Face = loadImage("Face.jpg");
Face.resize(600,600);
image(Face,0,0);
//Eyes
fill(255,255,255);
ellipse(253,300,30,30);
ellipse(353,295,30,30);
//Irises
fill(8,8,8);
ellipse(253,300,5,5);
ellipse(353,295,5,5);
}
