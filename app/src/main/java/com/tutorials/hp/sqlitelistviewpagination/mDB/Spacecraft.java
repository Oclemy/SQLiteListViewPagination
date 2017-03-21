





package com.tutorials.hp.sqlitelistviewpagination.mDB;

import co.uk.rushorm.core.RushObject;

/**
 * Created by Oclemy on 3/14/2017 for ProgrammingWizards Channel and http://www.camposha.info.
 */
public class Spacecraft extends RushObject {

    private String name,propellant;

    //AN EMPTY CONSTRUCTOR
    public Spacecraft() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPropellant() {
        return propellant;
    }

    public void setPropellant(String propellant) {
        this.propellant = propellant;
    }
}
