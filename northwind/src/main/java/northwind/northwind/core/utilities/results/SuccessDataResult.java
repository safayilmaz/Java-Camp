package northwind.northwind.core.utilities.results;

public class SuccessDataResult<T> extends DataResult{

    //Returns data,message and true
    public SuccessDataResult(T data, String message) {
        super(data, true, message);
    }

    //Returns only data and true
    public SuccessDataResult(T data) {
        super(data, true);
    }

    //Returns only message and true
    public SuccessDataResult(String message) {
        super( null, true, message);
    }

    //Returns only true
    public SuccessDataResult() {
        super( null, true);
    }

}
