package net.ddns.djeezuss.cards;

import net.ddns.djeezuss.Board;
import net.ddns.djeezuss.enums.CardTypeEnum;
import net.ddns.djeezuss.interfaces.IBoardActivatable;

@SuppressWarnings("FieldCanBeLocal")
public class InfectionCard extends ACard implements IBoardActivatable {
    private boolean played = false;
    private int requiredAgar;

    private int attackDie;
    private int attackBonus;
    private int defenseDie;
    private int defenseBonus;


    public InfectionCard(String cardTitle, int requiredAgar, int attackDie, int attackBonus, int defenseDie, int defenseBonus) {
        this.cardTitle = cardTitle;
        this.cardType = CardTypeEnum.INFECTION;

        this.requiredAgar = requiredAgar;
        this.attackDie = attackDie;
        this.attackBonus = attackBonus;
        this.defenseDie = defenseDie;
        this.defenseBonus = defenseBonus;
    }

    @Override
    public String describe() {
        return null;
    }

    @Override
    public boolean playCard(Board board) {
        return false;
    }

    @Override
    public ACard[] getTargets() {
        return null;
    }

    @Override
    public void activate(Board board) {

    }
}
