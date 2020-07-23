int x1=800;
int x2=200;

void setup(){
 size(1000,800);
}

void draw() {
  if(x1==0){
  x1=1000;
  }
  if(x2==1000){
  x2=0;
  }
 background(#2EA526); 
  x1-=1;
for (int i = 30; i > 1; i--){
  



if (i % 2 == 0) {
        noFill();
ellipse(x1,400,i*10,i*10);
    }
    else {
       fill(#000000);
ellipse(x1,400,i*1,i*1);
    }
}
x2+=1;
for (int i = 30; i > 1; i--){
  



if (i % 2 == 0) {
        noFill();
ellipse(x2,400,i*10,i*10);
    }
    else {
       fill(#000000);
ellipse(x2,400,i*1,i*1);
    }
} 
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
