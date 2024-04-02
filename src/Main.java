import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        test1();
    }

    public static void test1 ()
    {
        Frog testFrog = new Frog(new Point(0, 0), 1);
        Frog testFrog2 = new Frog(0, 0, 100);
        int n = 3;
        Point[] route = new Point[n];
        route[0] = new Point(2, 0);
        route[1] = new Point(1, 1);
        route[2] = new Point(0, 1);




        for (int i = 0; i < route.length; i++) {
            double d = Point.calcDistance(testFrog.place, route[i]);
            if( d<= testFrog.tongueLength)
            {
                System.out.println("кузнечек съеден в "+(i+1) +" точке");
                break;
            }
        }


    }
    public static Frog frogByUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите координаты лягушки и длину ее языка");
        Point frogpoint = new Point(sc.nextInt(), sc.nextInt());
        int length = sc.nextInt();
        Frog newFrog = new Frog(frogpoint, length);
        return newFrog;
    }

    public static Point[] getRouteFromUser(int length) {
        Scanner sc = new Scanner(System.in);
        Point[] route = new Point[length];
        System.out.println("Введите маршрут:");
        for (int i = 0; i < length; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            route[i] = new Point(x, y);
        }
        return route;
    }
    //TODO:
    //1 сделать функцию, которая спрашивает у пользователя координаты и длину языка и выдает в
    //  качестве результата новую Лягушку
    //2 сделать функцию, которая спрашивает у пользователя длину маршрута, затем запраивает
    //  много точек в виде пар координат
    //  результат этой функции - массив Точек
    //3 сделать функцию, которая проверяет проверяет работу вышеописанных функций
    //  и запускает проверку выживания кузнечика
}

class Point{
    int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("вызван конструктор точки с параметрами "+x+"; "+y);
    }

    public static double calcDistance(Point p1, Point p2){
        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y));
    }
}

class Frog {
    Point place;
    int tongueLength;

    public Frog(Point place, int tongueLength) {
        this.place = place;
        this.tongueLength = tongueLength;
        System.out.println("вызван конструктор Frog с 2 параметрами");
    }


}