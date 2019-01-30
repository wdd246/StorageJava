package kolokwium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Adam Małota
 */
public class Shelf {
    protected List <Box> list = new ArrayList();
    
    public void add(Box box){
        if(box!=null){
            list.add(box);
        }
        else{
            throw new IllegalArgumentException("Bład podania pudełka");
        }
    }
    
    public void remove(String name){
        Iterator<Box> iter = list.iterator();
        while(iter.hasNext()){
            if(iter.next().getName().equals(name)){
                iter.remove();
            }
        }
    }
    
    public void print(){
        for(Box box : list){
            System.out.println("Nazwa- "+box.getName()+", Szerokość- "+box.getWidth());
        }
    }
    
    public int totalWidth(){
        int width=0;
        for(Box box : list){
            width+=box.getWidth();
        }
        return width;
    }
    
}
