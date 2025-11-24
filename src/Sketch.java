import processing.core.PApplet;

public class Sketch extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }

    @Override
    public void settings() {
        size(1000, 300);  
    }

    @Override
    public void setup() {
        background(120, 197, 227);  // Cyan background

        float currentX = 0;  // Counter to keep track of x position

        // Loop to draw bubbles until the width of the canvas is filled
        while (currentX < width) {
            float bubbleDiameter = drawBubble(currentX, height / 2);  // Draw random bubble and get its diameter
            currentX += bubbleDiameter;  // Move to the right edge of the last bubble
        } 

    }

    /**
     * Draws a bubble at the specified (x, y) position with a random diameter and light colour.
     * @param x the x position, left edge of the bubble
     * @param y the y position, centre of the bubble
     * @return the diameter of the drawn bubble
     */
    private float drawBubble(float x, float y) {
        float bubbleDiameter = random(20, 100);  // Random diameter between 20 and 100
        fill(random(240, 255));  // Random light colour
        noStroke();
        ellipse(x + bubbleDiameter / 2, y, bubbleDiameter, bubbleDiameter);  // Draw bubble centered at (x + radius, y)
        
        return bubbleDiameter;  // Return the randomly generated diameter for spacing
    }

}
