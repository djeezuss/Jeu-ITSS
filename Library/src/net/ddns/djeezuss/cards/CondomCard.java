package net.ddns.djeezuss.cards;

import net.ddns.djeezuss.Board;
import net.ddns.djeezuss.enums.CardTypeEnum;

public class CondomCard extends AntiCondomCard {
    public CondomCard() {
        super("Condom");
        this.cardType = CardTypeEnum.CONDOM;
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
