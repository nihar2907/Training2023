package solid.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */
interface Resource{
    int findFreeSlot();
    void markSlot(int a);
    void markSlotFree(int a);
}

class TIME_SLOT implements Resource{

    @Override
    public int findFreeSlot() {
        return 0;
    }

    @Override
    public void markSlot(int a) {

    }

    @Override
    public void markSlotFree(int a) {

    }
}
class SPACE_SLOT implements Resource{

    @Override
    public int findFreeSlot() {
        return 0;
    }

    @Override
    public void markSlot(int a) {

    }

    @Override
    public void markSlotFree(int a) {

    }
}
public class ResourceAllocator {
    final static private int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resourceType) {
        int resourceId;
        resourceId = resourceType.findFreeSlot();
        resourceType.markSlot(resourceId);
        return resourceId;
    }

    public void free(Resource resourceType, int resourceId) {
        resourceType.markSlotFree(resourceId);

    }

}
