package kolokwium;

/**
 *
 * @author Adam Małota
 */
public class Kolokwium {

    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        Box box;
        
        try{
            shelf.add(new Box("",0));
            shelf.add(null);
        }
        catch(IllegalArgumentException e){
            System.err.printf("Złe dane");
        }        
        
        shelf.add(new Box("Kasztany",100));
        shelf.add(new Box("Kubek",50)); 
        shelf.add(new Box("Jabłka",200));
        shelf.add(new Box("Kubek",50)); 
        shelf.print();
        System.out.println("Suma szerokości: "+shelf.totalWidth());
        
        System.out.println();
        
        shelf.remove("Kasztany");
        shelf.remove("Kubek");
        shelf.print();
        System.out.println("Suma szerokości: "+shelf.totalWidth());

    }
    
}
