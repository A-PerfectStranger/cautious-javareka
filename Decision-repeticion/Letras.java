class Letras {
   
    public static void dibujarLetraA(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 || j == 0 || j == (int) (column / 2) + 1) {
                    System.out.print("*");
                }
            } 
            System.out.println();
        }
    }


    public static void dibujarLetraE(int row, int column) {
        for (int i = 1; i <= column; i++) {
            for (int j = 1; j <= row; j++) {
                if (j == 2 || i == 1 || i == column || i == (int) (column / 2) + 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void dibujarLetraL(int row, int column) {
        for (int i = 1; i <= column; i++) {
            for (int j = 0; j < row; j++) {
                if (j == 1 || i == column) {
                    System.out.print("*");
                } 
            }
            System.out.println();
        }
    }

    public static void dibujarLetraI(int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 || i == column - 1 || j == column / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}