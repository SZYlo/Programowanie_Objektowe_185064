public class Box {

    int value;

    public Box(int value) {
        this.value = value;
    }
}

void main() {
    Box a = new Box(10);
    Box b = a;
    Box c = new Box(a.value);

    b.value = 20;
    c.value = 30;

    System.out.println(a.value);
    System.out.println(b.value);
    System.out.println(c.value);

    System.out.println(a == b);
    System.out.println(a == c);
}




    //       a i b mają referencję do tego samego obiektu
    //       c tworzy nowy obiekt z wartością z obiektu a (tworzy kopię)

//    a   --
//        |     --      Box
//    b      --
//
//    c      --      Box o wartości skopiowanej z boxa powyżej