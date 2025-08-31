package U1.EjerciciosRepaso;

public class zEjerciciosVariasLetras {
    public static void main(String[] args) {
        /*
        E
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((j == 1) || (i == 1) || (i == altura / 2 + 1) || (i == altura)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        H
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((j == 1) || (i == altura / 2 + 1) || (j == altura)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        Y
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((i == j && i <= altura / 2 + 1) || (i + j == altura + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        N
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {

                if ((j == 1) || (j == altura) || (i == j)) {
                    System.out.print("*");
                } else {

                    if ((j == 1) || (j == altura) || (i == j)) {
                        System.out.print("*");
                    } else {

                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

            System.out.println();

            M
            //for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {

                if ((j == 1) || (j == altura) || (i == j && i <= altura / 2 + 1) || (i + j == altura + 1 && i <= altura / 2 + 1)) {
                    System.out.print("*");
                } else {

                    if ((j == 1) || (j == altura) || (i == j && i <= altura / 2 + 1) || (i + j == altura + 1 && i <= altura / 2 + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        System.out.println();

        V
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura * 2 - 1; j++) {
                if (i == j || j == altura * 2 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        U
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((i == altura) || (j == 1) || (j == altura)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        G
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((j == 1) || ((i == 1 || i == altura) && j < altura) || (j == altura && i > altura / 2) || (i == altura / 2 + 1 && j > altura / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        F
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((j == 1) || (i == 1) || (i == (altura / 2) + 1 && j <= altura / 2 + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        A
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == (altura + 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        //B
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j < altura; j++) {
                if (i == 1 || i == altura || i == (altura + 1) / 2 || j == 1 || j == altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if (i != 1 && i != altura && i != (altura + 1) / 2) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        //D
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if (j == 1 || ((i == 1 || i == altura) && j <= altura - 1) || (j == altura && i >= 2 && i <= altura - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //I
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((j == (altura / 2) + 1) || (i == 1) || (i == altura)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //J
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((i == 1) || j == altura || (i == altura && j >= altura / 2) || (i >= altura / 2 + 1 && j == altura / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //R
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if (j == 1 || (i == 1 && j < altura) || (i == altura / 2 && j < altura) || (j == altura && i <= altura / 2) || (i == j && i > altura / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //P
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if (j == 1 || (i == 1 && j < altura) || (i == altura / 2 && j < altura) || (j == altura && i <= altura / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //S
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((i == 1 || i == altura || i == altura / 2 + 1)
                        || (i < altura / 2 + 1 && j == 1)
                        || (i > altura / 2 + 1 && j == altura)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //K
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (j == 0 || (i == j && j >= altura / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();


        //0
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= ancho; j++) {
                if ((i == 1) || (j == 1) || (j == ancho) || (i == altura)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //2
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= ancho; j++) {
                // Condiciones para imprimir asteriscos
                if (i == 1 || i == altura || (i <= altura / 2 && j == ancho) || (i > altura / 2 && j == 1) || (i == altura / 2 + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Espacios en blanco
                }
            }
            System.out.println(); // Cambio de línea al final de cada fila
        }

        System.out.println();
        //3
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= ancho; j++) {
                if (i == 1 || i == altura || j == ancho || i == ancho / 2 + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //4
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= ancho; j++) {
                if ((j == altura) || (i <= altura / 2 && j == 1) || (i == altura / 2 && j <= ancho) || (j == ancho)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();


        //5
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if ((i == 1 || i == altura || i == altura / 2)
                        || (i < altura / 2 && j == 1)
                        || (i > altura / 2 && j == altura)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //7
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= ancho; j++) {
                if ((i == 1) || (i + j == altura)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //8
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= ancho; j++) {
                if ((i == 1) || (j == 1) || (j == ancho) || (i == altura) || (i == altura / 2 + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        //9
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= ancho; j++) {
                if ((i == 1 || i == altura || i == altura / 2 + 1) || (j == ancho) || (j == 1 && i <= altura / 2)) {
                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
         */
    }
}
