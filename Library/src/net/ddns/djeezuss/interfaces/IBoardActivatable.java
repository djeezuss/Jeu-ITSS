package net.ddns.djeezuss.interfaces;

import net.ddns.djeezuss.Board;
import net.ddns.djeezuss.cards.ACard;

public interface IBoardActivatable {
    ACard[] getTargets();
    void activate(Board board);
}
