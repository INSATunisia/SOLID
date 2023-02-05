package com.directi.training.ocp.solution;

public class ResourceAllocator
{

    public int allocate(Resource resource)
    {
        int resourceId;
        resourceId = resource.findFreeSlot();
        resource.markSlotBusy(resourceId);

        return resourceId;
    }

    public void free(Resource resource, int resourceId)
    {
        resource.markSlotFree(resourceId);
    }
}
