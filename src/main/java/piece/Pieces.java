package piece;

public enum Pieces {

    BLACKPAWN("P"),

    WHITEPAWN("p"),
    NONE(".");

    final private String presentation;

    Pieces(String presentation) {
        this.presentation = presentation;
    }

    public String getPresentation() {
        return presentation;
    }
}
