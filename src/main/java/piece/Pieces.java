package piece;

public enum Pieces {

    BLACKPAWN("black", "P"),

    WHITEPAWN("white", "p"),
    NONE("NONE", ".");


    final private String color;
    final private String presentation;

    Pieces(String color, String presentation) {
        this.color = color;
        this.presentation = presentation;
    }

    public String getColor() {
        return color;
    }

    public String getPresentation() {
        return presentation;
    }
}
