public class Square implements Shape{
    private int length;

    public Square(int length){
        this.length = length;
    }

    public String draw(){
        StringBuilder draw = new StringBuilder();
        for(int i = 0; i < this.length; i++){
            for(int j = 0; j< this.length; j++){
                if(i == 0 || j == 0 || i == this.length-1 || j == this.length-1){
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
