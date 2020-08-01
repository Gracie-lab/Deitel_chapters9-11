public class PieceWorker extends Employee {
    private double wage;
    private int pieces;
    public PieceWorker(double wage, int pieces){
        this.wage = wage;
        this.pieces = pieces;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    @Override
    public double getEarnings() {
        return wage * pieces;
    }

    @Override
    public String toString() {
        return "PieceWorker{" +
                "wage=" + wage +
                ", pieces=" + pieces +
                '}';
    }
}
