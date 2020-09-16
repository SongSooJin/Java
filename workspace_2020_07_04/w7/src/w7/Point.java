package w7;

public class Point {
     private int x;
     private int y;
     public int getY(){  return y;}
     public int getX(){  return x;}
     public Point(int x, int y){ this.x=x;  this.y=y;    }
     public void show(){
    	System.out.printf("x : %2d\ty : %2d\n",x,y);
     }
}
