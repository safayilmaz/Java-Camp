package northwind.northwind.core.utilities.results;

public class ErrorDataResult<T> extends DataResult{

    //Returns data,message and false
    public ErrorDataResult(T data, String message) {
        super(data, false, message);
    }

    //Returns only data and false
    public ErrorDataResult(T data) {
        super(data, false);
    }

    //Returns only message and false
    public ErrorDataResult(String message) {
        super( null, false, message);
    }

    //Returns only false
    public ErrorDataResult() {
        super( null, false);
    }
}
