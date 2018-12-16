package net.ddns.djeezuss.cards;

import net.ddns.djeezuss.Board;
import net.ddns.djeezuss.enums.CardTypeEnum;

public class VaccineCard extends ACard {
    public VaccineCard(String cardTitle) {
        this.cardTitle = cardTitle;
        this.cardType = CardTypeEnum.VACCINE;
    }

    @Override
    public String describe() {
        return null;
    }

    @Override
    public boolean playCard(Board board) {
        return false;
    }
}
