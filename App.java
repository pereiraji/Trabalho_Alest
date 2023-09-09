public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Algoritmo 1: ");
        for(int i = 0; i<=30; i++){
            System.out.println("n: "+ i);
            System.out.println("Contador de operações:" + algoritmo1(i));
        }
        System.out.println(".....................................");
        System.out.println("Algoritmo 2: ");
        for(int i = 0; i<=30; i++){
            System.out.println("n: "+ i);
            System.out.println("Contador de operações:" + algoritmo2(i));
        }
        System.out.println(".....................................");
        System.out.println("Algoritmo 3: ");
        for(int i = 0; i<=30; i++){
            System.out.println("n: "+ i);
            System.out.println("Contador de operações:" + algoritmo3(i));
        }
        System.out.println(".....................................");
        System.out.println("Algoritmo 4: ");
        for(int i = 0; i<=30; i++){
            System.out.println("n: "+ i);
            System.out.println("Contador de operações:" + algoritmo4(i));
        }
        System.out.println(".....................................");
        System.out.println("Algoritmo 5: ");
        for(int i = 0; i<=30; i++){
            System.out.println("n: "+ i);
            System.out.println("Contador de operações:" + algoritmo5(i));
        }
        
    }
    
    public static int algoritmo1(int n) {
        long startTime = System.nanoTime();
        int i, j, k, res = 0;
        int cont_op = 0;
        for (i = n; i <= n + 1; i += 1) {
            for (j = n + 1; j <= n + 1; j += 1) {
                for (k = 1; k <= i * i; k += i / 2 + 1) {
                    res = res + i;
                    cont_op++;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Tempo de execução em nanosegundos:" + (endTime - startTime) );
        return cont_op;
    }

    public static int algoritmo2(int n) {
        long startTime = System.nanoTime();
        int i, j, k, res = 0;
        int cont_op = 0;
        for (i = n; i <= n + 1; i += 2) {
            for (j = n + 1; j <= n * n; j += 2) {
                for (k = i + 1; k <= 2 * n; k += 2) {
                    res = res + n * k;
                    cont_op++;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Tempo de execução em nanosegundos:" + (endTime - startTime) );
        return cont_op;
    }

    public static int algoritmo3(int n) {
        long startTime = System.nanoTime();
        int i, j, k, res = 0;
        int cont_op = 0;
        for (i = n + 1; i <= n + 1; i += 1) {
            for (j = n; j <= i + 1; j += j / 2 + 1) {
                for (k = j; k <= n * j; k += Math.abs(j - 1) + 1) {
                    res = res + n * k;
                    cont_op++;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Tempo de execução em nanosegundos" + (endTime - startTime) );
        return cont_op;
    }

    public static int algoritmo4(int n) {
        long startTime = System.nanoTime();
        int i, j, k, res = 0;
        int cont_op = 0;
        for (i = n/2; i <= n * n; i += 1) {
            for (j = 1; j <= n * n; j += i/2+1) {
                for (k = 2; k <= i * j; k += j / 2 + 1) {
                    res = res + i;
                    cont_op++;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Tempo de execução em nanosegundos:" + (endTime - startTime) );
        return cont_op;
    }

    public static int algoritmo5(int n) {
        long startTime = System.nanoTime();
        int i, j, k, res = 0;
        int cont_op = 0;
        for (i = n/2; i <= n + 1; i += 2) {
            for (j = i; j <= n * i; j += i/2+1) {
                for (k = i+1; k <= n * j; k += 1) {
                    res = res + i;
                    cont_op++;
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Tempo de execução em nanosegundos:" + (endTime - startTime) );
        return cont_op;
    }
}
