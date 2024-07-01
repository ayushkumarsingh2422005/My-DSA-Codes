static int febbo(int n) {
    if (n == 0) {
        return 0;
    }
    if (n == 1) {
        return 1;
    }
    return febbo(n - 1) + febbo(n - 2);
}

public static void main(String[] args) {
    System.out.println(febbo(5));
}
