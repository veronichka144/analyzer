package services;

import model.*;

public class MainService {

    private RtModel rtModel = new RtModel();

    /**
     * Method for getting table
     *
     * @return model of table
     */
    public RtModel getTable() {
        return rtModel;
    }
}
