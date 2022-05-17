package matrix_flatten;


public class main {
    public static void main(String[] args) {
        double [][][] testMatrix = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            },
        };
        
        Matrix_Flatten matrix = new Matrix_Flatten(testMatrix);
        
        System.out.println(matrix.getElement(0, 0, 2));
        
    }
}
