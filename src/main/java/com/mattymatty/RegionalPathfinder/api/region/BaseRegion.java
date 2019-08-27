package com.mattymatty.RegionalPathfinder.api.region;

import com.mattymatty.RegionalPathfinder.api.Status;
import com.mattymatty.RegionalPathfinder.api.entity.Entity;
import org.bukkit.Location;

public interface BaseRegion extends Region {

    Status<Location[]> setCorners(Location c1, Location c2);


    Status<Location> setSamplePoint(Location sa);

    Location getSamplePoint();

    Entity setEntity(Entity entity);

    Entity getEntity();

    //a method to redo all the loading,evaluating and verifing
    Status<Location[]> load();

    Status<Location> evaluate();


}
