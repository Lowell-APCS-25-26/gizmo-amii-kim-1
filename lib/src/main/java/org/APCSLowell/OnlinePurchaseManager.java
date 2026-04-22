package org.APCSLowell;

import java.util.ArrayList;
public class OnlinePurchaseManager {
    /** An ArrayList of purchased Gizmo objects,
     * instantiated in the constructor.
     */
    private ArrayList<Gizmo> purchases;

    /** Returns the number of purchased Gizmo objects that are electronic
     * whose manufacturer is maker, as described in part (a).
     */
    public int countElectronicsByMaker(String maker) {
        /* to be implemented in part (a) */
        for (int i =0; i <purchases.size(); i++) {
            Gizmo g= purchases.get(i);
            if (g.isElectronc() && g.getmaker().equals(maker))
                count ++;
        }
        return count;
       
        for (int i = 0; i <purchases.size()-1; i++) 
            if (purchases.get(i).equals(purchases.get(i+1)))
                return true;
            return false;
        }
    /** Returns true if any pair of adjacent purchased Gizmo objects are
     * equivalent, and false otherwise, as described in part (b).
     */
    public boolean hasAdjacentEqualPair() {
        /* to be implemented in part (b) */

    }
    public OnlinePurchaseManager() {
        purchases = new ArrayList <Gizmo>();
    }
    public void add(Gizmo g) {
        purchases.add(g);
    }
}
