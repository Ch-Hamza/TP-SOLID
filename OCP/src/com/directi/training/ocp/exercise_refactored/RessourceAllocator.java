package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator {

	ResourceManager ResourceManager;

    public int allocate() {
        int id = this.resourceManager.findFreeSlot();
        this.resourceManager.allocate(id);
    }

    public void free(Resource resource) {
        this.resourceManager.free(resource.id);
    }
}