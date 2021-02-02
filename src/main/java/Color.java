public enum Color {
    RED, GREEN, Blue, Yellow, Black;

    public static void main(String[] args) {
        System.out.println(Color.RED);
        Color[] colors = Color.values();
        for (Color c : colors)
            System.out.println(c.toString() + " " + c.ordinal());
    }
}
