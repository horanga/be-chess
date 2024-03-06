package piece;

import java.util.Objects;

public class Pawn extends Piece {

    public Pawn(Pieces pieces) {

        this.color = pieces.getColor();
        this.logo = pieces.getPresentation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pawn pawn = (Pawn) o;
        return Objects.equals(color, pawn.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

}
