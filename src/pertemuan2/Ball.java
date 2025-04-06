package pertemuan2;

public class Ball {
    private String color;
    private int size;
    private boolean moveStatus;

    //constructor
    public Ball(String color, int size, boolean moveStatus) {
        this.color = color;
        this.size = size;
        this.moveStatus = moveStatus;
    }



    public void move() {
        moveStatus = true;
        System.out.println("the ball is moving.");
    }


    public void stop() {
        moveStatus = false;
        System.out.println();
    }


    public void showStatus() {
        String status = moveStatus ? "moving" : "not moving";
        System.out.println("the ball is currently" + status);
    }


    public void showColor() {
        System.out.println("the color of the ball is" + color);
    }


    public void showSize() {
        System.out.println("the size of the ball is" + size);
    }

}