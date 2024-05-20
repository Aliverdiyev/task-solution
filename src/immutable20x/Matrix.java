package immutable20x;

public final class Matrix {
    private final int rows;
    private final int columns;
    private final double[][] data;
    private final String type;
    private final boolean isSingular;

    public Matrix(int rows, int columns) {
        this(rows, columns, "");
        System.out.println("matrix 0");
    }

    public Matrix(int rows, int columns, String type) {
        this(rows, columns, type, false); // Assuming initially not singular
        System.out.println("matrix 1");
    }

    public Matrix(int rows, int columns, String type, boolean isSingular) {
        if (rows <= 0 || columns <= 0) {
            throw new IllegalArgumentException("Matrix dimensions must be positive");
        }
        this.rows = rows;
        this.columns = columns;
        this.type = type;
        this.isSingular = isSingular;
        this.data = new double[rows][columns];
        System.out.println("matrix 2");
    }

    // Getters
    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public double[][] getData() {
        return data;
    }

    public String getType() {
        return type;
    }

    public boolean isSingular() {
        return isSingular;
    }
}