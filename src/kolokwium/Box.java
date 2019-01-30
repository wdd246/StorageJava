package kolokwium;

/**
 *
 * @author Adam Małota
 */
public class Box {
    
    private String name;
    private int width;
 
    Box(){
        
    }
    
    Box(String name, int width){
        setName(name);
        setWidth(width);
    }
    
    String getName(){
        return name;
    }
    
    void setName(String name){
        if(name!=null && !name.equals("")){
            this.name=name;
        }
        else{
            throw new IllegalArgumentException("Zła nazwa pudełka");
        }
    }
    
    int getWidth(){
        return width;
    }
    
    void setWidth(int width){
        if(width>0){
            this.width=width;
        }
        else{
            throw new IllegalArgumentException("Zła szerokość");
        }
    }
    
}
