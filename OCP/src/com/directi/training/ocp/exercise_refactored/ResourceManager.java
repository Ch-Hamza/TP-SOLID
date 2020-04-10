public class ResourceManager {
	
	List<Resource> resources;

	public int allocate(id) {
        this.resources[id].allocate();
    }

    public void free(id) {
        this.resources[id].free();
    }

	public int findFreeSlot()
    {
        return 0;
    }
}