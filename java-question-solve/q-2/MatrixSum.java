import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MatrixSum {
  public static void main(String[] args) {
    int[][] matrix1 = readMatrixFromFile("A.txt");
    int[][] matrix2 = readMatrixFromFile("B.txt");
    int[][] result = addMatrices(matrix1, matrix2);
    writeMatrixToFile(result, "C.txt");
  }

  public static int[][] readMatrixFromFile(String fileName) {
    int[][] matrix = new int[3][4];
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      for (int i = 0; i < 3; i++) {
        String[] line = br.readLine().split(" ");
        for (int j = 0; j < 4; j++) {
          matrix[i][j] = Integer.parseInt(line[j]);
        }
      }
    } catch (IOException e) {
      System.out.println("Error reading from file: " + e.getMessage());
    }
    return matrix;
  }

  public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
    int[][] result = new int[3][4];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 4; j++) {
        result[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }
    return result;
  }

  public static void writeMatrixToFile(int[][] matrix, String fileName) {
    
    try (FileWriter fw = new FileWriter(fileName)) {
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
          fw.write(matrix[i][j] + " ");
        }
        fw.write("\n");
      }
    } catch (IOException e) {
      System.out.println("Error writing to file: " + e.getMessage());
    }
  }
}
