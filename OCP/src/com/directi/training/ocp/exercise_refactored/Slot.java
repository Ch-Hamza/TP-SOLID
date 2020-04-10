package com.directi.training.ocp.exercise_refactored;

public abstract class Slot {
	
	int resourceId;

    public int allocate();
    public void free();
    public void markSlotBusy();
    public void markSlotFree();
}