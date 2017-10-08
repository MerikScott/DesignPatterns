package Adapter;

import java.util.Random;

public class WizardAdapter implements Fightable {
    Wizard wizard = new Wizard();
    Random random = new Random();

    @Override
    public void attack() {
        if (random.nextInt(2)==1) {
            wizard.castDestructionSpell();
            return;
        } wizard.pauseTime();
    }

    @Override
    public void defend() {
        if (random.nextInt(2)==1) {
            wizard.castProtectionSpell();
            return;
        } wizard.shield();
    }


    @Override
    public void escape() {
        if (random.nextInt(2)==1) {
            wizard.portal();
            return;
        } wizard.justRun();


    }
}
