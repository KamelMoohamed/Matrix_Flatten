package matrix_flatten;


public class Matrix_Flatten {
    final private int width, height, depth, vectorLength;
    private double [][][] matrix;
    private double [] vector;
    
    public Matrix_Flatten(double [][][] matrix){
        this.width = matrix.length;
        this.height = matrix[0].length;
        this.depth = matrix[0][0].length;
        this.vectorLength = this.height * this.width * this.depth;
        
        this.matrix = matrix;
        flatten();
    };
    public Matrix_Flatten(double [] vector, int width, int height, int depth){
        this.vector = vector;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.vectorLength = vector.length;
    };
    
    
    public void flatten() {
        this.vector = new double[this.vectorLength];
        int counter = 0;
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height; j++) {
                for (int k = 0; k < this.depth; k++) {
                    int y = (k * width * height) + (j * width) + i;
                    this.vector[y] = this.matrix[i][j][k];
                }
            }
        }
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public int getDepth(){
        return this.depth;
    }
    
    public int getVectorLength(){
        return this.vectorLength;
    }
    
    public int getVectorIndex(int i, int j, int k){
        return (k * width * height) + (j * width) + i;
    }
    
    public double getElement(int i, int j, int k){
        try{
            double l = this.vector[getVectorIndex(i, j, k)];
            return this.vector[getVectorIndex(i, j, k)];
        }catch(Exception E){
            System.out.println("Not a right position");
            return -1;
        }
    }
    
    public double [] getVector(){
        return this.vector;
    }
    
}