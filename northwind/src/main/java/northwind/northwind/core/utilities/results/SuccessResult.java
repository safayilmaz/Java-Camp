package northwind.northwind.core.utilities.results;

public class SuccessResult extends Result{

    public SuccessResult(boolean b, String s){
        super(true);
    }
    public SuccessResult(String message){
        super(true,message);
    }
}
