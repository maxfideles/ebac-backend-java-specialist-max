public class GenericClass<T,E> {
    private T data;
    private E id;

    //Constructor Generic
    public  GenericClass(T data, E id){
        this.data = data;
        this.id = id;
    }

    public T getData(){
        return data;
    }

    public E getId(){
        return id;
    }
}
