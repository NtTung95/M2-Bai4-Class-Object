public class Fan {
    public final int SLOW = 1,MEDIUM = 2,FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return speed;
    }
    public boolean getOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean status){
        this.on = status;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(){
    }


    public String toString(){
        if(this.on){
            return "Speed is: " + speed + ", Color is: " + color + ", Radius is: " + radius + ", fan is on";
        } else {
            return "fan is off";
        }
    }
}


