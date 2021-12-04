package recursion.tilingFloor;

//https://www.youtube.com/watch?v=NyICqRtePVs&list=PLqM7alHXFySGbXhWx7sBJEwY2DnhDjmxm&index=19
public class tileFloor {
    static int count;
    public static void main(String[] args) {
        int n=4;
        System.out.println("Total no of ways "+floorTiling(n));

    }

    public static int floorTiling(int n)
    {
        if(n==1 || n==2) return n;

        count=floorTiling(n-1)+floorTiling(n-2);
        return count;

    }
}
