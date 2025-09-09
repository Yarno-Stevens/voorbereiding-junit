package nl.han.ica.oose.dea.testedfizzbuzz;

public class FizzBuzzExecutor {

    public String execute(int i){
        if (i % 3 == 0){
            return "Fizz";}
        else {
            return String.valueOf(i);
        }
    }
}
