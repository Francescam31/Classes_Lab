public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    int area(){
        return this.length * this.width;
    }

    boolean isRectangle(){
        return this.length == this.width;
    }
}
