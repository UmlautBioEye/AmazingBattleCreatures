package com.example.mrb.amazingbattlecreatures;

/**
 * Created by PBuskell on 08/03/2016.
 */
public class CyberBattleCreature extends BattleCreature
{
    private int intCyberAttackAmount;

    public CyberBattleCreature(String strName_PARAM,
                               int intHitPoints_PARAM,
                               int intDefenceRating_PARAM,
                               int intOffenceRating_PARAM,
                               int intCyberAttackAmount_PARAM)
    {
        // Call the Constructor of the parent class using the keyword "super". This will set the
        //   values for most of the variables (except intCyberAttackAmount)
        super(strName_PARAM, intHitPoints_PARAM, intDefenceRating_PARAM, intOffenceRating_PARAM);

        // We need to set the new data variable here, since the parent class constructor can't
        //   handle it.
        this.intCyberAttackAmount = intCyberAttackAmount_PARAM;
    }

    public void cyberAttack(BattleCreature battcreatOpponent_PARAM)
    {
        if (!battcreatOpponent_PARAM.isDefeated())
        {
            // We attack the opponent with our new intCyberAttackAmount!
            battcreatOpponent_PARAM.defend(intCyberAttackAmount);
            strLastAction = strName + " has delivered a " + intCyberAttackAmount
                    + "-point cyber attack!\n";
        }

        if(battcreatOpponent_PARAM.isDefeated())
        {
            // We call the blnHasWon() method on our opponent using the "super" keyword
            blnHasWon = true;
        }
        else
        {
            blnHasWon = false;
        }
    }

}
