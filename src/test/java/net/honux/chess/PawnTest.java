package net.honux.chess;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

class PawnTest {

    @Test
    @DisplayName("폰 생성자 테스트")
    public void create() {
        verifyPawn("White");
        verifyPawn("Black");
    }

    public void verifyPawn(String color){
        Pawn pawn = new Pawn(color);
        assertThat(pawn.getColor()).isEqualTo(color);
    }
}