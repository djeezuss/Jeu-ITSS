package net.ddns.djeezuss.cards;

import net.ddns.djeezuss.Board;
import net.ddns.djeezuss.enums.CardTypeEnum;

@SuppressWarnings("WeakerAccess")
public abstract class ACard {
    protected String cardTitle;
    protected CardTypeEnum cardType;

    public final String getCardTitle() {
        return cardTitle;
    }

    public final CardTypeEnum getCardType() {
        return cardType;
    }

    public abstract String describe();

    public abstract boolean playCard(Board board);
}
