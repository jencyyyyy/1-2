package OtherSet;
import java.io.PrintStream;

public class Grid{

    public Grid(int par, int par1) {
    }

public static void main(String[] args)
{
Grid grid = new Grid(3, 4);

grid.add(2, 1, "shoe");
grid.add(1, 2, "tree");
grid.add(0, 1, "car");

System.out.println(grid.getDescription(0, 1));
System.out.println("Expected: car");
System.out.println(grid.getDescription(1, 2));
System.out.println("Expected: tree");
System.out.println(grid.getDescription(2, 1));
System.out.println("Expected: shoe");
/*ERROR
for
        (Grid.Location location() : grid.getDescribedLocations())
{
    PrintStream println = System.out.print(location.getRow() + "," + location.getColumn() + " ");
}
*/
System.out.println();

System.out.println("Expected: 0,1 1,2 2,1 ");
}

    private void add(int i, int i0, String shoe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean getDescription(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void getDescribedLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Location {

        public Location() {
        }
    
    }
}
