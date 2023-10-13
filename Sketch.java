import processing.core.PApplet;

public class Sketch extends PApplet {
	
	

  public void settings() {
	// Size of picture
    size(400, 400);
  }
  public void setup() {
  }
  public void draw() {
	  
        float flowerW = random(50, width -50);
        float flowerH = random(50, height - 50);
        float petalSize = (90);
        float petalDistance = petalSize / 2;
        
        if (flowerW <= 150 || flowerH <= 150) background(0, 200, 265);
        else if (flowerW >= 200 && flowerH >= 200)fill(40, 25, 75);
        else background(265,200,0);
        
        
        fill(255, 128, 0);

        // flower stem 
        if (flowerH >= 125 && flowerW >= 125) fill(150, 50, 0);
        else if (flowerW >= 225 && flowerH >= 225)fill(190, 0, 265);
        else fill(45, 55, 65);
        stroke(256);
        rect(flowerW-10, flowerH+88, petalSize-70, petalSize);

        // top left petal
        if (flowerW >= 260 || flowerH >=260) fill(250, 200, 150);
        else if (flowerW >= 150 && flowerH >= 150)fill(40, 265, 0);
        else fill(60, 0, 120);
        stroke(256);
        ellipse(flowerW - petalDistance, flowerH - petalDistance+40,
                petalSize, petalSize);
        
        // top right petal
        if (flowerW >= 260 || flowerH >=260) fill(265, 0, 265);
        else if (flowerW <= 150 && flowerH <= 150)fill(80, 120, 50);
        else fill(0, 265, 0);
        stroke(256);
        ellipse(flowerW + petalDistance, flowerH - petalDistance+40,
                petalSize, petalSize);
        
        // bottom left petal
        if (flowerW >= 260 || flowerH >=260) fill(50, 40, 30);
        else if (flowerW <= 150  && flowerH <= 150)fill(40, 120, 220);
        else fill(19, 119, 219);
        stroke(256);
        ellipse(flowerW - petalDistance+45, flowerH + petalDistance,
                petalSize, petalSize);
        
        // bottom right petal
        if (flowerW >= 260 || flowerH >=260) fill(90, 120, 150);
        else if (flowerW >= 150 && flowerH >= 150)fill(50, 100, 26);
        else fill(100, 0, 100);
        stroke(256);
        ellipse(flowerW + petalDistance-45, flowerH + petalDistance-100,
                petalSize, petalSize);
        
        fill(255, 0, 0);
        
        // center petal
        stroke(256);
        if (flowerW >= 200 && flowerH >=200) fill(150, 225, 100);
        else if (flowerW >= 250 && flowerH >= 250)fill(0, 0, 265);
        else fill(0,50,100);
        ellipse(flowerW, flowerH-2,
                petalSize, petalSize); 
                
        stop();
  }

}