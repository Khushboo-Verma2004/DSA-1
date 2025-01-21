public class AvwalKaur_Q4_GasStation {
    public static int gasStation(int[] gas, int[] cost) {
        int totalGas=0, totalCost=0;
        int n=gas.length;
        for(int i=0;i<n;i++) {
            totalGas+=gas[i];
            totalCost+=cost[i];
        }

        if(totalGas<totalCost) return -1;

        // solution exists otherwise
        int currGas=0, startIdx=0;
        for(int i=0;i<n;i++) {
            currGas+=(gas[i]-cost[i]);
            if(currGas<0) {
                // this index can't be the starting index value
                currGas=0;
                startIdx=i+1;
            }
        } 
        return startIdx;
    }
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        if(gasStation(gas, cost)==-1) {
            System.out.println("The entire circuit can't be traversed");
        } else {
            System.out.println("Starting Gas Station's index is: "+gasStation(gas, cost));
        }
    }
}
