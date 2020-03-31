public class Action {
    String move, buy, look, stop, checkMap;

    /**
     * Default Constructor for Action
     * Change here
     *
     */
    Action(){ }

    /**
     * @param String indicating to move
     * @return true if set
     */
    public boolean move(String move){
        return true;
    }

    /**
     * @param String indicating to buy
     * @return true if set
     */
    public boolean buy(String buy){
        return true;
    }

    /**
     * @param String idicating to look
     * @return true if set
     */
    public boolean look(String look){
        return true;
    }

    /**
     * @param String indicating to stop
     * @return true if set
     */
    public boolean stop(String stop){
        return true;
    }

    /**
     * @param String indicating to check map
     * @return true if set
     */
    public boolean checkMap(String checkMap){
        return true;
    }
}
