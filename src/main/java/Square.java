public class Square extends Shape{
    private int side;
    public Square(int side){
        this.side = side;
    }
    public String draw(){
        String s="";
        for(int i=0; i<this.side; ++i){
            if(i==0 || i==this.side - 1){
                for(int j=0; j<this.side; ++j){
                    s+="*";
                }
            }
            else{
                for(int j=0; j<this.side; ++j){
                    if(j==0 || j==this.side-1)
                        s+="*";
                    else
                        s+=" ";
                }
            }
            s+="\n";
        }
        return s;
    }
}
