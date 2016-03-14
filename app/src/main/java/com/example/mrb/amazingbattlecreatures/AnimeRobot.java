package com.example.mrb.amazingbattlecreatures;

/**
 * Created by student on 11/03/2016.
 */
public class AnimeRobot extends BattleCreature
{

    private int intAnimeLaserAttackAmount;
    private int intAnimeShieldAmount;

    public AnimeRobot (String strName_PARAM,
                       int intHitPoints_PARAM,
                       int intDefenceRating_PARAM,
                       int intOffenceRating_PARAM,
                       int intAnimeLaserAttackAmount_PARAM)

    {
        super(strName_PARAM, intHitPoints_PARAM, intDefenceRating_PARAM, intOffenceRating_PARAM);

        this.intAnimeLaserAttackAmount = intAnimeLaserAttackAmount_PARAM;

    }

    public void AnimeLaserAttack(BattleCreature battlecreatOpponent_PARAM)
    {if(!battlecreatOpponent_PARAM.isDefeated())
    {
        battlecreatOpponent_PARAM.defend(intAnimeLaserAttackAmount);
        strLastAction = strName + " has exacted " + intAnimeLaserAttackAmount + " of laser damage! \n";
    }

        if(battlecreatOpponent_PARAM.isDefeated())
        {
            blnHasWon = true;
        }
        else
        {
            blnHasWon = false;
        }}

}



