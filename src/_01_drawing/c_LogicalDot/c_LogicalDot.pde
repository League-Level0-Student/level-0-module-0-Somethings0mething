
void setup() {
  
// 1. Set the size of the sketch. Make it 600 pixels square. 
  size(1000, 1000);

}

void draw() {
  
// 2. Draw an ellipse
// Run the program to make sure it works before moving on.
ellipse(500,500, 500,500);

// 3. Change the color of the ellipse when the mouse is pressed.
//    Use the following code, but put your colors where indicated
//    Remember to use the   fill()  command to set colors.

if (mousePressed) {
 fill(#A062F2);
 ellipse(500,500, 500,500);
   //  put one color here 
  
} else {
  fill(#F262F0);
  ellipse(500,500, 500,500);}
   // put a different color here
  
  
  
  
}
