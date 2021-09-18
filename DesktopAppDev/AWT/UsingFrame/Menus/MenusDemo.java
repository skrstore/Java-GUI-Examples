import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

class MenusDemo{
    public static void main(String[] args) {
        Frame f1 = new Frame("Menus Demo");
        MenuBar menubar1 = new MenuBar();
        Menu menu1= new Menu("Main Menu");
        Menu submenu1 = new Menu("Sub Menu");
        MenuItem mi1 = new MenuItem("Item 1");
        MenuItem mi2 = new MenuItem("Item 2");
        MenuItem mi3 = new MenuItem("Item 3");
        MenuItem mi4 = new MenuItem("Item 4");
        MenuItem mi5 = new MenuItem("Item 5");
        
        menu1.add(mi1);
        menu1.add(mi2);
        menu1.add(mi3);
        submenu1.add(mi4);
        submenu1.add(mi5);
        menu1.add(submenu1);
        menubar1.add(menu1);
        
        f1.setBackground(Color.PINK);
        f1.setMenuBar(menubar1);
        f1.setSize(400, 400);
        f1.setLayout(null);
        f1.setVisible(true);
    }
}