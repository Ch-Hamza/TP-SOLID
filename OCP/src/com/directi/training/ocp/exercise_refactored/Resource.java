package com.directi.training.ocp.exercise_refactored;

public abstract class Resource {
	
	int resourceId;

    public int allocate() {
        markSlotBusy(this.resourceId);
    }

    public void free() {
        markSlotFree(this.resourceId);
    }

    public abstract void markSlotBusy(int resourceId);
    public abstract void markSlotFree(int resourceId);
}