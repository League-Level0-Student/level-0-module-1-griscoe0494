
void setup() {
    size(600,600);
}
void draw() {
    fill(196,177,127);
    ellipse(250,250,300,300);
    fill(245,40,43);
    ellipse(250,250,280,280);
    fill(245,231,178);
    PImage Pepperoni=loadImage("Pepperoni.jpg");
    Pepperoni.resize(50,50);
    image(Pepperoni,250,250);
    PImage Tomato=loadImage("Tomato.png");
    Tomato.resize(50,50);
    image(Tomato,200,235);
    
}
