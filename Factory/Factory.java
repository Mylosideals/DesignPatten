
public class Factory {
    public Furit CreatFruit(String Kind){
        if(Kind.equals("A"))
            return new Apple();
        if(Kind.equals("B"))
            return new Banana();
        return null;
    }
}
