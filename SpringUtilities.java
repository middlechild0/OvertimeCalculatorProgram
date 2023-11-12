import javax.swing.Spring;
import javax.swing.SpringLayout.Constraints;
import java.awt.Container;

public class SpringUtilities {
    public static void makeCompactGrid(Container parent,
                                       int rows, int cols,
                                       int initialX, int initialY,
                                       int xPad, int yPad) {
        SpringLayout layout;
        try {
            layout = (SpringLayout) parent.getLayout();
        } catch (ClassCastException exc) {
            System.err.println("The first argument must use SpringLayout.");
            return;
        }

        Spring xPadSpring = Spring.constant(xPad);
        Spring yPadSpring = Spring.constant(yPad);
        Spring initialXSpring = Spring.sum(layout.getConstraint(SpringLayout.WIDTH, parent), Spring.constant(-initialX));
        Spring initialYSpring = Spring.sum(layout.getConstraint(SpringLayout.HEIGHT, parent), Spring.constant(-initialY));
        Spring width = layout.getConstraints(parent).getWidth();
        Spring height = layout.getConstraints(parent).getHeight();
        Spring maxWidth = layout.getConstraints(parent).getWidth();
        Spring maxHeight = layout.getConstraints(parent).getHeight();

        Constraints cons = layout.getConstraints(parent);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int rowPad = row == 0 ? initialY : yPad;
                int colPad = col == 0 ? initialX : xPad;
                cons.setX(Spring.sum(initialXSpring, Spring.sum(Spring.mult(Spring.constant(col), width), Spring.mult(colPad, Spring.constant(col)))));
                cons.setY(Spring.sum(initialYSpring, Spring.sum(Spring.mult(Spring.constant(row), height), Spring.mult(rowPad, Spring.constant(row)))));
                cons.setWidth(width);
                cons.setHeight(height);

                if (row == rows - 1) {
                    cons.setY(Spring.sum(cons.getY(), yPadSpring));
                }
                if (col == cols - 1) {
                    cons.setX(Spring.sum(cons.getX(), xPadSpring));
                }
            }
        }

        cons.setMaxWidth(maxWidth);
        cons.setMaxHeight(maxHeight);
    }
}
