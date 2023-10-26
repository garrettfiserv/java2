public class Rectangle implements Shape{
    private int length;
    private int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public String draw(){
        StringBuilder draw = new StringBuilder();
        for(int i = 0; i<this.width;i++){
            for(int j = 0; j< this.length; j++){
                if(i == 0 || j == 0 || i == this.width-1 || j == this.length-1){
                    draw.append("*");
                }else{
                draw.append(" ");
            }
            }
            draw.append("\n");
        }
        return draw.toString();
    }
}
