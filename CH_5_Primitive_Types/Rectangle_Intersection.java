package CH_5_Primitive_Types;

/* Write a program which tests if two rectangles have a nonempty 
intersection. If the intersection is nonempty, return the rectangle formed by 
their intersection. */

    class Rectangle {
        int x, y, width, height;

        public Rectangle(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        void display() {
            System.out.println(" x: " + x + ", y: " + y + ", width: " + width + ", hight: " + height);
        }
    }

    public class Rectangle_Intersection {
        public static Rectangle intersectRectangle(Rectangle R1, Rectangle R2) {
            if (!isIntersect(R1, R2)) {
                return new Rectangle(0, 0, -1, -1); // No intersection.
            }
            // At which point rectangle are intersect
            return new Rectangle(Math.max(R1.x, R2.x), Math.max(R1.y, R2.y),
                    Math.min(R1.x + R1.width, R2.x + R2.width) - Math.max(R1.x, R2.x),
                    Math.min(R1.y + R1.height, R2.y + R2.height) - Math.max(R1.y, R2.y));
        }

        // rectangle are intersect or not intersect
    public static boolean isIntersect(Rectangle Rl, Rectangle R2) {
            return Rl.x <= R2.x + R2.width && Rl.x + Rl.width >= R2.x && Rl.y <= R2.y + R2.height
                    && Rl.y + Rl.height >= R2.y;
    }

    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(2, 3, 4, 5);
        R1.display();
        Rectangle R2 = new Rectangle(4, 5, 10, 12);
        R2.display();
        boolean result = isIntersect(R1, R2);
        //rectangle are intersect or not intersect
        if(result) {
        System.out.println(" Rectangles are intersect.");
        }
        else {
            System.out.println(" Rectangles are not intersect.");
        }
        //At which point rectangle are intersect 
        Rectangle R3 = intersectRectangle(R1, R2);
        R3.display();
        }
    }     

