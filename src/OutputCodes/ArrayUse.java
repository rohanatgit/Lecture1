package OutputCodes;

 class ArrayUse {
    public static void main(String[] args) {
        int[] A = numbers();
        System.out.println(A);
    }

    public static int[] numbers() {
        int[] A = new int[3];
        A[0] = 2;
        A[1] = 3;
        A[2] = 4;
        return A;
    }
}