package folders.returnObject;

public class ObjectReturn {

    int a;

    ObjectReturn(int i) {
        a = i;
    }

    public ObjectReturn incrementByTen() {
        ObjectReturn obj = new ObjectReturn(a + 10);
        return obj;
    }

}
