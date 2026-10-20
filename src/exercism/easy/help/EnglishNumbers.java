package exercism.easy.help;

public enum EnglishNumbers {
    ONE(1),
    TWO(2),
    THREE(3);

    private int value;
    EnglishNumbers(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
