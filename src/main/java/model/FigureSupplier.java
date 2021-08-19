package model;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        final int randomLimit = 101;
        final int parametrsCount = 3;
        final int[] finalInt = new int[parametrsCountnt];
        for (int i = 0; i < parametrsCount; i++) {
            finalInt[i] = random.nextInt(randomLimit) + 1;
        }
        switch (random.nextInt() % 5) {
            case (0):
                return new Circle(finalInt, colorSupplier.getRandomColor());
            case (1):
                return new IsoscelesTrapezoid(finalInt, colorSupplier.getRandomColor());
            case (2):
                return new Rectangle(finalInt, colorSupplier.getRandomColor());
            case (3):
                return new RightTriangle(finalInt, colorSupplier.getRandomColor());
            default:
                return new Square(finalInt, colorSupplier.getRandomColor());
        }
    }
}
