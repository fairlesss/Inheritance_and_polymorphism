public class FigureException extends Exception {
    private int number;

    public int getNumber() {
        return number;
    }

    public FigureException(String message, int number) {
        super(message);
        this.number = number;
    }
}
