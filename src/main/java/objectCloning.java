public class objectCloning {

    //Shallow copy
    //Deep copy
    //Cloning
    public static void main(String[] args) throws CloneNotSupportedException {

        //Shallow copy
        A obj = new A();
        obj.i = 5;
        obj.j = 6;
        System.out.println(obj);

        A obj1 = new A();
        System.out.println(obj1);

        A obj2 = obj;
        obj2.j = 8;
        //Observe value of obj also haschanged to 8
        System.out.println(obj);
        System.out.println(obj2);

        //DEEPCOPY
        A obj3 = new A();
        obj3.i = obj.i;
        obj3.j = obj.j;
        System.out.println("Obj3 " + obj3);

       // A objClone = (A) obj.clone();


    }
}


class A implements Cloneable{
    int i, j;

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}

