package com.directi.training.ocp.solution;

public abstract class Resource {
    abstract int findFreeSlot();
    abstract void markSlotBusy(int id);
    abstract void markSlotFree(int id);
}
