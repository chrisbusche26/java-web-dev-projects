package org.launchcode;

public class DVD implements OpticalDisk{
    // TODO: Implement your custom interface.
    public void spinDisk() {
        System.out.println("Disk is spinning");
    }

    public void readData() {
        System.out.println("This message is on a disk.");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
