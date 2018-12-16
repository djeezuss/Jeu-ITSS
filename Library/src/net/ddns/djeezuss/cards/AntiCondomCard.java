package net.ddns.djeezuss.cards;

import net.ddns.djeezuss.Board;
import net.ddns.djeezuss.enums.CardTypeEnum;

public class AntiCondomCard extends ACard {
    public AntiCondomCard(String cardTitle) {
        this.cardTitle = cardTitle;
        this.cardType = CardTypeEnum.ANTICONDOM;
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
